package rich_rails;

import java.util.ArrayList;

public class Train {
	private int train_id;
	private String name;
	private int amountOfSeats;

	private ArrayList<Component> components;

	public Train(int train_id, String name, int amountOfSeats) {
		this.train_id = train_id;
		this.name = name;
		this.amountOfSeats = amountOfSeats;
		components = new ArrayList<>();
	}

	public void addComponent(Component c) {
		components.add(c);
	}

	public ArrayList<Component> getComponents() {
		return this.components;
	}

	public void deleteComponent(Component c) {
		components.remove(c);
	}

	public int getTrainId() {
		return this.train_id;
	}

	public String getName() {
		return this.name;
	}

	public int getAmountOfSeats() {
		return this.amountOfSeats;
	}

	public String toString() {
		String text;
		if (components != null) {
			text = "Deze trein: " + name + ", bevat de componenten: ";
			for (Component c : components) {
				text += "\n" + c.toString();
			}
		} else {
			text = "Deze trein: " + name + ", bevat geen componenten";
		}
		return text;
	}
}
