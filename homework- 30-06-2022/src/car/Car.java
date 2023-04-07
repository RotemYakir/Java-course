package car;

public class Car {

	private int number;
	private int speed;
	private String color;

	public void setNumber(int number) {
		if (number < 10) {
			this.number = number;
		}
	}

	public int getNumber() {
		return number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	// constructor 1:
	public Car() {

	}

	// constructor 2:
	public Car(int number, String color) {
		setNumber(number);
		setColor(color);

	}

}
