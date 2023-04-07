package birhtdaySystem;

import java.time.LocalDate;

public class MainRun {

	public static void main(String[] args) {

	Person p= new Person();
	
	
	p.setBirthday(LocalDate.of(1997,04,30));
	System.out.println(p.getBirthday());
	
	
	System.out.println(p.toString());
	
	
	}

}
