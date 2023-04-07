package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		// create a list of Strings
		List<String> list = new ArrayList<>();
		// add elements
		list.add("English");
		list.add("English");
		list.add("Math");
		list.add("Java");
		list.add("Java");
		// print the list size
		System.out.println(list.size());
		// print all the list elements
		System.out.println(list);
		// print the third element
		System.out.println(list.get(2));

	}

}
