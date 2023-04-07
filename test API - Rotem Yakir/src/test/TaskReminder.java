package test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class TaskReminder implements Runnable {

	private Set<Reminder> reminders = new HashSet<>();
	private ImportantTaskReminder importantthread;

	public TaskReminder(Set<Reminder> reminders) {
		super();
		this.reminders = reminders;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(4);
				for (Reminder reminder : reminders) {
					if (reminder.getExpiration().isBefore(LocalDateTime.now()) && !reminder.isPopped()) {
						System.out.println("ALERT - " + reminder);
						reminder.setPopped(true);
						if (reminder.isImportant()) {
							importantthread = new ImportantTaskReminder(reminder);
							importantthread.start();
						}
					}
				}
			} catch (InterruptedException e) {
				System.out.println("TaskReminder was imterrupted and will stop. ");
			}
		}
	}
	
}


