package app.tests;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;
import app.core.entities.Example;

public class Test1Post {

	public static void main(String[] args) {

		RestTemplate rt= new RestTemplate();
		
		String url = "http://localhost:8080/dictionary/add-entry";
		Entry entry = new Entry(0, "Java", "a programming language", null);
		entry.addExample(new Example(0, "example1", entry));
		entry.addExample(new Example(0, "example2", entry));
		entry.addExample(new Example(0, "example3", entry));
		
		entry=rt.postForObject(url, entry, Entry.class);

		
	}

}
