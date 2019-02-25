package nl.pdekker.boeienapp.kaarten;

import com.gluonhq.maps.MapPoint;

public class Kaart extends KaartItem{

	MapPoint topLeft;
	MapPoint bottomRight;
	
	public Kaart(String name,  MapPoint topLeft, MapPoint bottomRight) {  //lat , //long
		super(name);
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
}
