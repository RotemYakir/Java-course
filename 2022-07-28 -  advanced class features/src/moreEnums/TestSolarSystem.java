package moreEnums;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestSolarSystem {

	public static void main(String[] args) {

		
		Planet[] planets = Planet.values();
		for (Planet planet : planets) {
			System.out.println(planet+", ");
		}
		
		//get planet name from user
		String input = JOptionPane.showInputDialog("enter planet: " + Arrays.toString(Planet.values()));
		//change to upper case
		input = input.toUpperCase();
		//convert String to color
		Planet planet = Planet.valueOf(input);

		System.out.println(planet.getName());
		System.out.println("gravitation: " + planet.getGravitation());
		System.out.println("orbit: " + planet.getOrbit());

	}

}
