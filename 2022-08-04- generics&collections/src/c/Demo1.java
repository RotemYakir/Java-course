package c;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("English");
		list.add("English");
		list.add("Math");
		list.add("Java");
		list.add("Java");
		System.out.println(list);

		// remove
		list.remove("Java");
		System.out.println(list);
		// contains
		System.out.println("contains math? " + list.contains("Math"));
		// to array
		Object[] arr1 = list.toArray();
		String[] arr2 = list.toArray(new String[list.size()]);

		// adding to list in index 2
		list.add(2, "History");
		System.out.println(list);

		list.set(2, "English");
		System.out.println(list);
	}

}
