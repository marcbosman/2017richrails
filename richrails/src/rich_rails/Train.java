package rich_rails;

import java.util.ArrayList;

public class Train {
	private int train_id;
	private String name;
	private int amountOfSeats;
	
	public Train(int train_id, String name, int amountOfSeats) {
		this.train_id = train_id;
		this.name = name;
		this.amountOfSeats = amountOfSeats;
	}
	
	public int getTrainId(){
		return this.train_id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAmountOfSeats(){
		return this.amountOfSeats;
	}
}
