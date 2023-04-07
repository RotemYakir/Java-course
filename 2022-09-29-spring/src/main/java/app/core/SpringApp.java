package app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;

@ComponentScan  // configuration to scan bean definitions (with @component)
@Configuration
public class SpringApp {

	
	@Bean //creating a bean
	public Person p2() {  // the bean name is the method name.
		Person p =new Person();
		p.setName("Moshe");
		return p;
	}
	
	@Bean
	@Scope("prototype")
	public Integer random() {
		Integer r= ((int) (Math.random()*101));
		return r;
	}
	
	public static void main(String[] args) {
		
		// create a spring container object
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class);

		//get a reference to a bean
		Person p1 = ctx.getBean( "person",Person.class);
		System.out.println(p1);
		//get a reference to a bean
		Person p2 = ctx.getBean("p2", Person.class);
		System.out.println(p2);
		
		Integer r=ctx.getBean(Integer.class);
		Integer r2=ctx.getBean(Integer.class);
		System.out.println(r);
		System.out.println(r2);
	}

}
