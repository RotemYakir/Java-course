package daemon;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Thread snooze = new Snooze("snooze");
		snooze.setDaemon(true);
		snooze.start();

		try(Scanner sc = new Scanner(System.in);){
			System.out.println("enter name: ");
			String name = sc.next();
			System.out.println("Hello " + name);
			
		}
		
	}

}
