package rich_rails;

import java.util.ArrayList;

public class Controller {
	ArrayList<Train> allTrains = new ArrayList<>();
	ArrayList<Component> allComponents = new ArrayList<>();

	public ArrayList<Train> getAllTrains() {
		return allTrains;
	}

	public void addTrain(Train t) {
		allTrains.add(t);
	}

	public void deleteTrain(Train t) {
		allTrains.remove(t);
	}

	public ArrayList<Component> getAllComponents() {
		return allComponents;
	}

	public void addComponent(Component c) {
		allComponents.add(c);
	}

	public void deleteComponent(Component c) {
		allComponents.remove(c);
	}
	
	public void doCommand(String s) {
		String[] sub = s.split(" ");
		
		switch (sub[0]) {
        case "new":
            System.out.println("New commando");
            if (sub[1].equals("train") && sub.length >= 3) {
            	allTrains.add(new Train(sub[2]));
            } else if (sub[1].equals("pwagon") && sub.length >= 4) {
            	allComponents.add(new PassengerWagon(sub[2], Integer.parseInt(sub[3])));
            } else if (sub[1].equals("swagon") && sub.length >= 4) {
            	allComponents.add(new StorageWagon(sub[2], Integer.parseInt(sub[3])));
            }
            break;
        case "delete":
        	System.out.println("Delete commando");
        	int i = 0;
        	for (Train t : allTrains) {
        		if (t.getName().equals(sub[1])) {
        			allTrains.remove(i);
        			break;
        		}
        		i++;
        	}
        	break;
        case "get":
        	System.out.println("Get commando");
        	if (sub.length >= 2) {
        		for (Train t : allTrains) {
        			if (t.getName().equals(sub[1])) {
        				System.out.println(t);
        			}
        		}
        	} else {
        		for (Train t : allTrains) {
        			System.out.println(t);
        		}
        	}
        	break;
        default:
            System.out.println("Dit is geen commando");
		}
	}
}
