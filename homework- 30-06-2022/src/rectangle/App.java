package rectangle;

public class App {

	public static void main(String[] args) {

		Rectangle r = new Rectangle ();
		
		r.setLength(5);
		r.setWidth(4);
		
		
		System.out.println("the width of the rectangle is: "+ r.getWidth() );
		System.out.println("the length of the rectangle is: "+ r.getLength() );
		System.out.println("the area of the rectangle is: "+ r.getArea());
		
		
	}

}
