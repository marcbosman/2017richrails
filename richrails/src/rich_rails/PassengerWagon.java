package rich_rails;

public class PassengerWagon extends Component {
	private int seats;

	public PassengerWagon(String name, int seats) {
		super(name);
		this.seats = seats;
	}

	public int getSeats() {
		return this.seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String toString() {
		return "PassengerWagon: Naam: " + super.getName() + ", seats: " + seats;
	}
}
