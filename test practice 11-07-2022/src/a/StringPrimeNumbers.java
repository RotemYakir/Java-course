package a;

import java.util.Scanner;

public class StringPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("the smaller number is: " + num1);
		System.out.println("the bigger number is: " + num2);

		for (int count = num1; count <= num2; count++) {
			boolean prime = true; // this includes the numbers 2+3 which will not get in the loop

			if (count < 2) {
				prime = false;
			} else {

				for (int i = 2; i <= count / 2; i++) {
					if (count % i == 0) {
						prime = false;
						break;
					}
				}

			}

			if (prime == true) {
				System.out.println(count + " is a prime number.");
			} else {
				System.out.println(count + " is Not a prime number.");
			}

		}

	}

}
