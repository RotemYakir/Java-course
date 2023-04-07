package a;

import java.util.Scanner;

public class KeletPelet {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("insert your name and your age: ");
		
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		System.out.println("your name is " +name+ " and you're "+age+ " years old");
		
	}

}
