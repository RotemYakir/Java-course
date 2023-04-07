package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// create a set of Strings
		Set<String> set = new HashSet<>();
		// add elements
		set.add("English");
		set.add("English");
		set.add("Math");
		set.add("Java");
		set.add("Java");
		// print the set size
		System.out.println(set.size());
		// print all the set elements
		System.out.println(set);

	}

}
