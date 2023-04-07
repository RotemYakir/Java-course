package lab10;

import java.util.Arrays;

public class Num2IncludesArrayCopy {

	public static void main(String[] args) {

		/*
		 * 2 Create a class that eliminates duplicates. The class should be capable of
		 * getting an array with duplicate values and return an array of unique values
		 * generated from it. For example, for the input {1,2,5,1,6,1,5,4,8} the result
		 * should be {1,2,5,6,4,8}
		 */

		System.out.println("//2");
        //create an array of random length
		int length = (int) (Math.random() * 6 + 10);
		int arr[] = new int[length];

		// populate with random values
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		System.out.println(Arrays.toString(arr));
        //eliminate duplicates
		int[] arrtemp = new int[arr.length];
		int index = 0;
		lbl: for (int i = 0; i < arr.length; i++) {
			int candidate = arr[i];
			for (int j = 0; j < index; j++) {
				if (candidate == arrtemp[j]) {
					continue lbl;
				}
			}
			arrtemp[index] = candidate;
			index++;
		}
		int[]arrshort=new int [index];
		System.arraycopy(arrtemp, 0, arrshort, 0, index);
		arr=arrshort;
		System.out.println(Arrays.toString(arr));
	}
	

}
