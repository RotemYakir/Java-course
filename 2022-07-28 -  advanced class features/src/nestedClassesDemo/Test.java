package nestedClassesDemo;

import nestedClassesDemo.State.Citizen;

public class Test {

	public static void main(String[] args) {

		State isr = new State ("Israel");
		State fra = new State ("France");
		
		Citizen cz1 = isr.new Citizen("Dan");
		Citizen cz2 = isr.new Citizen("Lea");
		Citizen cz3 = isr.new Citizen("Moran");
		Citizen cz4 = fra.new Citizen("Pier");
		Citizen cz5 = fra.new Citizen("Jack");
		
		System.out.println(cz5.getName());
		System.out.println(cz5.getStateName());
		
		System.out.println("Israel population: " + isr.getPopulation());
		System.out.println("France population: " + fra.getPopulation());
		
	}

}
