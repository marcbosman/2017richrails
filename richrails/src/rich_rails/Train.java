package rich_rails;

import java.util.ArrayList;

public class Train {
	private String name;

	private ArrayList<Component> components;

	public Train(String name) {
		this.name = name;
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

	public String getName() {
		return this.name;
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
