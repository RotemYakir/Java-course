package nestedClassesDemo;

public class State {
	private String name;
	private int population;

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public State(String name) {
		super();
		this.name = name;
	}

	// nested class
	public class Citizen {
		private String name;
		private int age;

		public Citizen(String name) {
			super();
			this.name = name;
			population++;
		}

		public String getName() {
			return name; // citizen name
		}

		public String getStateName() {
			return State.this.name; // state name
		}
	}

	// static nested class
	public static class Flag {
		private String color;

		private Flag(String color) {
			this.color = color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		// dynamic method
		// in dynamic methods there is always a "this" reference
		public void f1() {
			System.out.println(this);
		}

		// static method
		// in static methods there is no "this" reference
		public static void f2() {
			// System.out.println(this);

		}
	}
}
