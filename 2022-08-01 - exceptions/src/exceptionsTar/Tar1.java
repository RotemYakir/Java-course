package exceptionsTar;

public class Tar1 {


	public static void main(String[] args) {
		String val = "125A";
		int x = parse(val);
		System.out.println(x);
		val = "149";
		int y = parse(val);
		System.out.println(y);
	}

	public static int parse(String val) {
		try {
			return Integer.parseInt(val);
		} catch (Exception e) {
			return 0;

		}

	}

}
