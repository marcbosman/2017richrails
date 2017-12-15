package ui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import rich_rails.Train;

public class TrainUI extends JPanel{
	ArrayList<Train> allTrains = new ArrayList<>();
	
	public TrainUI() {
		this.setBackground(Color.WHITE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
