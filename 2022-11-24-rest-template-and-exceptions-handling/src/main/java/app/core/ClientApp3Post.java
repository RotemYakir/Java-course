package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;
import app.core.entities.Employee.Department;

public class ClientApp3Post {

	public static void main(String[] args) {

	Employee employee = new Employee (0,"Yoel",Department.CUSTOMERS,17000 );
		
		RestTemplate rt = new RestTemplate();
		
	Employee emp = 	rt.postForObject("http://localhost:8080/employee/controller", employee, Employee.class);
		
	System.out.println(emp);
	}

}
