package nl.pdekker.boeienapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public enum Type implements Predicate<Path>{
	VAST(7, "vast.csv",
			"Actuele vaarwegmarkering (vast)"),
	DRIJVEND(9, "drijvend.csv",
					"Actuele vaarwegmarkering (drijvend)");

	private static Pattern regexDate = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
	private Pattern pDate;
	private String resource;
	private String tagName;
	private int column;

	private Type(int column, String resource, String tagName) {
		this.resource = resource;
		this.tagName = tagName;
		this.column = column;
		pDate = Pattern.compile("\\d{6}.*" + resource);
	}
	
	public int getColumn() {
		return column;
	}

	public Optional<LocalDate> getDate(Path path) {
		Objects.requireNonNull(path);
		Matcher m = pDate.matcher(path.getFileName().toString());
		if (m.matches()) {
			String yymmdd = m.group(1);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
			try {
				return Optional.of(LocalDate.parse(yymmdd, dtf));
			} catch (DateTimeParseException pe) {
				BoeienBestanden.LOGGER.severe(pe.getMessage());
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