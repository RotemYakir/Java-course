package app.core.tests;

import app.core.types.Bus;
import app.core.types.Passenger;

public class App2 {

	public static void main(String[] args) {
		
		 Bus bus=new Bus();
		 
		 boolean proceed= true;
		 
		 while (proceed) {
			 proceed = bus.addPassenger(new Passenger("---"));
		 }
		 
		 bus.printPassengers();
		 
		 bus.removePassenger(8);
		 
		 bus.printPassengers();
		
		
	}

}
