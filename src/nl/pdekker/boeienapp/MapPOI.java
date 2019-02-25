package nl.pdekker.boeienapp;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;

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
import nl.pdekker.boeienapp.boeienbestand.Vaarwegen;

public class MapPOI extends Group {
	
	private final ImageView imageView;
	private final Node dot;
	private final Label label;
	private final Optional<LocalDate> fromDate;
	public final Optional<String> vaarwater;
	public final MapPoint pos;
	
	public static enum POIShape {
		CIRCLE, TRIANGLE;
	}
	
	public static MapPOI createBoei(String name, Image image, MapPoint pos, Color color,
			Optional<LocalDate> fromDate, Optional<String> vaarwater) {
		return create(name, image, pos, color,  POIShape.CIRCLE, fromDate, vaarwater);
	}
	
	public static MapPOI createNoticeToSkipper(String name, Image image, MapPoint pos) {
		return create(name, image, pos, Color.RED,  POIShape.TRIANGLE, Optional.empty(), Optional.empty());
	}
	
	private static MapPOI create(String name, Image image, MapPoint pos, Color color, POIShape shape, Optional<LocalDate> fromDate, Optional<String> vaarwater) {
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
		tt.setWrapText(true);
		tt.setPrefWidth(200);
		Tooltip.install(d, tt);
		Tooltip.install(v, tt);
		return new MapPOI(l, v, d , pos, fromDate, vaarwater);
	}
	
	private MapPOI(Label name, ImageView imageView, Node dot, MapPoint pos, Optional<LocalDate> fromDate, Optional<String> vaarwater) {
		super(imageView, name, dot);
		this.imageView = imageView;
		this.label = name;
		this.dot = dot;
		this.pos = pos;
		this.fromDate = fromDate;
		this.vaarwater = vaarwater;
	}
	
	public boolean isTooOld(boolean fromDataSelected, LocalDate fromDateGui) {
		if (fromDataSelected) {
			return fromDate.map( d -> d.isBefore(fromDateGui)).orElse(false);
		}
		return false;
	}
	
	public boolean isVaarwaterNotSelected(Vaarwegen vaarwegen) {
		return vaarwater.map(v -> !vaarwegen.selection.contains(v)).orElse(false);
	}
	
	public void setHidden(boolean hidden) {
		double opacity = hidden ? 0.4 : 1.0;
		getChildren().forEach(c -> c.setOpacity(opacity));
	}
	
	public void hideWhenNotInVaarwater(Set<String> set) {
		boolean inVaarwater = vaarwater.isPresent() && set.contains(vaarwater.get());
		double opacity = inVaarwater ? 0.4 : 1.0;
		getChildren().forEach(c -> c.setOpacity(opacity));
	}
	
	public void viewAsDot() {
		imageView.setVisible(false);
		label.setVisible(false);
		dot.setVisible(true);
	}
	
	public void viewImage(double zoom) {
		imageView.setVisible(true);
		scaleImage(zoom);
		label.setVisible(false);
		dot.setVisible(false);
	}
	
	private void scaleImage(double zoom) {
		imageView.setScaleX(zoom);
		imageView.setScaleY(zoom);
	}
	public void viewImageAndlabel() {
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