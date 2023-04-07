package lambdaExpression;

public class Demo1LambdaExpression {

	public static void main(String[] args) {

		Runnable runnable =() -> {
			System.out.println("hi");
		};

		Thread t = new Thread(runnable);
		t.start();

	}

}
