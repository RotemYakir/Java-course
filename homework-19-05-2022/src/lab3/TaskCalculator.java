package lab3;

import java.util.Scanner;

public class TaskCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary");

		int salary = sc.nextInt();
		sc.close();

		System.out.println("your salary is:");
		System.out.println(salary);

		if (salary < 23000) {
			System.out.println("the tax rate is 10%");
			int tax = (int) (salary * 0.1); // TAX CALCULATION
			System.out.println("the tax is:" + tax);
			System.out.println("your salary after tax is:");
			System.out.println(salary - tax);

		} else if (salary < 50000) {
			System.out.println("the tax rate is 20%");
			int tax = (int) (salary * 0.2); // TAX CALCULATION
			System.out.println("the tax is:" + tax);
			System.out.println("your salary after tax is:");
			System.out.println(salary - tax);

		} else if (salary < 100000) {
			System.out.println("the tax rate is 30%");
			int tax = (int) (salary * 0.3); // TAX CALCULATION
			System.out.println("the tax is:" + tax);
			System.out.println("your salary after tax is:");
			System.out.println(salary - tax);

		} else {
			System.out.println("the tax rate is 40%");
			int tax = (int) (salary * 0.4); // TAX CALCULATION
			System.out.println("the tax is:" + tax);
			System.out.println("your salary after tax is:");
			System.out.println(salary - tax);
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}

	}

}
