package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private List<String> words = new ArrayList<>();

	@PostMapping("/add-word")
	public void addWord(@RequestParam String word) {
		words.add(word);
		System.out.println(words);
	}

	@GetMapping("/find-word")
	public String wordByIndex(@RequestParam int index) {
		if (index >= 0 && index < words.size()) {
			return words.get(index);
		} else {
			return "word not found";
		}
	}

	// http://localhost:8080/hello
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello World !";
	}

	// http://localhost:8080/num
	@RequestMapping(method = RequestMethod.GET, path = "/num")
	public int luckyNumber() {
		return (int) (Math.random() * 101);
	}

	// http://localhost:8080/greet?name=Rotem
	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}

	// http://localhost:8080/sum?a=300&b=98
	@GetMapping("/sum")
	public int sumNumbers(int a, int b) {
		return a + b;
	}

}
