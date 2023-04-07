package exceptionalEvents;

public class Calculator {
	
	
	//handling 1 - throws declaration
	public int divide (int a,int b) throws Exception {
		
		if (b!=0) {
			return a/b;			
		}
		//this is an exceptional event
		throw new Exception("cannot divide by 0");
	}
	
}
