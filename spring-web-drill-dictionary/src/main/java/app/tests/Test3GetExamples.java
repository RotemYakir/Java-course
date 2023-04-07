package app.tests;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Example;

public class Test3GetExamples {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		String url = "http://localhost:8080/dictionary/get-examples/";

		try {
			Example[] arr = rt.getForObject(url + "1", Example[].class);
			List<Example> examples = Arrays.asList(arr);
			for (Example example : examples) {
				System.out.println(example);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
