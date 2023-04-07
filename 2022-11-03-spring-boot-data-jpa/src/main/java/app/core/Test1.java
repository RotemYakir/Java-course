package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.entities.Person;

//@Component
@Order(1)
public class Test1 implements CommandLineRunner {

	// gets a factory object for creating entity manager instances
	@Autowired
	EntityManagerFactory factory;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("========== Test1 ===========");
		Person person = new Person();
		person.setName("Avi");
		person.setAge(32);

        // manages a database session
		EntityManager em = factory.createEntityManager();
		// starts a transaction
		em.getTransaction().begin();
		// does some db actions
		em.persist(person);
		// ends the transaction
		em.getTransaction().commit();
	}

}
