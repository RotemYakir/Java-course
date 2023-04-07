package constants;

import java.util.Arrays;
import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {

		// get an array of all enum constants
		CarColor[] colors = CarColor.values();
		System.out.println(Arrays.toString(colors));

		// convert a string to enum instance
		CarColor color = CarColor.valueOf("GREEN");
		System.out.println(color);

		// convert a string to enum instance when getting it as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color: " + Arrays.toString(colors));
		Car4.Color clr = Car4.Color.valueOf(sc.nextLine());
		sc.close();
		Car4 car = new Car4(clr);
		System.out.println(car.getColor());
		
		
		
		
	}

}
