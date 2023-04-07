package app.core;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Student;
import app.core.entities.Student.Gender;
import app.core.services.AppService;

//@Component
public class Test1 implements CommandLineRunner{

	@Autowired
	private AppService service;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(0,"aaa",25,"aaa@email",Gender.M,LocalDate.of(2000, 5, 12),true);
		Student student2 = new Student(0,"Yakov",83,"Yakov@email",Gender.M,LocalDate.of(2000, 7, 17),false);
		Student student3 = new Student(0,"ccc",13,"ccc@email",Gender.F,LocalDate.of(2020, 5, 12),true);
		Student student4 = new Student(0,"Yakov",39,"the-yakov@email",Gender.M,LocalDate.of(2020, 5, 12),false);
		Student student5 = new Student(0,"ddd",25,"ddd@email",Gender.F,LocalDate.of(2020, 5, 12),true);
	
		service.createStudent(student1);
		service.createStudent(student2);
		service.createStudent(student3);
		service.createStudent(student4);
		service.createStudent(student5);
	
	
	}

}
