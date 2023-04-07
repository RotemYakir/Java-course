package app.core.types;



public class Passenger {
	
	private static int nextId;

	private final int id = ++nextId;
	private String name;
	
	public Passenger(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}
