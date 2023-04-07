package app.core.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.annotations.MyAopAnnotation;

@Component
public class TrafficService {

	@Autowired // injects this bean
	private Random random;

	@MyAopAnnotation
	public void m1() {
		System.out.println("m1");
	}

	@MyAopAnnotation
	public void m2() {
		System.out.println("m2");
	}

	private String[] updates = { "Traffic flows", "Traffic Jam", "Traffic congestion", "Roads are busy" };

	public String getTrafficUpdate() {
		int index = random.nextInt(updates.length);
		System.out.println("TARGET RETURNS");
		if (Math.random() < 0.5) {
			return updates[index];
		} else {
			throw new RuntimeException("TARGET THROWS");
		}
	}
}
