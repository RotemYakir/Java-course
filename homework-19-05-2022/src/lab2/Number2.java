package lab2;

public class Number2 {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 101);
		System.out.println(number);
		
		 if (number < 51) {
			System.out.println("Small");
		} else {
			System.out.println("Big");
		}
		 
		 if (number%2 == 0) {
			 System.out.println("Even");
		 }else {
			 System.out.println("Odd");
		 
		 }
		 
		 
		 
	}

}
