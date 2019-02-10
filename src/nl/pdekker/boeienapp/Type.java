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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gluonhq.maps.MapPoint;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public enum Type implements Predicate<Path>{
	VAST(7, "vast.csv",
			"Actuele vaarwegmarkering (vast)"),
	DRIJVEND(9, "drijvend.csv",
					"Actuele vaarwegmarkering (drijvend)");

	private static final Logger LOGGER = Logger.getLogger(Type.class.getName());
	private static Pattern regexDate = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	private Pattern pDate;
	private String resource;
	private String tagName;
	private int startColumn;

	private Type(int startColumn, String resource, String tagName) {
		this.resource = resource;
		this.tagName = tagName;
		this.startColumn = startColumn;
		pDate = Pattern.compile("(\\d{6}).*" + resource);
	}
	
	public int getColumn() {
		return startColumn;
	}

	public MapPOI parseLine(final String s) throws IllegalArgumentException {
		final String[] values;
		if (s.indexOf('\t') == -1) {
			values = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		} else {
			values = s.split("\t");
		}
		if (values.length <= getColumn() + 6) {
			throw new IllegalArgumentException("file line doesn't have proper format!");
		}
		final String name = values[2];
		final MapPoint pos = parseCoordinate(values[startColumn], values[startColumn + 1]);
		final Image image = ParseIcon(values[startColumn + 6]);
		final Color color = ParseColor(values[startColumn + 6]);
		final Optional<LocalDate> fromDate = ParseDate(values[4] );
		return MapPOI.createBoei(name, image, pos, color, fromDate);
	}

	private static Optional<LocalDate> ParseDate(String date) {
		try {
			return Optional.of(LocalDate.parse(date, formatter));
		}
		catch (DateTimeParseException e) {
			return Optional.empty();
		}
	}
	
	private static MapPoint parseCoordinate(final String north, final String east) {
		return new MapPoint(parseCoordinate(north), parseCoordinate(east));
	}

	private static double parseCoordinate(final String gmsString) {
		final String[] gms = gmsString.split("\\.");
		final double gr = Double.valueOf(gms[0]);
		final double m = Double.valueOf(gms[1]);
		final double s = Double.parseDouble(gms[3]) / 100.0 + Integer.valueOf(gms[2]);
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

	private static Image ParseIcon(final String color) {
		switch (color.replaceAll("\"", "")) {
		case "1": // wit
		case "#": // no color
			return new Image("/UserIcons/131.png");
		case "2": // zwart
			return new Image("/UserIcons/132.png");
		case "3": // rood
			return new Image("/UserIcons/022.png");
		case "3,1": // rood/wit
		case "3,1,3,1": // rood/wit
			return new Image("/UserIcons/109.png");
		case "3,4":
		case "3,4,3":
		case "3,4,3,4":
			return new Image("/UserIcons/101.png");
		case "4": // groen
			return new Image("/UserIcons/014.png");
		case "4,1": // groen/wit
		case "4,1,4,1": // groen/wit
			return new Image("/UserIcons/098.png");
		case "4,3":
		case "4,3,4":
		case "4,3,4,3":
			return new Image("/UserIcons/095.png");
		case "6": // geel
			return new Image("/UserIcons/030.png");
		case "2,6":
			return new Image("/UserIcons/139.png");
		case "6,2":
			return new Image("/UserIcons/089.png");
		case "2,6,2":
			return new Image("/UserIcons/092.png");
		case "6,2,6":
			return new Image("/UserIcons/091.png");
		case "7":
			return new Image("/UserIcons/022.png");
		case "8":
			return new Image("/UserIcons/137.png");
		case "2,1,2,1": // zwart//wit
			return new Image("/UserIcons/132.png");
		default:
			LOGGER.log(Level.INFO, "unkown color: " + color);
			return new Image("/UserIcons/132.png");
		}

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