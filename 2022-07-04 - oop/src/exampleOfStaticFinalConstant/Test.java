package exampleOfStaticFinalConstant;

public class Test {

	public static void main(String[] args) {

		// p1 is an instance
		Person p1 = new Person(101, "Avi", 25);
		System.out.println(Person.getCounter());
		Person p2 = new Person(102, "Dan", 17);
		System.out.println(Person.getCounter());
		Person p3 = new Person(103, "Lea", 18);
		System.out.println(Person.getCounter());
		
		System.out.println(p1.id);
		// p1.id=201; -> ERROR because id is final

	}

}
