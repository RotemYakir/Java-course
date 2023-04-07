package client;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;
import app.core.entities.Example;

public class Demo2 {

	public static void main(String[] args) {

		
		System.out.println("===== CLIENT =====");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";
		
		// POST
		Entry entry = new Entry(0, "Java", "a programing language", null);
		entry.addExample(new Example(0, "java is nice", null));
		entry.addExample(new Example(0, "java is good", null));
		entry.addExample(new Example(0, "java is ok", null));
		
		try {
			Entry entryFromServer = rt.postForObject(baseUrl + "/add-entry", entry, Entry.class);
			System.out.println(entryFromServer);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
