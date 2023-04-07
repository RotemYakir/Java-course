package constants;

import javax.swing.JOptionPane;

public class TestEnumNewInput {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("enter color");
		System.out.println(input);

		JOptionPane.showMessageDialog(null, "you chose: " + input);

		
		// convert the input to Color constant and create a car with that color
		Car4 car= new Car4(Car4.Color.valueOf(input));
		System.out.println("the color of the car is: "+car.getColor());
		

	}

}
