package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.School;
import app.core.entities.Student;

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
			
			School school1= new School(0, "JB");
			School school2= new School(0, "Egozim");
			
			em.persist(school1);
			em.persist(school2);

			Student st1 = new Student(0, "aaa", 11, school1);
			Student st2 = new Student(0, "bbb", 14, school2);
			Student st3 = new Student(0, "ccc", 16, school1);

			em.persist(st1);
			em.persist(st2);
			em.persist(st3);
			
			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}
