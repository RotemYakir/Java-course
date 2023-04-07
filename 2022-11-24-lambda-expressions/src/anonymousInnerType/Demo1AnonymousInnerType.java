package anonymousInnerType;

public class Demo1AnonymousInnerType {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("hi");
			}
		};

		Thread t = new Thread(runnable);
		t.start();

	}

}
