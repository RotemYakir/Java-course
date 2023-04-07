package inheritanceDemoEmployee;

import java.util.Collection;

public class EmpsUtil {

	public static double getAvgSalary(Collection<? extends Employee> emps) {
		// this method will accept Collection <Employee>
		// this method will accept Collection <Manager>
		// this method will accept Collection <Director>
		// all have a salary
		double sum = 0;
		int counter = 0;
		for (Employee e : emps) {
			if (e != null) {
				sum += e.salary;
				counter++;
			}
		}
		double avg = sum / counter;
		return avg;
	}	
	public static void addEmployee(Collection< ? super Employee> col) {
			col.add(new Employee());
			col.add(new Manager());
			col.add(new Director());
			// col.add(new Person());
	}
	
	
}

