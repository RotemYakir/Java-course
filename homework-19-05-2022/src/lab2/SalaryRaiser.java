package lab2;

public class SalaryRaiser {

	public static void main(String[] args) {

		double salary = (int) (5000 + Math.random() * 1001);

		System.out.println("the salary is:"+ salary);

		if (salary <= 6000) {
			double raisedsalary = (double) (salary + salary * 0.1);
			System.out.println("the updated salary is:" + raisedsalary);
		} else {
			double raisedsalary = (double) (salary + salary * 0.05);
			System.out.println("the updated salary is:" + raisedsalary);
		}

	}

}
