package app.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp5Update {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/employee/controller";
		List<Employee> employees = Arrays.asList(rt.getForObject(url, Employee[].class));

		// Update One
		Employee emp = employees.get(0);
		emp.setSalary(emp.getSalary() * 1.1);
		rt.put(url, emp);

		// Update All
		for (Employee employee : employees) {
			employee.setSalary(employee.getSalary() * 1.05);
			try {
				rt.put(url, employee);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(employee);
			}
		}
	}
}
