package b.lambdaDemo;

public class threadDemo {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i < 4; i++) {
				System.out.println(i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		new Thread(() -> System.out.println("hi")).start();

	}

}
