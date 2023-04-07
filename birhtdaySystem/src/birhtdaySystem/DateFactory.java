package birhtdaySystem;

import java.time.LocalDate;

public class DateFactory {

	public static LocalDate getRandomDate() {
		int day = (int) (Math.random() * 28) + 1;
		int year = (int) (Math.random() * 1961) + 50;
		int month = (int) (Math.random() * 12) + 1;
		LocalDate date = LocalDate.of(year, month, day);
		return date;
	}

}
