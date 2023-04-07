package lab5;

public class Num4And5And6 {

	public static void main(String[] args) {

		/*
		 * 4 Create a class that defines a random number with value between 0-10000 and
		 * print the opposite order of the number’s digits: [1998 -> 8991]
		 */
		System.out.println("//4");
		int x;
		int r = (int) (Math.random() * 10000);
		System.out.println(r);
		for (x = r; x > 0; x = x / 10) {
			System.out.print(x % 10);
		}
		
		
		/*5
		 * Create a class that defines a random number with value between 0-10000 and
		 * print the following details with clear messages: o number of digits [4867 ->
		 * 4] o the first left digit [ 6843 -> 6] o sum of the number’s digits [ 473 ->
		 * 14] o opposite order of the number’s digits [5892 -> 2985]
		 */

		System.out.println("");
		System.out.println("");
		System.out.println("//5");

		r = (int) (Math.random() * 10001);
		System.out.println("the number is: " + r);
		x = r;
		int length = 1;
		while (x >= 10) {
				length++;
				x = x / 10;
				
		
		}
		System.out.println("it's length is: " + length + "  digits");
		System.out.println("the left digit is: "+x);
		
		int sum=0;
		x = r;
		for (int i = 0; i < length; i++) {
			sum = sum + x%10;
			x=x/10;
		}
		System.out.println("the sum of the " + length + " digits of the number is: " + sum);

	}

}
