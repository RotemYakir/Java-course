package lab6Fibonacci;

public class Num1 {

	public static void main(String[] args) {

		
		
		int[] arr = new int[40];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < 40; i++) {
			arr[i] = arr[i-1] + arr[i - 2];
		}
		int i = 0;
		while (i < 40) {
			System.out.print(arr[i]+ " ");
			i++;
		}

	}

}
