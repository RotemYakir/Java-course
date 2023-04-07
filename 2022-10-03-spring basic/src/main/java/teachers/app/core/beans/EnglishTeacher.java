package teachers.app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import teachers.app.core.Teacher;
import teachers.app.core.TeachingPlan;

@Component
public class EnglishTeacher implements Teacher {

	private TeachingPlan plan;
	@Value("${teacher.english.hours}")
	private int hours;
	@Value("${school.address}")
	private String address;

	@Autowired
	public EnglishTeacher(@Qualifier("englishPlan") TeachingPlan plan) {
		super();
		this.plan = plan;
	}
	@Override
	public void teach() {
		System.out.println("number of hours: "+hours);
		System.out.println("school adress: " + address);
		plan.doPlan();
	}
}
