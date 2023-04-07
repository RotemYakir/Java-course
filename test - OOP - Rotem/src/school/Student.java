package school;

import java.util.Arrays;

public class Student extends Person {

	private Grade[] grades = new Grade[6]; // one for each profession

	public Student(String name, int age) {
		super(name, age);
	}

	public Student() {
		super();
	}

	public void setRandomGrades() {
		for (int i = 0; i < grades.length; i++) {

			if (grades[i] == null) {
				for (Profession profession : Profession.values()) {
					grades[i] = new Grade(profession, ((int) ((Math.random() * 61 + 40))));
				}
			}
		}
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public Grade[] getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return "Student " + this.getName() + "[grades=" + Arrays.toString(grades) + "]";
	}

}
