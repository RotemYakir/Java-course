package f.functionalInterfaces;

import java.util.function.Consumer;

import e.methodReference.Person;

public class Demo4Consumer {

	public static void main(String[] args) {

		Consumer<Person> personfields = p -> System.out.println(p.getId() + ", " + p.getName() + ", " + p.getAge());
		
		Person moshe = new Person(101, "Moshe", 25);
		Person dina = new Person(102, "dina", 23);

		personfields.accept(moshe);
		personfields.accept(dina);

	}

}
