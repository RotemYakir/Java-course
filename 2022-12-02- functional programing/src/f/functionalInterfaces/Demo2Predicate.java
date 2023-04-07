package f.functionalInterfaces;

import java.util.function.Predicate;

public class Demo2Predicate {

	public static void main(String[] args) {

		Predicate<String> isStringUpTo10Characters = str -> str.length() <= 10;
		Predicate<String> isStartingWithA = str -> str.startsWith("a") || str.startsWith("A");
		// function composition
		Predicate<String> startsWithAAndUpTo10Chars = isStartingWithA.and(isStringUpTo10Characters);

		System.out.println(isStringUpTo10Characters.test("sdflksdafsafasj"));
		System.out.println(isStringUpTo10Characters.test("dskfj"));

		System.out.println();
		System.out.println(isStartingWithA.test("bob"));
		System.out.println(isStartingWithA.test("arik"));

		System.out.println();
		System.out.println(startsWithAAndUpTo10Chars.test("aoidfs"));
		System.out.println(startsWithAAndUpTo10Chars.test("fsoidfsojfsfsfd"));
		System.out.println(startsWithAAndUpTo10Chars.test("aoidffsosdfjf"));

	}

}
