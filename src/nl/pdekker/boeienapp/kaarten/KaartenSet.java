package nl.pdekker.boeienapp.kaarten;

import java.util.ArrayList;
import java.util.List;

public class KaartenSet extends KaartItem{
	
	public List<Kaart> kaarten = new ArrayList<>();
	public List<KaartenSet> kaartenSet = new ArrayList<>();
	
	public KaartenSet(String name) {
		super(name);
	}
	
	public void addKaartenSet(KaartenSet ks) {
		this.kaartenSet.add(ks);
	}
	
	public void addKaart(Kaart kaart) {
		this.kaarten.add(kaart);
		
	}
	
	
}
