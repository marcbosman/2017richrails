package rich_rails;

import java.util.ArrayList;
import java.util.Scanner;

import command.addTrainCommand;

public class Main {
	public static void main(String[] args) {
		addTrainCommand atc = new addTrainCommand();
		ArrayList<Train> allTrains = new ArrayList<>();
		
		/*JFrame frame = new JFrame();
		frame.setTitle("RichRails");
		frame.setLayout(new GridLayout(2,1));
		frame.setSize(1024,720);
		frame.setVisible(false);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,1));
		
		TrainUI ui1 = new TrainUI();
		p1.add(ui1);*/

		Train t1 = new Train("thomas");

		PassengerWagon w1 = new PassengerWagon("wernard", 80);
		StorageWagon w2 = new StorageWagon("willy", 100);

		t1.addComponent(w1);
		t1.addComponent(w2);
		
		allTrains.add(t1);

		System.out.println(t1.toString());
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("Typ hier je commando: ");
			String s = input.nextLine().toLowerCase();
			String[] sub = s.split(" ");
			
			switch (sub[0]) {
	        case "new":
	            System.out.println("New commando");
	            if (sub[1].equals("train") && sub.length >= 3) {
	            	allTrains.add(new Train(sub[2]));
	            	atc.execute(sub[2]); // Naam meegeven
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
}
