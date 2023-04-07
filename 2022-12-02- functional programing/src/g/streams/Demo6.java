package g.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 7, 6, 2, 7, 100, 9, 5, 1, 4));

		List<Integer> theNewList = list.stream().map(e -> e * 2).collect(Collectors.toList());

		System.out.println(list);
		System.out.println(theNewList);

	}

}
