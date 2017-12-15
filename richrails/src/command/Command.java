package command;

import rich_rails.Main;

public abstract class Command {
	protected String cmd;
	
	public Command()
	{
		this.cmd = "";
	}
	
	public Command(String c)
	{
		this();
		this.setCommand(c);
	}
	
	public String getCommand()
	{
		return cmd;
	}
	
	public void setCommand(String c)
	{
		this.cmd = c;
	}
	
	public abstract void execute(Main m);


}
