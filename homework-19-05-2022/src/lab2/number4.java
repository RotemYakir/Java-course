package lab2;

public class number4 {

	public static void main(String[] args) {
		

		int number1 = (int)(Math.random()*101);
		int number2 = (int)(Math.random()*101);
		int number3 = (int)(Math.random()*101);
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		
		
		if (number1>number2&&number1>number3) {
			System.out.println("the bigger value is:");
			System.out.println(number1);
		}else if(number2>number1&&number2>number3) {
			System.out.println("the bigger value is:");
			System.out.println(number2);
		}else { 
			System.out.println("the bigger value is:");
			System.out.println(number3);
		
		}
		
		
	}

}
