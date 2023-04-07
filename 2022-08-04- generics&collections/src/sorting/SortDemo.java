package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(9);
		list.add(2);
		System.out.println(list);		
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
