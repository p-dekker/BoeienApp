package nl.pdekker.boeienapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.EnumMap;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.gluonhq.charm.down.Services;
import com.gluonhq.charm.down.plugins.StorageService;

public class BoeienBestanden {

	private final static String URL_DOWNLOAD_PAGE = "https://vaarweginformatie.nl/fdd/main/infra/downloads";
	private final String downloadPageFile = "download.html";
	static final Logger LOGGER = Logger.getLogger(BoeienBestanden.class.getName());

	private final static String APP_DIR = ".boeienApp";
	private final static Pattern filenameInHeader = Pattern.compile(".*filename=\"(.*?)\".*");
	private EnumMap<Type, URL> localFiles = new EnumMap<>(Type.class);

	private final Optional<Path> homeDir;

	private final Proxy proxy;
	
	public BoeienBestanden(Proxy proxy) {
		this.proxy = proxy;
		homeDir = getApplicationHomeDir();
		if (homeDir.isPresent()) {
			try {
				downloadFiles();
			} catch (IOException | ParseException e) {
				LOGGER.severe(e.getMessage());
			}
		}
		useBundledIfNotPresent(Type.DRIJVEND);
		useBundledIfNotPresent(Type.VAST);
		
		LOGGER.info(localFiles.get(Type.VAST).toString());
		LOGGER.info(localFiles.get(Type.DRIJVEND).toString());
	}
	
	private void useBundledIfNotPresent(Type type) {
		if (!localFiles.containsKey(type)) {
			LOGGER.warning("Can't downloaded files, using bundled files instead!");
			localFiles.put(type, type.getBundledUrl());
		}
	}
		
	public URL getUrl(Type type) {
		return localFiles.get(type);
	}

	private void downloadFiles() throws IOException, ParseException {
		LocalDate now = LocalDate.now();
		File downloadpage = new File(homeDir.get().toFile(), downloadPageFile);
		if (downloadpage.exists()) {
			FileTime time = Files.getLastModifiedTime(downloadpage.toPath());
			LocalDate lastDownDate = LocalDate.ofEpochDay(time.to(TimeUnit.DAYS));
			if (lastDownDate.isBefore(now)) {
				downloadRemoteFile(new URL(URL_DOWNLOAD_PAGE), downloadpage);
			}
		} 
		else {
			downloadRemoteFile(new URL(URL_DOWNLOAD_PAGE), downloadpage);
		}
		Document doc = Jsoup.parse(downloadpage, null);
		replaceLocalFileWithRemote(Type.DRIJVEND, doc);
		replaceLocalFileWithRemote(Type.VAST, doc);
	}

	private boolean downloadRemoteFile(URL url, File localFile)  {
		try (ReadableByteChannel rbc = Channels.newChannel(url.openConnection(proxy).getInputStream());
				FileOutputStream fos = new FileOutputStream(localFile)) {
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			return true;
		} catch (IOException e) {
			LOGGER.severe("Error downloading : " + url.toString() + " " + e.getMessage());
		}
		return false;
	}

	private void replaceLocalFileWithRemote(final Type type, Document doc) throws ParseException {
		try {
		Path dir = homeDir.get();
		Optional<Path> local = findCachedFile(type);
		Optional<LocalDate> localDate = getCachedDate(type);

		Optional<LocalDate> remoteDate = type.getRemoteDate(doc);
		Optional<URL> remoteURL = type.getRemoteURL(doc);
		
		if (remoteDate.isPresent() && remoteURL.isPresent()) {
			LocalDate date = remoteDate.get();
			URL url = remoteURL.get();

			if (!localDate.isPresent() || localDate.get().isBefore(date)) {
				// localfile is not present or outdated.
				String content = url.openConnection(proxy).getHeaderField("Content-Disposition");
				Matcher m = filenameInHeader.matcher(content);
				if (!m.matches()) {
					throw new ParseException("Can't parse remote filename: " + content, 0);
				}
				String filename = m.group(1); 
				File localFile = new File(dir.toFile(), filename);
				boolean succes = downloadRemoteFile(url, localFile);
				if (succes && local.isPresent()) {
					Files.delete(local.get());
					localFiles.put(type,localFile.toURI().toURL());
					return;
				}
			}
			if (local.isPresent()) {
				localFiles.put(type, local.get().toUri().toURL());
			}
		}
		} catch ( IOException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	private Optional<LocalDate> getCachedDate(final Type type) {
		return findCachedFile(type).flatMap(type::getDate);
	}

	private Optional<Path> findCachedFile(Type type) {
		return homeDir.flatMap(p -> {
			try {
				return Files.list(p).filter(type).findFirst();
			} catch (IOException e) {
				LOGGER.severe(e.getMessage());
				return Optional.empty();
			}
		});
	}

	private static Optional<Path> getApplicationHomeDir() {
		Optional<Path> path = Services.get(StorageService.class).map(storage -> storage.getPrivateStorage())
				.map(file -> new File(file.get(), APP_DIR)).map(File::toPath);

		if (path.isPresent()) {
			Path p = path.get();
			if (!Files.exists(p)) {
				try {
					Files.createDirectory(p);
				} catch (IOException e) {
					LOGGER.warning(e.getMessage());
					return Optional.empty();
				}
			}
			if (!Files.isReadable(p)) {
				LOGGER.warning("Home dir is not readable!");
				return Optional.empty();
			}
			if (!Files.isWritable(p)) {
				LOGGER.warning("Home dir is not writable can't store downloads");
				return Optional.empty();
			}
		}
		return path;

	}
}
