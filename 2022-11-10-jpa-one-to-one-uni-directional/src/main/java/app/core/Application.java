package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.School;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// start a spring container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get spring beans for db actions
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		try {
			em.getTransaction().begin();
			
			// create entities
			Address address = new Address();
			address.setCity("Tel Aviv");
			address.setCountry("Israel");
			address.setNumber(9);
			address.setStreet("HaRimon");

			School school = new School();
			school.setName("Hadarim");
			school.setAddress(address);

 //			1. SAVING AN ENTITY TO DATABASE
			em.persist(school); 

 //			2. FIND AND REMOVE AN ENTITY FROM DATABASE
			school = em.find(School.class,1);
    		em.remove(school); // delete the school
			
 //			3. FIND AND UPDATE AN ENTITY FROM DATABASE
			school = em.find(School.class,2);
			school.setName("BeitSefer");
			school.getAddress().setStreet("HaOren");
			
			
			
			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}
