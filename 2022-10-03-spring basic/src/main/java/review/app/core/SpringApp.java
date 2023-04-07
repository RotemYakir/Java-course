package review.app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import review.app.core.beans.Superman;


@Configuration
@ComponentScan
public class SpringApp {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class)){
			System.out.println("container is up");
			Superman superman =ctx.getBean(Superman.class);
			System.out.println(superman);
			
			String msg = ctx.getBean(String.class);
			System.out.println(msg);
		}
		
		
	}
	@Bean
	public String message() {
		return "Hello";
	}

}
