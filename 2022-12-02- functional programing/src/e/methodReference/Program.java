package e.methodReference;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(3, "bbb", 22));
		list.add(new Person(1, "ccc", 11));
		list.add(new Person(2, "aaa", 32));

		print(list);

		// lambda expression
//		list.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));

		list.sort(Person::compareByAge);
		print(list);

		// method reference - to an existing dynamic method
		ComparisonProvider cp = new ComparisonProvider();
		list.sort(cp::compareByName);
		print(list);

//		System.out.println("===============");
//		list.forEach(e -> System.out.println(e));
		// method reference - to an existing dynamic method
		System.out.println("===============");
		list.forEach(System.out::println);
	}

	public static void print(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("======");
	}

}
