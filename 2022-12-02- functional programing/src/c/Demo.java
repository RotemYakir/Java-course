package c;

public class Demo {

	public static void main(String[] args) {

		MyFunctionalInterface x = (n1, n2) -> n1 + n2;
		System.out.println(x.add(100, 300));

	}

}
