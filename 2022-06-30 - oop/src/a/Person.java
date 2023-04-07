package a;

public class Person {

	// attributes

	private int id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		if(newName.length()<=10) {
			name=newName;
		}
	}
	
	// to access id we add 2 methods:

	public int getId() {
		return id;
	}

	public void setId(int x) {
		if (x >= 0 && x <= 999999999) {
			id = x;
		}
	}

	// to access age we add 2 methods:
	public int getAge() {
		return age;
	}

	public void setAge(int x) {
		if (x >= 0 && x <= 120) {
			age = x;
		}
	}
}
