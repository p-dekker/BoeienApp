package nl.pdekker.boeienapp;

import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisProperties;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import nl.pdekker.boeienapp.MapPOI.POIShape;
import nl.pdekker.nts._3_0.Ftm_type;
import nl.pdekker.nts._3_0.RIS_Message_Type;
import nl.pdekker.nts._3_0.Validity_period_type;
import nl.pdekker.nts_ms_1_0_3_0.Get_messages_query;
import nl.pdekker.nts_ms_1_0_3_0.Get_messages_result;
import nl.pdekker.nts_ms_1_0_3_0.Message_type_type;
import nl.pdekker.nts_ms_1_0_3_0.NtS_message_service;
import nl.pdekker.nts_ms_1_0_3_0.NtS_message_service_serviceLocator;

public class NtMsgLayer_1_0_3_0 extends MapLayer {

	private static final Logger LOGGER = Logger.getLogger(NtMsgLayer_1_0_3_0.class.getName());

	static {
		AxisProperties.getProperties().put("proxySet","true");

	    AxisProperties.setProperty("http.proxyHost", "chaos"); 
	    AxisProperties.setProperty("http.proxyPort", "3128"); 
	}
	
	private final ObservableList<MapPOI> messages = FXCollections.observableArrayList();
	private final double centerLat;
	private final double centerLong;

	private NtMsgLayer_1_0_3_0(List<MapPOI> messages) {
		for (MapPOI msg : messages) {
			this.messages.add(msg);
			this.getChildren().add(msg);
		}
		this.markDirty();
		centerLat = messages.stream().mapToDouble(b -> b.pos.getLatitude()).average().orElse(0);
		centerLong = messages.stream().mapToDouble(b -> b.pos.getLongitude()).average().orElse(0);

		LOGGER.log(Level.INFO, "found " + messages.size() + " messages recieved");
	}

	@Override
	public void layoutLayer() {
		boolean showLabel = baseMap.zoom().get() > 14.0;
		boolean showAsDot = baseMap.zoom().get() < 10.0;
		
		for (MapPOI boei : messages) {
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

	public static NtMsgLayer_1_0_3_0 createInstance(URL url) {
		List<MapPOI> msgList = new ArrayList<>();
		Image icon = new Image("/UserIcons/warning.png");
		NtS_message_service_serviceLocator locator = new NtS_message_service_serviceLocator();
			try {
			NtS_message_service service = locator.getNtS_message_service(url);
			Validity_period_type from = new Validity_period_type(new Date(2018,5,1), new Date(System.currentTimeMillis()));
			Get_messages_query query = new Get_messages_query(Message_type_type.FTM, null, from, null,null);
			Get_messages_result msgs = service.get_messages(query);
			for (RIS_Message_Type type : msgs.getResult_message()) {
				for (Ftm_type ftm : type.getFtm()) {
					
					String label = ftm.getContents();
					Optional<MapPoint> pos = getPosition(ftm);
					if (pos.isPresent()) {
						MapPOI msg = MapPOI.create(label, icon, pos.get(), Color.RED, POIShape.TRIANGLE);
						msgList.add(msg);
					}
					
				}
			}
			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		
		return new NtMsgLayer_1_0_3_0(msgList);
	}

	private static Optional<MapPoint> getPosition(Ftm_type ftm) {
		
		return Optional.ofNullable(ftm.getFairway_section())
				.map(f -> f[0])
				.map(f -> f.getGeo_object())
				.map(g -> g.getCoordinate(0))
				.map(c -> parseCoordinate(c.getLat(), c.get_long()));
	}
	

	public MapPoint getCenter() {
		return new MapPoint(centerLat, centerLong);
	}

	private static MapPoint parseCoordinate(String north, String east) {
		return new MapPoint(parseCoordinate(north), parseCoordinate(east));
	}

	private static double parseCoordinate(String gmsString) {
		String[] gms = gmsString.split(" ");
		double gr = Double.valueOf(gms[0]);
		double m = Double.valueOf(gms[1]);
		return gr + (m / 60.0);
	}

//	public static class NtMsg extends Group {
//		
//		private final Node dot;
//		private final MapPoint pos;
//		
//		public static NtMsg create(String name, MapPoint pos) {
//			Node d = new Circle(3, Color.RED);
//			Tooltip tt = new Tooltip(name);
//			Tooltip.install(d, tt);
//			return new NtMsg(d, pos);
//		}
//		
//		private NtMsg(Node dot, MapPoint pos) {
//			super(dot);
//			this.dot = dot;
//			this.pos = pos;
//		}
//		
//		public void viewAsDot() {
//			dot.setVisible(true);
//			dot.setScaleX(1.0);
//			dot.setScaleY(1.0);
//		}
//		
//		public void viewImage() {
//			dot.setScaleX(2.0);
//			dot.setScaleX(2.0);
////			dot.setVisible(false);
//		}
//		
//		public void viewImageAndlabel() {
//			dot.setScaleX(3.0);
//			dot.setScaleX(3.0);
////	
//			dot.setVisible(false);
//		}
//		
//		public void translateXY(BaseMap baseMap) {
//			Point2D mapPoint = baseMap.getMapPoint(pos.getLatitude(), pos.getLongitude());
//			setTranslateX(mapPoint.getX());
//			setTranslateY(mapPoint.getY());
//		}
//	}
}
