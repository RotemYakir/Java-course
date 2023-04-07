package app.core.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller1 {

	@PostMapping("/form1")
	// the names of the attributes must be equal to the ones written in the html
	// file
	public String form1(String name, int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		return "name: " + name + "<br> age: " + age;
	}
	
	@GetMapping("/hobbies")
	public String hobbies(String hobby1, String hobby2, String hobby3) {
		String response = "Your hobbies are: ";
		response+="<ul>";
		if(hobby1!=null) {
			response+= "<li>"+hobby1+"</li>";
		}
		if(hobby2!=null) {
			response+= "<li>"+hobby2+"</li>";
		}
		if(hobby3!=null) {
			response+= "<li>"+hobby3+"</li>";
		}
		response+="</ul>";
	return response;
	}

}
