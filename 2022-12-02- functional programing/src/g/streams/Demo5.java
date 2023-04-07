package g.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 7, 6, 2, 7, 100, 9, 5, 1, 4));

		list.stream().distinct().forEach(System.out::println);

		boolean isThereAny100 = list.stream().anyMatch(num -> num == 100);
		System.out.println(isThereAny100);

		
		
		List<Integer> ages = new ArrayList<>(Arrays.asList(20, 39, 35, 94, 17));
		if (ages.stream().allMatch(e -> e >= 18)) {
			System.out.println("All are over 18");
		} else {
			System.out.println("There are some minors");
		}

		if (ages.stream().noneMatch(e -> e == 25)) {
			System.out.println("no one is 25");
		} else {
			System.out.println("some are 25");
		}
		
		
		
	}

}
