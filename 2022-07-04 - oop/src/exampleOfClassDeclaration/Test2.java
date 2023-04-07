package exampleOfClassDeclaration;

public class Test2 {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		
		System.out.println(p1.getPointDetails());
		System.out.println(p2.getPointDetails());
		
		System.out.println("-----------------------");
		
		p1.moveRight(5);
		p1.moveUp(10);
		
		p2.moveRight(23);
		p2.moveUp(7);
		
		System.out.println(p1.getPointDetails());
		System.out.println(p2.getPointDetails());
	}

}
