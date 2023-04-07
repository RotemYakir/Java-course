package part1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		while (list.size() < 100) {

			list.add((int) (Math.random() * 1001));
		}
		System.out.println("List: ");
		System.out.println(list);

		Set<Integer> set = new HashSet<>();
		set.addAll(list);

		System.out.println("set: ");
		System.out.println(set);
	}

}
