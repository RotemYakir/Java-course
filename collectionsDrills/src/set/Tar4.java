package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tar4 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Adi");
		set.add("Noga");
		set.add("Itay");

		System.out.println(set);

		Iterator<String> it = set.iterator();

		for (int i = 0; it.hasNext(); i++) { // i represents the index in the set
			String curr = it.next();
			if (i == 2) {
				System.out.println(curr);
				break;
			}
		}

	}

}
