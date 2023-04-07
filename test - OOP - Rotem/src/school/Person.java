package school;

public class Person {
	
	private String name;
	private int age; // values 20-120
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);;
	}

	

	public Person() {
		super();
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>19&&age<121) {			
		this.age = age;
		}
	}
	
	
	

}
