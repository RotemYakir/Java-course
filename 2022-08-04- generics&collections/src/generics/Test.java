package generics;

public class Test {

	public static void main(String[] args) {

		
		//type argument - given on object creation
		Box<String> boxOfString = new Box<>(); // content is null
		boxOfString.setContent("Hello"); // content is now a string
		System.out.println(boxOfString.getContent());

        
		//type argument - given on object creation
		Box<Integer> boxOfInt = new Box<>(); // content is 0
		boxOfInt.setContent(5);// content now is an Integer
		System.out.println(boxOfInt.getContent());

	}

}
