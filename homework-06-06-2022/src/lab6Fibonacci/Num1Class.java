package lab6Fibonacci;

public class Num1Class {

	public static void main(String[] args) {

		int f1 = 1;
		int f2 = 1;

		for (int i = 1; i <= 40; i++) {
			System.out.println (i + ") " + f1);
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
	}
}