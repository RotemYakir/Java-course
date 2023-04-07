package lambdaExpression;

public class Demo4LambdaExpression {

	public static void main(String[] args) {
		
		// lambda expression
		Printer printer1 = str -> System.out.println(str);
		
		// method reference
		Printer printer2 = System.out::println;

		printer1.print("this is my message 1");
		printer2.print("this is my message 2");
		
	}

	interface Printer {
		void print(String msg);
	}
}
