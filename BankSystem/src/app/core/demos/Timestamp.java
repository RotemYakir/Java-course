package app.core.demos;

import java.util.Date;

public class Timestamp {

	public static void main(String[] args) {
		
		long ts=0;
		Date date = new Date(ts);
		System.out.println(date);
		
		//get timestamp of runtime
		long ts2=System.currentTimeMillis();
		Date date2 = new Date(ts2);
		System.out.println(date2);
		
		
	}
}
