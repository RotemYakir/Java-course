package exampleOfClassDeclaration;

public class Test3Constructors {

	public static void main(String[] args) {

		
		/*
		 * because we defined 3 constructors,
		 * we now have 3 ways of creating points
		 */
		
		Point p1 = new Point();
		Point p2 = new Point(15,17);
		Point p3 = new Point(100);
		
		System.out.println(p1.getPointDetails());
		System.out.println(p2.getPointDetails());
		System.out.println(p3.getPointDetails());
		
		
	}
}
