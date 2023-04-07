package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp1Get {

	public static void main(String[] args) {

		System.out.println("client app");
		
		RestTemplate rt = new RestTemplate();
		Employee emp =  rt.getForObject("http://localhost:8080/employee/controller/1",Employee.class);
		
		System.out.println(emp);
	}

}
