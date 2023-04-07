package exceptionsTar;

public class PointTest {

	public static void main(String[] args) {
		
		System.err.println("this is error output");
		System.out.println("this is system output");
		System.out.println("=============================================");
		
		
		try {

			Point p1 = new Point(15, 13);
			System.out.println(p1);

			p1.setX(8);
		} catch (PointXYException e) {
			e.printStackTrace();
			//e.printStackTrace(System.out); // DEFAULT print to system output 
			//e.printStackTrace(System.err); // print to error output
			System.out.println("point error: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("some other error: " + e.getMessage());
		}
		
		
	}
	


}
