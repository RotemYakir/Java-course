package lab6Fibonacci;

public class Num2Class {

	public static void main(String[] args) {

	int index=(int) (Math.random()*40+1);
	System.out.println("the number is: " +index);
		
		int f1 = 1;
		int f2 = 1;

		for (int i = 1; i <= 40; i++) {
			
			if (i==index) {
				System.out.println(i + ") "+f1);
				break;
			}
			f2 = f1 + f2;
			f1 = f2 - f1;

		}
	}
}