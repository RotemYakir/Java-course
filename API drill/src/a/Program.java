package a;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {

	private Scanner sc = new Scanner(System.in);
	Scheduler scheduler = new Scheduler(1500);

	
	public static void main(String[] args) {

		Program program = new Program();
		program.start();

	}

	public void start() {

		lbl: while (true) {
			System.out.println(" MENU: \n \n ");
			System.out.println("start monitoring........................... start");
			System.out.println("stop monitoring............................ stop");
			System.out.println("add task................................... add");
			System.out.println("display all tasks.......................... display");
			System.out.println("exit....................................... exit");

			System.out.print("enter your choice: ");
			String choice = sc.next();

			switch (choice) {
			case "start": {
				scheduler.startMonitoringTasks();
				break;
			}
			case "stop": {
				scheduler.stopMonitoringTasks();
				break;
			}
			case "add": {
				addTaskFromUser();
				break;
			}
			case "display": {
				scheduler.displayTasks();
				break;
			}
			case "exit": {
				break lbl;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

	private void addTaskFromUser() {
		Task task = new Task();
		System.out.print("enter description: ");
		task.setDescription(sc.nextLine());
		sc.nextLine();
		System.out.println("enter deadline time today: hh:mm:ss ");
		LocalTime time = LocalTime.parse(sc.nextLine());
		task.setDeadline(LocalDateTime.of(LocalDate.now(), time));
		scheduler.addTask(task);
		System.out.println("Added: " + task);
		
	}

}
