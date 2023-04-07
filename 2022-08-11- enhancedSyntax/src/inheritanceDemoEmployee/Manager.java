package inheritanceDemoEmployee;

public class Manager extends Employee {

	Department department;

	{
		int index = (int) (Math.random() * Department.values().length);
		this.department = Department.values()[index];
	}

	enum Department {
		SALE, LEGAL, MANAGMENT, COSTUMERS
	}

}
