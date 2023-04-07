package test;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {

		// 1
		int[] num1 = new int[15];
		int[] num2 = new int[15];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = ((int) (Math.random() * 10));
		}

		for (int j = 0; j < num2.length; j++) {
			num2[j] = ((int) (Math.random() * 10));
		}

		// 2
		System.out.println("num1:");
		System.out.println(Arrays.toString(num1));
		System.out.println("");
		System.out.println("num2:");
		System.out.println(Arrays.toString(num2));

		// 3
		int i, max = 0, check = 0;
		for (i = 0; i < num1.length - 2; i++) {

			;
			int x1 = num1[i];
			int x2 = num1[(i + 1)];
			int x3 = num1[i + 2];
			check = (x1 * 100 + x2 * 10 + x3);
			if (check > max) {
				max = check;
			}
		}
		System.out.println("");
		System.out.println("the largest 3 digits number of num1 is:" + max);

		// 4
		int distinct[] = new int[10];
		for (int x = 0; x < distinct.length; x++) {
			distinct[x] = -1;
		}

		int x, index = 0;
	
			for (int j = 0; j < num1.length; j++) {
				x = num1[j];
				for (i = 0; i < num2.length; i++) {
					boolean move = true;
					if (x == num2[i]) {
						move = false;
					}

						for (int d = 0; d < distinct.length; d++) {
							if (x == distinct[d]) {
								move=false;
							}
						}

					
						
					if(move==true) {
						distinct[index] = x;
						index++;
					}
				}

			}
		

		// 5
			System.out.println("");
			System.out.println("distinct array: ");
		System.out.println(Arrays.toString(distinct));

		// 6
		int num = 0;
		for (i = 0; i < distinct.length; i++) {
			if (distinct[i] != -1) {
				num = num * 10 + distinct[i];
			}
		}
		System.out.println("");
		System.out.println(num);
	}

}
