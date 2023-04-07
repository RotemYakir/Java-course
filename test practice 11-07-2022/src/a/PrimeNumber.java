package a;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * A prime number (or a prime) is a natural number greater than 1 that is not a
		 * product of two smaller natural numbers. A natural number greater than 1 that
		 * is not prime is called a composite number.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("insert a number to check if its a prime number or not:");
		int num = sc.nextInt();
		sc.close();

		boolean prime = true; // this includes the numbers 2+3 which will not get in the loop

		if (num < 2) {
			prime = false;
		} else {

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}

		}
		if (prime == true) {
			System.out.println("the number " + num + " is a prime number.");
		} else {
			System.out.println("the number " + num + " is Not a prime number.");

		}

	}

}