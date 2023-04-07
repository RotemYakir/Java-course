package lab9;

import java.util.Arrays;

public class Num1And2 {

	public static void main(String[] args) {

		/*
		 * 1 Create a class that creates an array[10] of numbers with random values
		 * between 0-100 and print all numbers each in a new line
		 */

		System.out.println("//1");
		int arr[] = new int[10];

		for (int i = 0; i <arr.length; i++) {
			
			arr[i] = (int) (Math.random() * 101); 
			System.out.println(i+1 + ") " +arr[i]);
		}
		
	/*	Create a class that creates an array[10] of numbers with random values 
	 * between 0-100 and print all numbers each in the same line 
	 */
		System.out.println("");
		System.out.println("//2");
		
		int arrr [] = new int [10];
		int c;
		for (c=0;c<arrr.length;c++) {
		
		 arrr[c] = (int) (Math.random() * 101);
		}
		System.out.println(Arrays.toString(arrr));

	}

}
