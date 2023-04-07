package lab4;

public class Num3And4And5 {

	public static void main(String[] args) {

		/*
		 * 3 Create a class that defines a random number and prints all numbers from 1
		 * to that number
		 */
		System.out.println("//3");

		int r = (int) (Math.random() * 101);
		for (int i = 1; i < r; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(r);

		/*
		 * 4 Create a class that defines two random values and prints all values between
		 * them. note - which variable holds the higher value is not known.
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("//4");
		System.out.println("");

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		int t = a;
		System.out.println("the smaller number is: " + a);
		System.out.println("the bigger number is: " + b);
		while (t < b) {
			System.out.print(t + ", ");
			t++;
		}
		System.out.println(t);

		/*
		 * 5 Create a class that defines a random number and prints all even numbers
		 * from 0 to that number
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("//5");
		System.out.println("");

		int f = (int) (Math.random() * 101);
		for (int i = 0; i <= f; i++) {
			if (i%2==0) {
			System.out.print(i + " ");
			}else  {
				continue;
			}
	
		} 

	}

}
