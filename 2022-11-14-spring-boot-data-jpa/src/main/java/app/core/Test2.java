package app.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Student;
import app.core.services.AppService;

//@Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private AppService service;

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = service.getAllStudents("Yakov");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("==============");

		List<Student> femaleStudents = this.service.getFemales();
		for (Student student : femaleStudents) {
			System.out.println(student);
		}

		System.out.println("==============");
		List<Student> list = this.service.getAllStudentsSorted("age");
		for (Student student : list) {
			System.out.println(student);
		}

	}

}