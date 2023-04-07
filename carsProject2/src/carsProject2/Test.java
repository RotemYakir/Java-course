package carsProject2;

public class Test {

	public static void main(String[] args) {

		Country isr = new Country("Israel");

		Highway ayalon = new Highway("Ayalon");
		Highway kvishHahof = new Highway("Kvish Hahof");
		Highway kvish4 = new Highway("Kvish 4");
		Highway kvish6 = new Highway("Kvish 6");
		Highway derechBegin = new Highway("Derech Begin");

		isr.addHighway(ayalon);
		isr.addHighway(kvishHahof);
		isr.addHighway(kvish4);
		isr.addHighway(derechBegin);
		isr.addHighway(kvish6);

		System.out.println(isr.toString());
		ayalon.addRandomCars();
		System.out.println("Ayalon cars details: ");
		System.out.println(ayalon.printCarsDetails());
		kvishHahof.addRandomCars();
		System.out.println("Kvish Hahof cars details: ");
		System.out.println(kvishHahof.printCarsDetails());
		kvish4.addRandomCars();
		System.out.println("Kvish 4 cars details: ");
		System.out.println(kvish4.printCarsDetails());
		kvish6.addRandomCars();
		System.out.println("Kvish 6 cars details: ");
		System.out.println(kvish6.printCarsDetails());
		derechBegin.addRandomCars();
		System.out.println("Derech Begin cars details: ");
		System.out.println(derechBegin.printCarsDetails());

		System.out.println("");

		System.out.println("the number of cars on Ayalon is: " + ayalon.getNumOfCars());
		System.out.println("the number of cars on Kvish Hahof is: " + kvishHahof.getNumOfCars());
		System.out.println("the number of cars on Kvish 4 is: " + kvish4.getNumOfCars());
		System.out.println("the number of cars on Kvish 6 is: " + kvish6.getNumOfCars());
		System.out.println("the number of cars on Derech Begin is: " + derechBegin.getNumOfCars());
		System.out.println("the total number of cars in Israel is: " + isr.getNumOfCars());
		
		System.out.println("");

		System.out.println("the busiest highway in israel is: " + isr.getBusiestHighway());

		System.out.println("");

		System.out.println("the average speed of ayalon is: " + ayalon.getAvgSpeed());
		System.out.println("the average speed of Kvish Hahof is: " + kvishHahof.getAvgSpeed());
		System.out.println("the average speed of Kvish 4 is: " + kvish4.getAvgSpeed());
		System.out.println("the average speed of Kvish 6 is: " + kvish6.getAvgSpeed());
		System.out.println("the average speed of Derech Begin is: " + derechBegin.getAvgSpeed());
		System.out.println("the total average speed in Israel is: " + isr.getAvgSpeed());
		
		System.out.println("");
		
		System.out.println("the highway with the highest average speed is: " + isr.getHighestAvgSpeedHighway());

		System.out.println("");

		System.out.println("the max speed of ayalon is: " + ayalon.getMaxSpeed());
		System.out.println("the max speed of Kvish Hahof is: " + kvishHahof.getMaxSpeed());
		System.out.println("the max speed of Kvish 4 is: " + kvish4.getMaxSpeed());
		System.out.println("the max speed of Kvish 6 is: " + kvish6.getMaxSpeed());
		System.out.println("the max speed of Derech Begin is: " + derechBegin.getMaxSpeed());
		System.out.println("the max speed in israel is: " + isr.getMaxSpeed());

	}

}
