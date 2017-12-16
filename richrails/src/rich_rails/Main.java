package rich_rails;

import java.util.ArrayList;
import java.util.Scanner;

import command.addTrainCommand;

public class Main {
	public static void main(String[] args) {
		Controller con = new Controller();
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
		
		con.doCommand("new train thomas");
		con.doCommand("new pwagon wernard 80");
		con.doCommand("new swagon willy 100");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("Typ hier je commando: ");
			String s = input.nextLine().toLowerCase();
			con.doCommand(s);
		}
	}
}
