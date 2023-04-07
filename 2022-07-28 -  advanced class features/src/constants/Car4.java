package constants;

public class Car4 {

	public enum Color {
		RED, GREEN, BLUE;
	}

	private Color color;

	public Car4(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static void main(String[] args) {

		Car4 car1 = new Car4(Color.GREEN);
		// car1 car2 = new Car3(200);
		// Car3 car2 = new Car3(BLUE);
		
		System.out.println("the color of the car is: "+car1.getColor());

	}

}
