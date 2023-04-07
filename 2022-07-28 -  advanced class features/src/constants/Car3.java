package constants;

public class Car3 {

	
	private CarColor color;


	public Car3(CarColor color) {
		super();
		this.color = color;
	}


	public static void main(String[] args) {
		
		Car3 car1 = new Car3(CarColor.GREEN);
		//car1 car2 = new Car3(200);
		//Car3 car2 = new Car3(BLUE);
	
	}
}
