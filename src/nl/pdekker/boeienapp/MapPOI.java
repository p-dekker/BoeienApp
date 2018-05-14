package nl.pdekker.boeienapp;

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
	final MapPoint pos;
	
	public static enum POIShape {
		CIRCLE, TRIANGLE;
	}
	public static MapPOI create(String name, Image image, MapPoint pos, Color color, POIShape shape) {
		ImageView v = new ImageView(image);
		Label l = new Label(name);
		Node d; 
		switch (shape) {
		case CIRCLE:
			d = new Circle(1,color);
			break;
		case TRIANGLE:
		default:
			Shape s = new Polygon(0.0, -2.0, -2.0, 2.0, 2.0, 2.0);
			s.setFill(color);
			d = s;
			break;
		}
		Tooltip tt = new Tooltip(name);
		Tooltip.install(d, tt);
		Tooltip.install(v, tt);
		return new MapPOI(l, v, d , pos);
	}
	
	private MapPOI(Label name, ImageView imageView, Node dot, MapPoint pos) {
		super(imageView, name, dot);
		this.imageView = imageView;
		this.label = name;
		this.dot = dot;
		this.pos = pos;
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