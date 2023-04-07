package client;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo3AddPerson {

	public static void main(String[] args) {


		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		Person yosi = new Person(222, "Yosi", 12);

		RequestEntity<Person> req = RequestEntity.post(baseUri).body(yosi);
		System.out.println();
		try {
			// sends a request to the server using exchange method
			ResponseEntity<Person> resp = rt.exchange(req, Person.class);
			System.out.println(resp.getStatusCodeValue());
			Person person= resp.getBody();
			System.out.println(person);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
