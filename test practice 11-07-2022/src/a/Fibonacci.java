package a;

public class Fibonacci {

	public static void main(String[] args) {

		
		
		// print the first 20 number of fibonacci set
		
		long f1 = 1;
		long f2 = 1;
		 System.out.println("1) "+f1);
		 System.out.println("2) "+f2);
		for (int i=1;i<19;i++) {
			f2=f2+f1;
			f1=f2-f1;
			System.out.println((i+2)+") "+f2);
		}
		

	}

}

