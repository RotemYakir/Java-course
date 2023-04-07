package f.functionalInterfaces;

import java.util.function.Function;

public class Demo1Function {
	
	public static void main(String[] args) {
		
		Function<String, Integer> getLengthOfString = str -> str.length();
		
		int length = getLengthOfString.apply("sdlfjdsflkj");
		System.out.println(length);
	}

}
