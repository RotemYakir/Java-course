package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ReminderSystem {

	private Scanner sc = new Scanner(System.in);
	private Set<Reminder> reminders = new HashSet<>();
	private Thread reminderThread = new Thread(new TaskReminder(reminders));

	public ReminderSystem() {
		super();
	}

	public void start() {
		System.out.println("Starting system, reminders are ON");
		reminderThread.start();
		this.displayMenu();
	}

	public void AddReminderFromUser() {
		System.out.print("enter expiration date of the reminder (yyyy-mm-dd): ");
		LocalDate expDate = LocalDate.parse(sc.nextLine());
		System.out.print("enter the expiration time of the reminder (hh:mm:ss): ");
		LocalTime expTime = LocalTime.parse(sc.nextLine());
		LocalDateTime expiration = LocalDateTime.of(expDate, expTime);
		System.out.println("enter reminder description: ");
		String desc = sc.nextLine();
		System.out.println("is the reminder important? (true/false) ");
		String SImportant =sc.nextLine();
		boolean important=Boolean.parseBoolean(SImportant);
		Reminder reminder = new Reminder(expiration, desc, important);
		if (addReminder(reminder) == false) {
			System.err.println(
					"Failed to add the reminder. might be already in the system or expiration date has already passed.");
		} else if (addReminder(reminder)) {
			System.out.println("the reminder has been added to the system. " + reminder);
		}
	}

	public boolean addReminder(Reminder reminder) {
		if (!reminders.contains(reminder) && reminder.getExpiration().isAfter(LocalDateTime.now())) {
			reminders.add(reminder);
			return true;
		}
		return false;
	}

	public void displayAllReminders() {
		List<Reminder> sorted=new ArrayList<>(reminders);
		Collections.sort(sorted);
		for (Reminder reminder : sorted) {
			System.out.println(reminder);
		}
	}

	public void displayMenu() {
		boolean exit = true;
		while (exit) {
			System.out.println("\n................... MENU ....................");
			System.out.println("add a reminder................................... add");
			System.out.println("display all reminders............................ display");
			System.out.println("exit............................................. exit");

			System.out.print("enter your choice: ");
			String choice = sc.nextLine();

			switch (choice) {
			case "add": {
				AddReminderFromUser();
				break;
			}
			case "display": {
				displayAllReminders();
				break;
			}
			case "exit": {
				System.out.println("The system and it's reminders are now OFF");
				exit = false;
				reminderThread.interrupt();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}

	}
}