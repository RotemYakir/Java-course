package school;

public class SchoolStatistics {

	public static void main(String[] args) {

		School school = new School();

		ClassRoom kitaAlef = new ClassRoom("Kita Alef");
		school.addClassroom(kitaAlef);
		ClassRoom kitaBet = new ClassRoom("Kita Bet");
		school.addClassroom(kitaBet);
		ClassRoom kitaGimel = new ClassRoom("Kita Gimel");
		school.addClassroom(kitaGimel);
		ClassRoom kitaDalet = new ClassRoom("Kita Dalet");
		school.addClassroom(kitaDalet);
		ClassRoom kitaHey = new ClassRoom("Kita Hey");
		school.addClassroom(kitaHey);

		kitaAlef.addRandomStudents();
		kitaAlef.addRandomTeacher();
		System.out.println(kitaAlef);

		kitaBet.addRandomStudents();
		kitaBet.addRandomTeacher();
		System.out.println(kitaBet);

		kitaGimel.addRandomStudents();
		kitaGimel.addRandomTeacher();
		System.out.println(kitaGimel);

		kitaDalet.addRandomStudents();
		kitaDalet.addRandomTeacher();
		System.out.println(kitaDalet);

		kitaHey.addRandomStudents();
		kitaHey.addRandomTeacher();
		System.out.println(kitaHey);

		System.out.println(getSchoolAvg(school));
		System.out.println(getClassAvg(kitaGimel));
		System.out.println(getAvgfor20to30(school));
		System.out.println(getAvgfor31Plus(school));
	}

	// all static methods get the average according to grades count and not to head
	// counts
	public static int schoolAvg = 0;
	public static int classAvg = 0;
	public static int bonus1Avg = 0;
	public static int bonus2Avg = 0;
	public static int professionAvg = 0;

	public static int getSchoolAvg(School school) {
		int sum = 0;
		int gradeCount = 0;
		for (ClassRoom classroom : school.classrooms) {
			if (classroom != null) {
				for (Student student : classroom.students) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							sum += grade.getScore();
							gradeCount++;
						}
					}
				}
			}
		}
		schoolAvg = sum / gradeCount;
		return schoolAvg;
	}

	public static int getClassAvg(ClassRoom classroom) {
		int sum = 0;
		int gradecount = 0;
		for (Student student : classroom.students) {
			if (student != null) {
				for (Grade grade : student.getGrades()) {
					sum += grade.getScore();
					gradecount++;
				}

			}
		}
		classAvg = sum / gradecount;
		return classAvg;
	}

	public static int getProfessionAvg(School school, Profession profession) {
		int sum = 0;
		int gradeCount = 0;
		for (ClassRoom classroom : school.classrooms) {
			if (classroom != null) {
				for (Student student : classroom.students) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							if (grade.getProfession() == profession) {
								sum += grade.getScore();
								gradeCount++;
							}

						}
					}
				}
			}
		}
		professionAvg = sum / gradeCount;
		return professionAvg;
	}

	// bonus 1
	public static String getAvgfor20to30(School school) {
		int sum = 0;
		int gradeCount = 0;
		for (ClassRoom classroom : school.classrooms) {
			if (classroom != null) {
				for (Student student : classroom.students) {
					if (student != null && student.getAge() > 19 && student.getAge() < 31) {
						for (Grade grade : student.getGrades()) {
							sum += grade.getScore();
							gradeCount++;
						}
					}
				}
			}
		}
		bonus1Avg = sum / gradeCount;
		return "the number of student who's age is in the range of 20-30 is: " + gradeCount
				+ " and the average of their grades is: " + bonus1Avg;

	}

	// bonus 2
	public static String getAvgfor31Plus(School school) {
		int sum = 0;
		int gradeCount = 0;
		for (ClassRoom classroom : school.classrooms) {
			if (classroom != null) {
				for (Student student : classroom.students) {
					if (student != null && student.getAge() > 31) {
						for (Grade grade : student.getGrades()) {
							sum += grade.getScore();
							gradeCount++;
						}
					}
				}
			}
		}
		bonus2Avg = sum / gradeCount;
		return "the number of student who's age is in the range of 20-30 is: " + gradeCount
				+ " and the average of their grades is: " + bonus2Avg;

	}

}
