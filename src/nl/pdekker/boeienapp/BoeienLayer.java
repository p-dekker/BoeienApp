package nl.pdekker.boeienapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import nl.pdekker.boeienapp.MapPOI.POIShape;

public class BoeienLayer extends MapLayer {

	private static final Logger LOGGER = Logger.getLogger(BoeienLayer.class.getName());

	private final ObservableList<MapPOI> boeien = FXCollections.observableArrayList();
	private final double centerLat;
	private final double centerLong;

	private BoeienLayer(List<MapPOI> boeien) {
		for (MapPOI boei : boeien) {
			this.boeien.add(boei);
			this.getChildren().add(boei);
		}
		this.markDirty();
		centerLat = boeien.stream().mapToDouble(b -> b.pos.getLatitude()).average().orElse(0);
		centerLong = boeien.stream().mapToDouble(b -> b.pos.getLongitude()).average().orElse(0);

		LOGGER.log(Level.SEVERE, "found " + boeien.size() + " boeien in file");
	}

	@Override
	public void layoutLayer() {
		boolean showLabel = baseMap.zoom().get() > 15.0;
		boolean showAsDot = baseMap.zoom().get() < 10.0;
		
		for (MapPOI boei : boeien) {
			if (showLabel) {
				boei.viewImageAndlabel();
			}
			else if (showAsDot) {
				boei.viewAsDot();
			}
			else {
				double zoom = (baseMap.zoom().get()/ 10.0) - 0.5;
				boei.viewImage(zoom);
			}
			
			boei.translateXY(baseMap);
		}
	}

	public static BoeienLayer createInstance(final Type type, final URL url) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))
				.lines()) {

			return new BoeienLayer(lines.skip(1).map(line -> parseLine(type, line)).collect(Collectors.toList()));
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error reading boeien file", e);
		}
		return new BoeienLayer(Collections.emptyList());
	}

	private static MapPOI parseLine(Type type, String s) {
		String[] values = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		String name = values[2];
		MapPoint pos = parseCoordinate(values[type.getColumn()], values[type.getColumn() + 1]);
		Image image = ParseIcon(values[type.getColumn() + 6]);
		Color color = ParseColor(values[type.getColumn() + 6]);
		return MapPOI.create(name, image, pos, color, POIShape.CIRCLE);
	}
	
	private static Color ParseColor(String color) {
		switch (color.replaceAll("\"","")) {
		case "1":  //wit
		case "#":  //no color
			return Color.WHITE;
		case "2":  //zwart
		case "2,6":
		case "2,6,2":
		case "2,1,2,1":  //zwart//wit
			return Color.BLACK;
		case "3":  //rood
		case "3,1":  //rood/wit
		case "3,1,3,1":  //rood/wit
		case "3,4":
		case "3,4,3":
		case "3,4,3,4":
			return Color.RED;
		case "4": //groen
		case "4,1": //groen/wit
		case "4,1,4,1": //groen/wit
		case "4,3":
		case "4,3,4":
		case "4,3,4,3":
			return Color.GREEN;
		case "6": //geel	
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
	
	private static Image ParseIcon(String color) {
		switch (color.replaceAll("\"","")) {
		case "1":  //wit
		case "#":  //no color
			return new Image("/UserIcons/131.png");
		case "2":  //zwart
			return new Image("/UserIcons/132.png");
		case "3":  //rood
			return new Image("/UserIcons/022.png");
		case "3,1":  //rood/wit
		case "3,1,3,1":  //rood/wit
			return new Image("/UserIcons/109.png");
		case "3,4":
		case "3,4,3":
		case "3,4,3,4":
			return new Image("/UserIcons/101.png");
		case "4": //groen
			return new Image("/UserIcons/014.png");
		case "4,1": //groen/wit
		case "4,1,4,1": //groen/wit
			return new Image("/UserIcons/098.png");
		case "4,3":
		case "4,3,4":
		case "4,3,4,3":
			return new Image("/UserIcons/095.png");			
		case "6": //geel	
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
		case "2,1,2,1":  //zwart//wit
			return new Image("/UserIcons/132.png");
		default:
			LOGGER.log(Level.INFO, "unkown color: " + color);
			return new Image("/UserIcons/132.png");
		}

	}

	public MapPoint getCenter() {
		return new MapPoint(centerLat, centerLong);
	}

	private static MapPoint parseCoordinate(String north, String east) {
		return new MapPoint(parseCoordinate(north), parseCoordinate(east));
	}

	private static double parseCoordinate(String gmsString) {
		String[] gms = gmsString.split("\\.");
		double gr = Double.valueOf(gms[0]);
		double m = Double.valueOf(gms[1]);
		double s = Double.parseDouble(gms[3]) / 100.0 + Integer.valueOf(gms[2]);
		return gr + (m / 60.0) + (s / 3600);
	}
}