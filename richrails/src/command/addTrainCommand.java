package command;
import rich_rails.Main;

public class addTrainCommand extends Command {
	
	private String tName;

	@Override
	public void execute(Main m) {
	
	}

	public void setTrain(String t) {
		this.tName = t;
	}

	public String getTrain() {
		return tName;
	}

}
