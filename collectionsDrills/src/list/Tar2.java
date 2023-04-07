package list;

import java.util.LinkedList;
import java.util.List;

public class Tar2 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 61 + 20));
		}
		
System.out.println(list);
		System.out.println("the list size is: " + list.size());
		System.out.println("the first element is: " + list.get(0));
		System.out.println("the last element is: " + list.get(99));
		System.out.println("the tenth element is: " + list.get(9));

		boolean contains;
		contains = list.contains(24);
		
		
		if(contains) {
			System.out.println("the 25th element is:" + list.get(24));
		}

	}

}
