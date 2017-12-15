package rich_rails;

import java.util.ArrayList;

public class Controller {
	ArrayList<Train> allTrains = new ArrayList<>();
	ArrayList<Component> allComponents = new ArrayList<>();
	
	public ArrayList<Train> getAllTrains() {
		return allTrains;
	}
	public void setAllTrains(ArrayList<Train> allTrains) {
		this.allTrains = allTrains;
	}
	public ArrayList<Component> getAllComponents() {
		return allComponents;
	}
	public void setAllComponents(ArrayList<Component> allComponents) {
		this.allComponents = allComponents;
	}
	
	
}
