package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {

		Map<String , String> mapDictionary= new HashMap<>();
		
		// add entries
		mapDictionary.put("table", "a furniture with 4 legs");
		mapDictionary.put("java", "a programming language");
		mapDictionary.put("moon", "a heavenly body");
		
		System.out.println(mapDictionary);
		
		try (Scanner sc= new Scanner(System.in);){
			System.out.println("enter word: ");
			String key = sc.next();
			System.out.println(mapDictionary.get(key));
		}
		
		
	}

}
