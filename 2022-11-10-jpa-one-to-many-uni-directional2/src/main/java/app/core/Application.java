package app.core;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
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

			School school1 = new School();
			school1.setName("Hadarim");
			List<Student> students = new ArrayList<>();
			students.add(new Student(0, "aaa", 15));
			students.add(new Student(0, "bbb", 14));
			students.add(new Student(0, "ccc", 12));
			school1.setStudents(students);

			School school2 = new School();
			school2.setName("Egozim");
			List<Student> students2 = new ArrayList<>();
			students2.add(new Student(0, "ddd", 11));
			students2.add(new Student(0, "eee", 9));
			school2.setStudents(students2);
			
		//	1. SAVING AN ENTITY TO DATABASE
//			em.persist(school1); 
//			em.persist(school2); 
			
		//	2. FINDING SCHOOL
//			School school=em.find(School.class, 2);
//			System.out.println(school);
//			if(school!=null) {
//				System.out.println(school.getStudents());
//			}
			
		//	3. DELETE SCHOOL (AND ITS STUDENTS)
			School school=em.find(School.class, 2);
			System.out.println(school);
			if(school!=null) {
				em.remove(school);
			}


			
			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}
