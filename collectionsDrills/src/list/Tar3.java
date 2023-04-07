package list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tar3 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 6 + 5));
		}
		System.out.println(list);

		Set<Integer> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);

	}

}
