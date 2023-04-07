package lab1;

public class Test {

	private static int max;

	public static void main(String[] args) {

		// 3
		System.out.println("//3");
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		System.out.println(a + "," + b);
		System.out.println("sum:" + a + b);
		System.out.println("avg:" + (a + b) / 2D);
		System.out.println("Right digit a: " + a % 10 + " Right digit b: " + b % 10);
		System.out.println("the area of a rectangle is: " + a * b);

		// 4
		System.out.println("//4");
		int minutes = (int) (100 + (Math.random() * 251));
		System.out.println("the time of the movie (in minutes) is:" + minutes);

		if (minutes % 60 >= 10) {
			System.out.println("the time of the movie is: " + minutes / 60 + ":" + minutes % 60);
		} else {
			System.out.println("the time of the movie is: " + minutes / 60 + ":0" + minutes % 60);
		}
		// 5
		System.out.println("//5");
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 101);
		
		
		if (c > d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}

	}
}
