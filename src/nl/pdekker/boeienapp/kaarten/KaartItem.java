package nl.pdekker.boeienapp.kaarten;

public abstract class KaartItem {

	private final String name;
	
	protected KaartItem(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
