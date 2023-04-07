package app.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp6UpdateAll {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/employee/controller";
		List<Employee> employees = Arrays.asList(rt.getForObject(url, Employee[].class));

		for (Employee employee : employees) {
			employee.setSalary(employee.getSalary() * 0.05);
		}
		String urlAll = "http://localhost:8080/employee/controller/all";
		rt.put(urlAll, employees);

		
		
		// might not work. if not- check gitHub
	}
}

