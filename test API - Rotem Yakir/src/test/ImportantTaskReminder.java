package test;

public class ImportantTaskReminder implements Runnable {

	private Reminder reminder;
	Thread important = new Thread(this);

	public ImportantTaskReminder(Reminder reminder) {
		super();
		this.reminder = reminder;
	}

	public void start() {
		important.start();
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(60000);
				System.out.println("!!IMPORTANT REMINDER!! (number " + i + ") " + reminder);
				if (i == 3) {
					System.out.println("THIS IS THE LAST REMINDER ALERT");
				}
			} catch (InterruptedException e) {
				System.out.println("ImportantTaskReminder was imterrupted and will stop ");
				e.printStackTrace();
			}
			System.out.println();
		}
	}

}
