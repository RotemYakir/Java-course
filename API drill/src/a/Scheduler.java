package a;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {

	private List<Task> tasks=new ArrayList<>();
	private boolean monitoringActive;
	private long checkRateMilis=3000;
	private Thread thread;

	public Scheduler(long checkRateMilis) {
		super();
		this.checkRateMilis = checkRateMilis;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public boolean removeTask(int id) {
		return tasks.remove(new Task(id));
	}

	public void displayTasks() {
		System.out.println("The tasks are: ");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println(tasks.get(i));
		}
	}

	public Task getTask(int id) {
		int ind = tasks.indexOf(new Task(id));
		if (ind > -1) {
			return tasks.get(ind);
		}
		return null;
	}

	public void checkDeadlines() {
		LocalDateTime now = LocalDateTime.now();
		for (Task task : tasks) {
			if (task.getDeadline().isBefore(now) && !task.isAlertPopped()) {
				System.out.println("!!! DEADLINE ALERT " + task);
				task.setAlertPopped(true);
			}
		}
	}

	public void startMonitoringTasks() {
		if (monitoringActive) {
			throw new RuntimeException("FAILED. monitor is already active.");
		}
		thread = new Thread(new Monitor());
		thread.start();
		monitoringActive = true;
	}

	public void stopMonitoringTasks() {
		if (thread != null) {
			thread.interrupt();
			monitoringActive = false;
		}
	}

	private class Monitor implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(Scheduler.this.checkRateMilis);
					Scheduler.this.checkDeadlines();
				} catch (InterruptedException e) {
					System.out.println("monitoring tasks was interrupted and will stop.");
				}

			}

		}

	}

}




