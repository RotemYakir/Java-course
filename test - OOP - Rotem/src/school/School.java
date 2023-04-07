package school;

public class School {

	ClassRoom[] classrooms = new ClassRoom[5];

	public ClassRoom[] getClassrooms() {
		return this.classrooms ;
	}

	public void setClassrooms(ClassRoom[] classrooms) {
		this.classrooms = classrooms;
	}

	public void addClassroom(ClassRoom classroom) {
		for (ClassRoom classRoom : classrooms) {
			if (classRoom == null) {
				classRoom = classroom;
				break;
			}
		}
		
	}

}
