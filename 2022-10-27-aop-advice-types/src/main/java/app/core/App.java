package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.service.TrafficService;

public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			TrafficService trafficService = ctx.getBean(TrafficService.class);
			// call business method
			String msg = trafficService.getTrafficUpdate();
			System.out.println();
			System.out.println();
			System.out.println(msg);
			
			trafficService.m1();
			trafficService.m2();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}

}
