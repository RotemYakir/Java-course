package app.core.types;

public class Bus {

	private static int nextNumber = 101;// internal counter to produce bus numbers
	private int number = nextNumber++; // the bus number
	private Passenger[] passengers = new Passenger[10];

	public int getNumber() {
		return number;
	}
	
	/**
	 * add the passenger to the bus and returns true if succeeded, otherwise returns
	 * false.
	 * 
	 * @param passenger the passenger to add to the bus
	 * @return true if added, otherwise return false
	 */

	public boolean addPassenger(Passenger passenger) {
		for (int i = 0; i < passengers.length; i++) {
			if (passengers[i] == null) {
				passengers[i] = passenger;
				return true;
			}
		}
		return false;
	}
	
	public Passenger removePassenger (int passengerId) {
		for (int i=0;i<passengers.length;i++) {
			Passenger curr = passengers[i];
			if(curr!=null&&curr.getId()==passengerId) {
				passengers[i]=null; // remove the passenger
				return curr; //return the removed passenger
			}
		}
		return null;		
	}
	

	public void printPassengers() {
		System.out.println("======= passengers in bus " + number);
		for (Passenger passenger : passengers) {
			if (passenger != null) {
				System.out.println(passenger);
			}
		}
		System.out.println();
	}
}
