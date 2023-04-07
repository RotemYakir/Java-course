package lab5;

public class Num1And2And3 {

	public static void main(String[] args) {

		/*
		 * Create a class that defines a random number with value between 0-10000 and
		 * print the length of digits: [1998 -> 4]
		 */
		System.out.println("//1");

		int r = (int) (Math.random() * 10000);
		System.out.println("the number is: " +r);
		int x = r;
		int length = 1; //because the loop immediately starts by dividing the number so we need to add the first digit

		while (x > 0) {
			if (x / 10 > 0) {
				length++;
				x = x / 10;
			}else {
				break;
			}
				
		}
		System.out.println("it's length is: " +length + "  digits");
		
		
		/*
		 * 2 Create a class that defines a random number with value between 0-10000 and
		 * print the right digit: [1998 -> 8]
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("//2");
		
		 r = (int) (Math.random() * 10000);
		 System.out.println("the right digit of the number: " +r+ " is: "+r%10);
		 
/*3
 * Create a class that defines a random number with value between 0-10000
 *  and print the left digit: [1998  ->  1]
 */
		 System.out.println("");
			System.out.println("");
			System.out.println("//3");
			 r = (int) (Math.random() * 10000);
			 x=r;
			 while (x>9) {
				 x=x/10;}
			 System.out.println("the left digit of the number: "+r+ " is: "+x);
			 
			
			
			
			
		
		
	}

}
