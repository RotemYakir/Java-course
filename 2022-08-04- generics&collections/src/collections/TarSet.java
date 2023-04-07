package collections;

import java.util.HashSet;
import java.util.Set;

public class TarSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		while (set.size() < 10) {
			set.add((int) (Math.random() * 10));
			System.out.println(set);
		}

	}

}
