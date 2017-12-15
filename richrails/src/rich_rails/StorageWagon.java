package rich_rails;

public class StorageWagon extends Component {
	private int storage;

	public StorageWagon(String name, int storage) {
		super(name);
		this.storage = storage;
	}

	public int getStorage() {
		return this.storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String toString() {
		return "StorageWagon: Naam: " + super.getName() + ", storage: " + storage;
	}
}
