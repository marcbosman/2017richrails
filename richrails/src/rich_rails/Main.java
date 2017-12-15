package rich_rails;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2,1));
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,1));

		Train t1 = new Train(1, "Thomas De Trein", 250);

		PassengerWagon w1 = new PassengerWagon("Wernard De Wagon", 80);
		StorageWagon w2 = new StorageWagon("Willy De Wagon", 100);

		t1.addComponent(w1);
		t1.addComponent(w2);

		System.out.println(t1.toString());
	}
}
