package rich_rails;

public class Wagon extends Component {
	private int seats;
	private String type;

	public Wagon(String name, int seats, String type) {
		super(name);
		this.seats = seats;
		this.type = type;
	}

	public int getSeats() {
		return this.seats;
	}

	public String getType() {
		return this.type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Wagon: Naam: " + super.getName();
	}
}
