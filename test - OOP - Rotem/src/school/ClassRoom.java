package school;

import java.util.Arrays;

public class ClassRoom {

	String name;
	Teacher teacher;
	Student[] students = new Student[15];
	private String[] studentNames = { "Rotem", "Yosi", "Sharon", "Lidor", "Maor", "Or", "Ester", "Lea", "Ofir", "Eli",
			"Almog", "Yaniv", "Itay", "Adi", "Noga", "Ido" };
	private String[] teacherNames = { "Yoel", "Gil", "Rami", "David", "Noa" };

	public ClassRoom(String name) {
		super();
		this.name = name;
	}

	public void addRandomTeacher() {
		teacher = new Teacher();
		teacher.setName(teacherNames[(int) (((Math.random() * teacherNames.length)))]);
		teacher.setRandomProfession(Profession.values());
	}

	public void addRandomStudents() {
		for (int i = 0; i < students.length; i++) {

			if (students[i] == null) {
				students[i] = new Student();
				students[i].setAge(((int) Math.random() * 101 + 20));
				students[i].setName(studentNames[((int) (Math.random() * studentNames.length))]);
				students[i].setRandomGrades();
			}
		}
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", teacher=" + teacher + ", students=" + Arrays.toString(students) + "]";
	}

}
