package birhtdaySystem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BirthdayStatistics {

	public static Map<Integer, Integer> getBirthdays(List<Person> people) {
		int janC = 0, febC = 0, marC = 0, aprC = 0, mayC = 0, junC = 0, julC = 0, augC = 0, sepC = 0, octC = 0,
				novC = 0, decC = 0;
		Map<Integer, Integer> birthdays = new LinkedHashMap<>();
		for (int i = 0; i < people.size(); i++) {
			int personBirthMonth = people.get(i).getBirthday().getMonthValue();
			switch (personBirthMonth) {
			case 1: {
				janC++;
				break;
			}
			case 2: {
				febC++;
				break;
			}
			case 3: {
				marC++;
				break;
			}
			case 4: {
				aprC++;
				break;
			}
			case 5: {
				mayC++;
				break;
			}
			case 6: {
				junC++;
				break;
			}
			case 7: {
				julC++;
				break;
			}
			case 8: {
				augC++;
				break;
			}
			case 9: {
				sepC++;
				break;
			}
			case 10: {
				octC++;
				break;
			}
			case 11: {
				novC++;
				break;
			}
			case 12: {
				decC++;
				break;
			}
			}
		}

		birthdays.put(1, janC);
		birthdays.put(2, febC);
		birthdays.put(3, marC);
		birthdays.put(4, aprC);
		birthdays.put(5, mayC);
		birthdays.put(6, junC);
		birthdays.put(7, julC);
		birthdays.put(8, augC);
		birthdays.put(9, sepC);
		birthdays.put(10, octC);
		birthdays.put(11, novC);
		birthdays.put(12, decC);
		return birthdays;
	}

	public static int getHappyMonth(List<Person> people) {
		int month = 0;
		int max = 0;

		Iterator<Map.Entry<Integer, Integer>> itr = getBirthdays(people).entrySet().iterator();
		while (itr.hasNext()) {
			int currMonth = itr.next().getKey();
			int currNum = itr.next().getValue();
			if (currNum > max) {
				max = currNum;
				month = currMonth;
			}
		}

		return month;
	}

	public static int getSadlyMonth(List<Person> people) {
		int month = 0;
		int min = 100000;

		Iterator<Map.Entry<Integer, Integer>> itr = getBirthdays(people).entrySet().iterator();
		while (itr.hasNext()) {
			int currMonth = itr.next().getKey();
			int currNum = itr.next().getValue();
			if (currNum < min) {
				min = currNum;
				month = currMonth;
			}
		}
		return month;
	}

	public static int countMembers(List<Person> people) {
		return people.size();
	}

}
