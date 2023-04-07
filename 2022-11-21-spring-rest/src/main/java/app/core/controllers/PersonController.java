package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	private List<Person> persons = new ArrayList<>();
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void addPerson(@RequestBody Person person) {
		this.persons.add(person);
		System.out.println(persons);
	}
	
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Person getPerson(@RequestParam int id) {
		Person p = new Person();
		p.setId(id);
		int index = persons.indexOf(p);
		if(index!= -1) {
			return persons.get(index);
		}else {
			return null;
		}
	}
	


}
