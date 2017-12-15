package command;

import rich_rails.Main;

public class addWagonCommand extends Command {

	private String wName;

	public String getWagon(){ 
		return wName; 
	}
	
	public void setWagon(String w){
		this.wName = w;
	}

	@Override
	public void execute(Main m) {
		
	}
}