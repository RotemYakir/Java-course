package lambdaExpression;

public class Demo3LambdaExpression {

	public int instanceVariable = 1; // can change
	public static int classVariable = 1; // can change

	public Processor getProcessor() {
		int localVariable = 1;// must be effectively final
		Processor p = x -> {
//			localVariable++;
			return x + localVariable + instanceVariable + classVariable;
		};
		return p;
	}

	public static void main(String[] args) {

		Demo3LambdaExpression demo3 = new Demo3LambdaExpression();
		Processor processor = demo3.getProcessor();

		System.out.println(processor.process(10));
		demo3.instanceVariable = 10;
		Demo3LambdaExpression.classVariable = 400;
		System.out.println(processor.process(10));

	}
}
