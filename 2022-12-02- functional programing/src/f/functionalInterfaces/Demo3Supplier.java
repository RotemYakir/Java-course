package f.functionalInterfaces;

import java.util.function.Supplier;

public class Demo3Supplier {
	
	private static String[] names = { "moshe", "lea", "david", "itay", "dafna", "mira" };

	public static void main(String[] args) {

		Supplier<Integer> randomizer = () -> (int) (Math.random() * 101);

		int a = randomizer.get();
		int b = randomizer.get();
		int c = randomizer.get();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		Supplier<String> randomName = () -> names[(int) (Math.random() * names.length)];
		
		System.out.println(randomName.get());

	}

}
