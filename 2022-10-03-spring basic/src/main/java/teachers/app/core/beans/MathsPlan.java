package teachers.app.core.beans;

import org.springframework.stereotype.Component;

import teachers.app.core.TeachingPlan;

@Component
public class MathsPlan implements TeachingPlan {

	@Override
	public void doPlan() {
		System.out.println("calculate 1+9. calculate 6*209");

	}

}
