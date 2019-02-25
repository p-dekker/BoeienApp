package nl.pdekker.boeienapp.boeienbestand;

import java.util.SortedSet;
import java.util.TreeSet;

import com.gluonhq.maps.MapPoint;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;

public class Vaarwegen {

	public final SortedSet<SelectableVaarweg> list = new TreeSet<SelectableVaarweg>();
	
	public final ObservableSet<String> selection = FXCollections.observableSet();
	
	public void addVaarweg(String vaarweg, MapPoint pos) {
		SelectableVaarweg sv = new SelectableVaarweg(vaarweg, selection);
		if (list.add(sv)) {
			selection.add(sv.origName);
		}
	}
	
	public static class SelectableVaarweg implements Comparable<SelectableVaarweg> {
		private final String name;
		private final String origName;
		private final BooleanProperty selected;
		
		public SelectableVaarweg(String name, ObservableSet<String> selection) {
			this.origName = name;
			this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			this.selected = new SimpleBooleanProperty(true) {
				@Override
				public void set(boolean selected) {
					if (selected) {
						selection.add(origName);
					}
					else {
						selection.remove(origName);
					}
				}
				
			};
		}
		
		@Override
		public String toString() {
			return name;
		}
		
		public BooleanProperty selectedProperty() {
			return selected;
		}

		@Override
		public int compareTo(SelectableVaarweg o) {
			return name.compareTo(o.name);
		}
	}
}
