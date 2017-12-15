package command;

import rich_rails.Train;
import rich_rails.Main;

public class addTrainCommand {
	
	private String tName;

	public void execute(String name) {
		allTrains.add(new Train(name));
	}

	public void setTrain(String t) {
		this.tName = t;
	}

	public String getTrain() {
		return tName;
	}

}
