package nl.pdekker.boeienapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoeienLayer extends MapLayer {

	private static final Logger LOGGER = Logger.getLogger(BoeienLayer.class.getName());

	private final ObservableList<MapPOI> boeien = FXCollections.observableArrayList();
	private final double centerLat;
	private final double centerLong;

	private final ObjectProperty<LocalDate> fromDate;
    
	private BoeienLayer(final List<MapPOI> boeien) {
		for (final MapPOI boei : boeien) {
			this.boeien.add(boei);
			this.getChildren().add(boei);
		}
		this.markDirty();
		
		centerLat = boeien.stream().mapToDouble(b -> b.pos.getLatitude()).average().orElse(0);
		centerLong = boeien.stream().mapToDouble(b -> b.pos.getLongitude()).average().orElse(0);
		fromDate = new SimpleObjectProperty<>();
		fromDate.addListener(c -> BoeienLayer.this.markDirty());
		
		LOGGER.log(Level.INFO, "found " + boeien.size() + " boeien in file");
	}

	public ObjectProperty<LocalDate> fromDate() {
		return fromDate;
	}
	
	@Override
	public void layoutLayer() {
		final boolean showLabel = baseMap.zoom().get() > 15.0;
		final boolean showAsDot = baseMap.zoom().get() < 10.0;
		
		for (final MapPOI boei : boeien) {
			if (showLabel) {
				boei.viewImageAndlabel();
			} else if (showAsDot) {
				boei.viewAsDot();
			} else {
				final double zoom = (baseMap.zoom().get() / 10.0) - 0.5;
				boei.viewImage(zoom);
			}
			boei.hideWhenOlder(fromDate.get());
			boei.translateXY(baseMap);
		}
	}

	public static BoeienLayer createInstance(final Type type, final URL url) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))
				.lines()) {

			return new BoeienLayer(lines.skip(1).map(line -> type.parseLine(line)).collect(Collectors.toList()));
		} catch (final IOException e) {
			LOGGER.log(Level.SEVERE, "Error reading boeien file: " + url.toString(), e);
		} catch (final IllegalArgumentException e) {
			LOGGER.log(Level.SEVERE, "Wrong format of boeien file : " + url.toString(), e);
		}
		return new BoeienLayer(Collections.emptyList());
	}

	public MapPoint getCenter() {
		return new MapPoint(centerLat, centerLong);
	}

	
}
