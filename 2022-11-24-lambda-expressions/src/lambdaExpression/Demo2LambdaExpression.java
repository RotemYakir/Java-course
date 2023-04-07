package lambdaExpression;

public class Demo2LambdaExpression {

	static void m1(Processor processor, int val) {
		int x = processor.process(val);
		System.out.println(x);
	}

	public static void main(String[] args) {

		Calculator calc1 = (a, b) -> {
			return a + b;
		};
		System.out.println(calc1.add(5, 8));

		// shortened form of the example above
		Calculator calc2 = (a, b) -> a + b;
		System.out.println(calc2.add(5, 3));

		Processor add5 = x -> x + 5;
		Processor add10 = x -> x + 10;
		Processor twice = x -> x * 2;
		System.out.println("=================");
		m1(twice, 200);
		m1(add5, 84);
		m1(add10, 14);
		m1(x -> x + 5 * 3, 2);
	}
}
