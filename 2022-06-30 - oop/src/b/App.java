package b;

public class App {

	public static void main(String[] args) {

		// create Point using constructor 1
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(7);

		// create Point using constructor 1
		Point p2 = new Point(5, 8);

		System.out.println(p1.display());
		System.out.println(p2.display());
		
	
	}

}
