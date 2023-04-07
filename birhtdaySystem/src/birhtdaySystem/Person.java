package birhtdaySystem;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {

	private int id;
	private static int nextId = 1;
	private String name;
	private LocalDate birthday;

	// constructor
	public Person() {
		this.id = nextId++;
		this.name = "Person " + this.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

//	public void printBirthday() {
//		int month = birthday.getMonthValue();
//		int day = birthday.getDayOfMonth();
//		int year = birthday.getYear();
//		String birth = day + "/" + month + "/" + year;
//		SimpleDateFormat format = new SimpleDateFormat(birth);
//		System.out.println(format);
//	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthday=" + DateUtil.beautifyDate(birthday) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Person other) {
		return this.getBirthday().compareTo(other.getBirthday());
	}

}
