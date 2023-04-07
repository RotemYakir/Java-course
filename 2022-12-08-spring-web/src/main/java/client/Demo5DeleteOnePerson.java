package client;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Demo5DeleteOnePerson {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI baseUri = URI.create("http://localhost:8080/api");

		RequestEntity<Void> req = RequestEntity.delete(baseUri + "?id=103").build();

		System.out.println();
		try {
			ResponseEntity<Void> resp = rt.exchange(req,Void.class);
			System.out.println(resp.getStatusCode());
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
