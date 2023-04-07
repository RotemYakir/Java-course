package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Person;
import app.core.repositories.PersonRepository;

@Service
@Transactional // means that every method in the class does a transaction. can use it on single method
public class PersonService {

	@Autowired
	private PersonRepository repo;
	
	public int addPerson(Person person) {
		if(repo.existsById(person.getId())) {
			throw new RuntimeException("addPerson failed - already exists");
		}else {
			return repo.save(person).getId();			
		}
	}
}
