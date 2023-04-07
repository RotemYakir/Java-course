package g.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 7, 6, 2, 7, 9, 5, 1, 4));

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		long evens = list.stream().filter(n -> n % 2 == 0).count();
		
		System.out.println("numer of even numbers: " + evens);
		
	}

}
