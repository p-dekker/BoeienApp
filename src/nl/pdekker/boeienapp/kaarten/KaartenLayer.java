package nl.pdekker.boeienapp.kaarten;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.gluonhq.impl.maps.BaseMap;
import com.gluonhq.maps.MapLayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class KaartenLayer extends MapLayer {

	private static final Logger LOGGER = Logger.getLogger(KaartenLayer.class.getName());

	private final ObservableList<Kaart> kaarten = FXCollections.observableArrayList();
	private List<Rectangle> kaartenFrame = new ArrayList<>();

	private KaartenLayer(List<Kaart> kaarten) {
		
		for (Kaart k : kaarten) {
			this.kaarten.add(k);
			Rectangle r = new Rectangle(1,1);
			r.setFill(Color.TRANSPARENT);
			r.setStroke(Color.GREY);
			r.setStrokeWidth(1);
			kaartenFrame.add(r);
			this.getChildren().add(r);
		}
//		this.markDirty();
		LOGGER.log(Level.INFO, "found " + kaarten.size() + " kaarten in file");
	}

	public static KaartenLayer createInstance(List<Kaart> kaarten) {
		return new KaartenLayer(kaarten);
	}

	@Override
	public void layoutLayer() {
		int index = 0;
		for (Rectangle r : kaartenFrame) {
			Kaart k = kaarten.get(index++);
			Point2D p = asRect(k, baseMap);
			r.setWidth(p.getX());
			r.setHeight(p.getY());
			
			Point2D mapPoint = baseMap.getMapPoint(k.topLeft.getLatitude(), k.topLeft.getLongitude());
			
			r.setTranslateX(mapPoint.getX());
			r.setTranslateY(mapPoint.getY());
		}
	}

	private Point2D asRect(Kaart kaart, BaseMap baseMap) {
		Point2D topLeft = baseMap.getMapPoint(kaart.topLeft.getLatitude(), kaart.topLeft.getLongitude());
		Point2D bottomRight = baseMap.getMapPoint(kaart.bottomRight.getLatitude(), kaart.bottomRight.getLongitude());
		return new Point2D(bottomRight.getX() - topLeft.getX(), bottomRight.getY() - topLeft.getY());
	}

}
