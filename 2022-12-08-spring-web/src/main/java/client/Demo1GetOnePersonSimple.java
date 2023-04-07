package client;

import java.net.URI;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo1GetOnePersonSimple {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI baseUri = URI.create("http://localhost:8080/api");

		try {
			// sends a request to the server using exchange method
			Person p = rt.getForObject(baseUri + "/103", Person.class);
			System.out.println(p);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
