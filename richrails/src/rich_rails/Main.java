package rich_rails;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Train t1 = new Train(1, "Thomas De Trein", 250);

		Wagon w1 = new Wagon("Wernard De Wagon", 80, "Passagierswagon");

		t1.addComponent(w1);

		System.out.println(t1.toString());
	}
}
