package lambdaExpression;


// can be a functional interface if it has only one abstract method
@FunctionalInterface
public interface Processor {

	// abstract
	int process(int x);
	
	// static 
	static int proccess2(int x) {
		return x;
	}
	
	// default
	default int process3(int x) {
		return x*3;
	}
}
