package car;

public class App {

	public static void main(String[] args) {
		// Car c = new Car(230,"blue");
		Car c = new Car();

		c.setColor("blue");
		c.setNumber(5909381);
		c.setSpeed(230);

		System.out.println("the speed of the car is: " + c.getSpeed());
		System.out.println("the number of the car is: " + c.getNumber());
		System.out.println("the color of the car is: " + c.getColor());

	}

}
