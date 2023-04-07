package carsProject2;

public class Country {

	private final String name;
	Highway highways[] = new Highway[5];

	public Country(String name) {
		super();
		this.name = name;
	}

	public Highway[] getHighways() {
		return highways;
	}

	public void addHighway(Highway highway) {
		for (int i = 0; i < highways.length; i++) {
			if (highways[i] == null) {
				highways[i] = highway;
				break;
			}
		}
	}

	public int getNumOfCars() {
		int sum = 0;
		for (Highway highway : highways) {
			if (highway != null) {
				sum += highway.getNumOfCars();
			}
		}
		return sum;
	}

	public int getMaxSpeed() {
		int max = 0;
		for (Highway highway : highways) {
			for (Car car : highway.cars) {
				if (car != null) {
					if (car.getSpeed() > max) {
						max = car.getSpeed();
					}
				}
			}
		}
		return max;
	}

	public int getAvgSpeed() {
		int sum = 0;
		int count = 0;
		for (Highway highway : highways) {
			for (Car car : highway.cars) {
				if (car != null) {
					sum += car.getSpeed();
					count++;
				}
			}
		}
		return sum / count;
	}

	public String getHighestAvgSpeedHighway() {
		int curr=0;
		String name = null;
		for (Highway highway : highways) {
			if (highway != null) {
				if (highway.getAvgSpeed() > curr) {
					name=highway.getName();
					curr=highway.getAvgSpeed();
				}
			}
		}
		return name;
	}

	public String getBusiestHighway() {
		Highway curr = new Highway("curr");
		for (Highway highway : highways) {
			if (highway != null) {
				if (highway.getNumOfCars() > curr.getNumOfCars()) {
					curr = highway;
				}
			}
		}
		return curr.getName();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", highways=" + highways[0].getName() + " , " + highways[1].getName() + " , "
				+ highways[2].getName() + " , " + highways[3].getName() + " , " + highways[4].getName() + "]";
	}

}
