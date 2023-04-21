package module2.tests;

import java.lang.reflect.Field;

import module1.bin.module1.a.Hello;
import module1.bin.module1.b.Car;




// import module1.c.Util; // not accessible

public class Test {

	public static void main(String[] args) {
		// using module1.a package
		Hello hello = new Hello();
		System.out.println(hello.greet("Dan"));
		// using module1.b package
		Car car = new Car();
		car.drive(80);
		//  using module1.c package doesn't work - needs to be exported
		
		
		try {
			Field speedField = Car.class.getDeclaredField("speed");
			System.out.println(speedField);
			speedField.setAccessible(true);
			System.out.println(speedField.getInt(car));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}