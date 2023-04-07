package lab2;

public class Number1 {

	public static void main(String[] args) {

		int number = (int) (1+Math.random() * 6);
		System.out.println(number);
		
		if (number > 3) {
			System.out.println("Big");
		} else if (number < 3) {
			System.out.println("Small");
		} else {
			System.out.println("Bingo");
		}
	}

}
