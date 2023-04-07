package app.tests;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;

public class Test2GetAndPut {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		// get

		String getUrl = "http://localhost:8080/dictionary/get-entry?entryId=";
		Entry entry = rt.getForObject(getUrl + "2", Entry.class);
		System.out.println(entry);

		// put

		String putUrl = "http://localhost:8080/dictionary/update";
		entry.setWord("python");
		entry.setDefinition("not Java");
		try {
			rt.put(putUrl, entry);
			System.out.println("updated");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
