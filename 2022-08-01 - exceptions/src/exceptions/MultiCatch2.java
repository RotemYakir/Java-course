package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter array length: ");
			int x = sc.nextInt();
			int[] arr = new int[x];
			System.out.println(arr);

		} catch (InputMismatchException |NegativeArraySizeException e) {
			System.out.println("ERROR");
		} catch (Exception e) {
			//some other error
			e.printStackTrace();
		}

	}

}
