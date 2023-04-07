package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp3GetForEntity {

	public static void main(String[] args) {

		System.out.println("client app");

		RestTemplate rt = new RestTemplate();

		try {
			ResponseEntity<Employee> response = rt.getForEntity("http://localhost:8080/employee/controller/1",
					Employee.class);

			System.out.println(response.getStatusCode());
			Employee emp = response.getBody();
		} catch (HttpClientErrorException e) {
			System.out.println("error");
			System.out.println(e.getStatusCode());
			System.out.println(e.getMessage());
		}

	}

}
