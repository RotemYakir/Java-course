package birhtdaySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BirthdaySystemReminder {

	private Set<Person> people;
	private BirthdayTask task;
	private static Scanner sc;

	public BirthdaySystemReminder() {
		people = new HashSet<>();
	}

	public void showMenu() {

		System.out.println("--------------------MENU--------------------");
		System.out.println("Add a friend...............................1");
		System.out.println("Delete a friend............................2");
		System.out.println("Print all friends..........................3");
		System.out.println("Print my Friends...........................4");
		System.out.println("Happy month................................5");
		System.out.println("Sadly month................................6");
		System.out.println("Print events...............................7");
		System.out.println("Quit system................................8");
		System.out.print("Enter your choice: ");
		String choice = sc.nextLine();

		switch (choice) {
		case "1": {
			addPerson(null);
			break;
		}
		case "2": {
			
			break;
		}
		case "3": {
			
			break;
		}
		case "4": {
			
			break;
		}
		case "5": {
			
			break;
		}
		case "6": {
			
			break;
		}
		case "7": {
			
			break;
		}
		case "8": {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
	}

	public void startSystem() {

	}

	public void endSystem() {

	}

	public void addPerson() {
		Person person = new Person();
		person.setBirthday(DateFactory.getRandomDate());
		this.people.add(person);
	}

	public void deletePerson(int id) {
		Person p = new Person();
		p.setId(id);
		people.remove(p);
	}

	public void printAll() {
		List<Person> sorted = new ArrayList<>(people);
		Collections.sort(sorted);
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
		}
	}
}
