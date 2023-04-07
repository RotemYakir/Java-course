package teachers.app.core.beans;

import org.springframework.stereotype.Component;

import teachers.app.core.TeachingPlan;

@Component
public class EnglishPlan implements TeachingPlan {

	@Override
	public void doPlan() {
		System.out.println("open english book at page 400. start reading for 45 minutes");
	}

}
