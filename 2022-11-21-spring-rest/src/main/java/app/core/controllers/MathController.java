package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
public class MathController {
	
	
	
	// http://localhost:8080/add/5/9
	@GetMapping ("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}


}
