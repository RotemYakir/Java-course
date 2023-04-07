package carsProject2;

import java.util.Arrays;

public class Highway {

	private int number = 101;
	private final String name;
	Car cars[] = new Car[100];

	public Highway(String name) {
		super();
		this.name = name;
	}

	public void addRandomCars() {
		for (int i = 0; i < ((int) (Math.random() * cars.length + 1)); i++) {
			if (cars[i] == null) {
				cars[i] = new Car(number++, ((int) (Math.random() * 111)));
			}
		}
	}

	public int getAvgSpeed() {
		int sum = 0;
		int count = 0;
		for (Car car : cars) {
			if (car != null) {
				sum += car.getSpeed();
				count++;
			}
		}
		return sum / count;
	}

	public int getMaxSpeed() {
		int max = 0;
		for (Car car : cars) {
			if (car != null) {
				if (car.getSpeed() > max) {
					max = car.getSpeed();
				}
			}
		}
		return max;
	}

	public int getNumOfCars() {
		int sum = 0;
		for (Car car : cars) {
			if (car != null) {
				sum++;
			}
		}
		return sum;
	}

	public String printCarsDetails() {
		return Arrays.toString(cars);
	}

	@Override
	public String toString() {
		return "Highway [number=" + number + ", name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}

	public String getName() {
		return name;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

}
