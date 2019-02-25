package nl.pdekker.boeienapp.boeienbestand;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.SetChangeListener;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import nl.pdekker.boeienapp.MapPOI;

public class BoeienLayer extends MapLayer {

	private static final Logger LOGGER = Logger.getLogger(BoeienLayer.class.getName());

	private final ObservableList<MapPOI> boeien = FXCollections.observableArrayList();
	private final double centerLat;
	private final double centerLong;

	private final ObjectProperty<LocalDate> fromDate;
	private final BooleanProperty fromDateSelected;
	private final Vaarwegen vaarwegen;

	private BoeienLayer(final List<MapPOI> boeien, Vaarwegen vaarwegen) {
		for (final MapPOI boei : boeien) {
			this.boeien.add(boei);
			boei.vaarwater.ifPresent(b -> vaarwegen.addVaarweg(b,boei.pos) );
			this.getChildren().add(boei);
		}
		this.markDirty();

		centerLat = boeien.stream().mapToDouble(b -> b.pos.getLatitude()).average().orElse(0);
		centerLong = boeien.stream().mapToDouble(b -> b.pos.getLongitude()).average().orElse(0);
	
		fromDate = new SimpleObjectProperty<>();
		fromDate.addListener(c -> BoeienLayer.this.markDirty());
		fromDateSelected = new SimpleBooleanProperty();
		fromDateSelected.addListener(c-> BoeienLayer.this.markDirty());
		
		this.vaarwegen = vaarwegen;
		vaarwegen.selection.addListener((SetChangeListener<String>) c -> BoeienLayer.this.markDirty());
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
			
			boolean hidden = boei.isTooOld(fromDateSelected.get(), fromDate.get()) || boei.isVaarwaterNotSelected(vaarwegen);
			boei.setHidden(hidden);
			boei.translateXY(baseMap);
		}
	}

	public static BoeienLayer createInstance(final RWSBestand type, final URL url, Vaarwegen vaarwegen) {
		return new BoeienLayer(type.readURL(url), vaarwegen);
	}

	public MapPoint getCenter() {
		return new MapPoint(centerLat, centerLong);
	}

	public void bind(DatePicker datePicker, CheckBox boeienVanaf) {
		fromDate.bind(datePicker.valueProperty());
		fromDateSelected.bind(boeienVanaf.selectedProperty());
	}

}
