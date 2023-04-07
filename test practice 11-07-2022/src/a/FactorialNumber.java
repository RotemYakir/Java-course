package a;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number in the range of 1-10");
		int number = sc.nextInt();
		sc.close();

		System.out.println(number);
		int count;
		int fa = 1; // if the number is big, we should use 'long' integer
		for (count = 1; count <= number; count++) {
			fa *= count;
		}
		System.out.println("the factorial number is: " + fa);
	}
}
