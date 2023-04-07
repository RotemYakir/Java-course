package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tar7 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("dog", "An animal that barks");
		map.put("car", "A vehicle");
		map.put("java", "A programming language");


		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("please enter a word from the list: \n" + map.keySet());
			String input=sc.next();
			System.out.println(map.get(input));
		}

		// the way below also works.

//		try (Scanner sc = new Scanner(System.in)) {
//			switch (sc.next()){
//			case "dog": {
//				System.out.println(map.get("dog"));
//				break;
//			}
//			case "car":{
//				System.out.println(map.get("car"));
//				break;
//			}
//			case "java":{
//				System.out.println(map.get("java"));
//				break;
//			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + sc.next());
//			}
//		}

	}

}
