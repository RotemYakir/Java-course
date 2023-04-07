package app.tests;

import org.springframework.web.client.RestTemplate;

public class Test4Delete {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		String url = "http://localhost:8080/dictionary/delete?entryId=";

		try {
			rt.delete(url + "2");
			System.out.println("deleted");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
