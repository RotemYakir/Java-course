package lab4;

public class Num6And7And8 {

	public static void main(String[] args) {

		/*
		 * 6 Create a class that defines two random values ‘max’ and ‘den’ and prints
		 * all the numbers from 0 to ‘max’ that can be divided with ‘den’
		 */
		System.out.println("//6");

		int max = (int) (Math.random() * 1001);
		int den = (int) (Math.random() * 1001);
		if (max < den) {
			int t = max;
			max = den;
			den = t;
		}
		System.out.println("max=" + max);
		System.out.println("den=" + den);
		for (int i = 1; i <= max; i++) {
			if (i % den == 0) {
				System.out.println(i + " can be divided with " + den);
			}
		}

		/*
		 * 7 Create a class that defines a random number between 1-7. o print the number
		 * o prints the factorial value [4 -> 1 X 2 X 3 X 4]
		 */

		System.out.println("");
		System.out.println("");
		System.out.println("//7");
		System.out.println("");

		int r = (int) (Math.random() * 7 + 1);
		System.out.println(r);
		int f = 1;
		for (int c = 1; c <= r; c++) {
			f = f * c;

		}
		System.out.println("the factorial number of " + r + " is: " + f);

		
/*8
 * same as number 7 but using While loop
 */
		System.out.println("");
		System.out.println("");
		System.out.println("//8");
		System.out.println("");
		
		
		int factorial=1; 
		int b = (int) (Math.random() * 7 + 1);
		int count=1;
		while (count<=b) {
			factorial=factorial*count;
			count++;
		}
		System.out.println("the factorial number of " + b + " is: " + factorial);
		
		
		
		
		
		
		
	}

}
