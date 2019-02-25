package nl.pdekker.boeienapp.boeienbestand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gluonhq.maps.MapPoint;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import nl.pdekker.boeienapp.MapPOI;

public enum RWSBestand implements Predicate<Path> {
	VAST(7, "vast.csv", "Actuele vaarwegmarkering (vast)"), DRIJVEND(9, "drijvend.csv",
			"Actuele vaarwegmarkering (drijvend)");

	private static final Logger LOGGER = Logger.getLogger(RWSBestand.class.getName());
	private static Pattern regexDate = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	private Pattern pDate;
	private String resource;
	private String tagName;
	private int startColumn;
	
	private static Map<String,Image> imageCache = new HashMap<>();
 
	public List<MapPOI> readURL(URL url) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {

			return reader.lines().skip(1).map(l -> parseLine(l)).collect(Collectors.toList());

		} catch (final IOException e) {
			LOGGER.log(Level.SEVERE, "Error reading boeien file: " + url.toString(), e);
		} catch (final IllegalArgumentException e) {
			LOGGER.log(Level.SEVERE, "Wrong format of boeien file : " + url.toString(), e);
		}
		return Collections.emptyList();
	}

	private RWSBestand(int startColumn, String resource, String tagName) {
		this.resource = resource;
		this.tagName = tagName;
		this.startColumn = startColumn;
		pDate = Pattern.compile("(\\d{6,7})_.*" + resource);
	}

	private int getColumn() {
		return startColumn;
	}

	private MapPOI parseLine(final String s) throws IllegalArgumentException {
		final String[] values;
		if (s.indexOf('\t') != -1) {
			values = s.split("\t");
		} else if (s.indexOf(';') != -1) {
			values = s.split(";");
		} else {
			values = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		}
		if (values.length <= getColumn() + 6) {
			throw new IllegalArgumentException("file line doesn't have proper format!");
		}
		final String name = values[2];
		final MapPoint pos = parseCoordinate(values[startColumn], values[startColumn + 1]);
		final Image image = getImage(ParseIcon(values[startColumn + 6]));
		final Color color = ParseColor(values[startColumn + 6]);
		final Optional<LocalDate> fromDate = ParseDate(values[4]);
		String vaarwater = values[0];
		return MapPOI.createBoei(name, image, pos, color, fromDate, Optional.of(vaarwater));
	}

	private static Optional<LocalDate> ParseDate(String date) {
		try {
			return Optional.of(LocalDate.parse(date, formatter));
		} catch (DateTimeParseException e) {
			return Optional.empty();
		}
	}

	private static MapPoint parseCoordinate(final String north, final String east) throws IllegalArgumentException {
		return new MapPoint(parseCoordinate(north), parseCoordinate(east));
	}

	public static double parseCoordinate(final String gmsString) throws IllegalArgumentException {
		final String[] gms = gmsString.split("\\.");

		if (gms.length < 3) {
			throw new IllegalArgumentException(gmsString + "can't be parsed as coordinate");
		}
		final double gr = Double.valueOf(gms[0]);
		final double m = Double.valueOf(gms[1]);
		final double s;
		if (gms.length == 3) {
			s = Double.valueOf(gms[2]);
		} else {
			s = Double.parseDouble(gms[3]) / 100.0 + Integer.valueOf(gms[2]);
		}
		return gr + (m / 60.0) + (s / 3600);
	}

	private static Color ParseColor(final String color) {
		switch (color.replaceAll("\"", "")) {
		case "1": // wit
		case "#": // no color
			return Color.WHITE;
		case "2": // zwart
		case "2,6":
		case "2,6,2":
		case "2,1,2,1": // zwart//wit
			return Color.BLACK;
		case "3": // rood
		case "3,1": // rood/wit
		case "3,1,3,1": // rood/wit
		case "3,4":
		case "3,4,3":
		case "3,4,3,4":
			return Color.RED;
		case "4": // groen
		case "4,1": // groen/wit
		case "4,1,4,1": // groen/wit
		case "4,3":
		case "4,3,4":
		case "4,3,4,3":
			return Color.GREEN;
		case "6": // geel
		case "6,2":
		case "6,2,6":
			return Color.YELLOW;
		case "7":
			return Color.GRAY;
		case "8":
			return Color.BROWN;
		default:
			LOGGER.log(Level.INFO, "unkown color: " + color);
			return Color.PURPLE;
		}

	}
	
	private static Image getImage(final String name) {
		if (!imageCache.containsKey(name)) {
			imageCache.put(name, new Image(name));
		}
		return imageCache.get(name);
	}

	private static String ParseIcon(final String color) {
		switch (color.replaceAll("\"", "")) {
		case "1": // wit
		case "#": // no color
			return "/UserIcons/131.png";
		case "2": // zwart
			return "/UserIcons/132.png";
		case "3": // rood
			return "/UserIcons/022.png";
		case "3,1": // rood/wit
		case "3,1,3,1": // rood/wit
			return "/UserIcons/109.png";
		case "3,4":
		case "3,4,3":
		case "3,4,3,4":
			return "/UserIcons/101.png";
		case "4": // groen
			return "/UserIcons/014.png";
		case "4,1": // groen/wit
		case "4,1,4,1": // groen/wit
			return "/UserIcons/098.png";
		case "4,3":
		case "4,3,4":
		case "4,3,4,3":
			return "/UserIcons/095.png";
		case "6": // geel
			return "/UserIcons/030.png";
		case "2,6":
			return "/UserIcons/139.png";
		case "6,2":
			return "/UserIcons/089.png";
		case "2,6,2":
			return "/UserIcons/092.png";
		case "6,2,6":
			return "/UserIcons/091.png";
		case "7":
			return "/UserIcons/022.png";
		case "8":
			return "/UserIcons/137.png";
		case "2,1,2,1": // zwart//wit
			return "/UserIcons/132.png";
		default:
			LOGGER.log(Level.INFO, "unkown color: " + color);
			return "/UserIcons/132.png";
		}

	}

	public Optional<LocalDate> getDate(Path path) {
		Objects.requireNonNull(path);
		Matcher m = pDate.matcher(path.getFileName().toString());

		if (m.matches()) {
			String yymmdd = m.group(1);
			// FIXME!
			if (yymmdd.startsWith("1900")) {
				yymmdd = yymmdd.replace("1900", "190");
			}
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
			try {
				return Optional.of(LocalDate.parse(yymmdd, dtf));
			} catch (DateTimeParseException pe) {
				BoeienBestanden.LOGGER.severe("Can parse date from filename: " + path.getFileName().toString());
			}
		}
		return Optional.empty();
	}

	public Optional<LocalDate> getRemoteDate(Document document) {
		Elements elements = document.getElementsContainingOwnText(this.tagName);

		for (Element e : elements) {
			Element parent = e.parent();
			for (Element span : parent.getElementsByTag("span")) {
				String text = span.text().trim();
				Matcher m = regexDate.matcher(text);
				if (m.matches()) {
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					return Optional.of(LocalDate.parse(text, dtf));
				}
			}
		}

		return Optional.empty();
	}

	public URL getBundledUrl() {
		return this.getClass().getResource("/" + resource);
	}

	public Optional<URL> getRemoteURL(Document document) {
		Elements elements = document.getElementsContainingOwnText(this.tagName);

		for (Element e : elements) {
			String url = e.attr("href");
			try {
				return Optional.of(new URL(url));
			} catch (MalformedURLException e1) {
			}
		}
		return Optional.empty();
	}

	@Override
	public boolean test(Path t) {
		Objects.requireNonNull(t);
		return pDate.matcher(t.getFileName().toString()).find();
	}

}