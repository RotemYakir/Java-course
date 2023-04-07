package exceptions;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");

		try {
			int number = sc.nextInt();
			System.out.println(number);
		} catch (Exception e) {
			System.out.println("the number is not a valid number");
			e.printStackTrace();
		} finally {
			System.out.println("closing scanner");
			sc.close();

		}
	}

}
