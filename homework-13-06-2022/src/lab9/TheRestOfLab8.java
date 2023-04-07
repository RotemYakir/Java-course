package lab9;

import java.util.Arrays;

public class TheRestOfLab8 {

	public static void main(String[] args) {

		/*3+4+5+6
		 * Create a class that creates an array[10] of numbers with random values between 0-100 and prints:
		 * 3) the total sum
		 * 4) the  average
		 * 5) the maximum number
		 * 6)the index of the maximum number in the array
		 * 7)the minimum number and its index in the array
		 */

System.out.println("//3");
int arr [] = new int [10]; 
int sum = 0,i,max=0,maxindex = 0,minindex=0,min=100;
for (i=0;i<arr.length;i++) {
	
	arr[i]=(int)(Math.random()*101);
	sum+=arr[i];
	if (arr[i]>max) {
		max=arr[i];
		maxindex=i;	
	}
	if (arr[i]<min) {
		min=arr[i];
		minindex=i;	
	}
}
int average= sum/arr.length;
System.out.println(Arrays.toString(arr));
System.out.println("the sum of all the numbers above is: " + sum);
System.out.println("the average of the numbers is: " + average);
System.out.println("the maximun number is: " +max+ " the index of the number in the array is: "+ maxindex );
System.out.println("the minimum number is: " +min+ " the index of the number in the array is: "+ minindex );
		
	/*	Create a class that creates an array[10] of numbers with random values 
	 * between 0-100 and print all numbers each in the same line 
	 */
	
	
	
	
	
	
	}

}
