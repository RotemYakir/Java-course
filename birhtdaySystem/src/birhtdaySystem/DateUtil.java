package birhtdaySystem;

import java.time.LocalDate;

public class DateUtil {

	public static String beautifyDate(LocalDate date) {
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		String birth = day + "/" + month + "/" + year;
		//SimpleDateFormat format = new SimpleDateFormat(birth);
		return birth;
		
	}
	
}
