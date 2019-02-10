package nl.pdekker.boeienapp;

import java.time.LocalDate;
import java.util.Optional;

import com.gluonhq.impl.maps.BaseMap;
import com.gluonhq.maps.MapPoint;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class MapPOI extends Group {
	
	private final ImageView imageView;
	private final Node dot;
	private final Label label;
	private final Optional<LocalDate> fromDate;
	final MapPoint pos;
	
	public static enum POIShape {
		CIRCLE, TRIANGLE;
	}
	
	public static MapPOI createBoei(String name, Image image, MapPoint pos, Color color,
			Optional<LocalDate> fromDate) {
		return create(name, image, pos, color,  POIShape.CIRCLE, fromDate);
	}
	
	public static MapPOI createNoticeToSkipper(String name, Image image, MapPoint pos) {
		return create(name, image, pos, Color.RED,  POIShape.TRIANGLE, Optional.empty());
	}
	
	private static MapPOI create(String name, Image image, MapPoint pos, Color color, POIShape shape, Optional<LocalDate> fromDate) {
		ImageView v = new ImageView(image);
		Label l = new Label(name);
		Node d; 
		switch (shape) {
		case CIRCLE:
			d = new Circle(1,color);
			break;
		case TRIANGLE:
		default:
			Shape s = new Polygon(0.0, -3.0, -3.0, 3.0, 3.0, 3.0);
			s.setFill(color);
			d = s;
			break;
		}
		Tooltip tt = new Tooltip(name);
		Tooltip.install(d, tt);
		Tooltip.install(v, tt);
		return new MapPOI(l, v, d , pos, fromDate);
	}
	
	private MapPOI(Label name, ImageView imageView, Node dot, MapPoint pos, Optional<LocalDate> fromDate) {
		super(imageView, name, dot);
		this.imageView = imageView;
		this.label = name;
		this.dot = dot;
		this.pos = pos;
		this.fromDate = fromDate;
	}
	
	void hideWhenOlder(LocalDate fromDateGui) {
		boolean older = fromDate.isPresent() && fromDate.get().isBefore(fromDateGui);
		double opacity = older ? 0.4 : 1.0;
		getChildren().forEach(c -> c.setOpacity(opacity));
	}
	void viewAsDot() {
		imageView.setVisible(false);
		label.setVisible(false);
		dot.setVisible(true);
	}
	
	void viewImage(double zoom) {
		imageView.setVisible(true);
		scaleImage(zoom);
		label.setVisible(false);
		dot.setVisible(false);
	}
	
	private void scaleImage(double zoom) {
		imageView.setScaleX(zoom);
		imageView.setScaleY(zoom);
	}
	void viewImageAndlabel() {
		imageView.setVisible(true);
		scaleImage(1.0);
		label.setVisible(true);
		dot.setVisible(false);
	}
	
	public void translateXY(BaseMap baseMap) {
		Point2D mapPoint = baseMap.getMapPoint(pos.getLatitude(), pos.getLongitude());
		if (imageView.isVisible()) {
			setTranslateX(mapPoint.getX()- (imageView.getBoundsInParent().getWidth() /2 ));
			setTranslateY(mapPoint.getY() - (imageView.getBoundsInParent().getHeight() /2));
		}
		else {
			setTranslateX(mapPoint.getX());
			setTranslateY(mapPoint.getY());
		}
	}

	
}