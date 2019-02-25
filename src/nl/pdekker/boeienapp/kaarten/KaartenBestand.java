package nl.pdekker.boeienapp.kaarten;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.gluonhq.maps.MapPoint;

import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeItem;
import nl.pdekker.boeienapp.CoordinateUtils;

public class KaartenBestand {
	private static final Logger LOGGER = Logger.getLogger(KaartenBestand.class.getName());

	public final List<KaartenSet> kaarten = new ArrayList<>();

	public KaartenBestand() {

		URL file = this.getClass().getResource("/" + "KaartenData.txt");
		try (Scanner scanner = new Scanner(file.openStream())) {
			
			Deque<KaartenSet> stack = new ArrayDeque<KaartenSet>();
			
			while (scanner.hasNextLine()) {
				final String line = scanner.nextLine();
				LOGGER.fine(line);
				String[] parts = line.split("\t");
				int level = parseLevel(parts);
				if (level > stack.size()) {
					throw new ParseException("Too many indents " + line, 0);
				}
				KaartItem item = parseItem(parts, level);
				while (stack.size() > level) {
					stack.removeLast();
				}
				if (item instanceof KaartenSet) {
					KaartenSet ks = (KaartenSet) item;
					if (stack.isEmpty()) {
						kaarten.add(ks);
					}
					else {
						stack.getLast().addKaartenSet(ks);
					}
					stack.addLast(ks);
				}
				if (item instanceof Kaart) {
					Kaart k = (Kaart) item;
					stack.getLast().addKaart(k);
				}
			}
		} catch (IOException e) {
			LOGGER.severe("Can't read \"kaartenData.txt\"");
		} catch (ParseException e) {
			LOGGER.severe(e.getMessage());
		}

	}

	private KaartItem parseItem(String[] parts, int level) throws ParseException {
		if (parts.length == level + 1) {
				return new KaartenSet(parts[level]);
		}
		if (parts.length == level + 5) {
			String name = parts[level++];
			MapPoint topLeft = CoordinateUtils.parse(parts[level++], parts[level++]);
			MapPoint bottomRight = CoordinateUtils.parse(parts[level++], parts[level++]);
			return new Kaart(name, topLeft, bottomRight);
		}
		throw new ParseException("Invalid line in kaarten data, found : " + parts.length + "parts" , 0);
	}

	private int parseLevel(String[] parts) throws ParseException {
		for (int i = 0; i < parts.length; i++) {
			if (!parts[i].trim().isEmpty()) {
				return i;
			}
		}
		throw new ParseException("Invalid line in KaartenData no name found in line", 0);
	}

	public List<Kaart> asList() {
		List<Kaart> list = new ArrayList<>();
		for (KaartenSet s : kaarten) {
			addToList(list, s);
		}
		return list;
	}

	private void addToList(List<Kaart> list, KaartenSet set) {
		for (Kaart k : set.kaarten) {
			list.add(k);
		}

		for (KaartenSet s : set.kaartenSet) {
			addToList(list, s);
		}
	}

	public CheckBoxTreeItem<String> asTree() {
		CheckBoxTreeItem<String> root = new CheckBoxTreeItem<>("Kaarten");
		root.setExpanded(true);
		for (KaartenSet s : kaarten) {
			addToTree(root, s);
		}
		return root;
	}

	public void addToTree(TreeItem<String> node, KaartenSet set) {
		CheckBoxTreeItem<String> t = new CheckBoxTreeItem<>(set.getName());
		node.getChildren().add(t);

		for (Kaart k : set.kaarten) {
			t.getChildren().add(new CheckBoxTreeItem<String>(k.getName()));
		}

		for (KaartenSet s : set.kaartenSet) {
			addToTree(t, s);
		}
	}

}
