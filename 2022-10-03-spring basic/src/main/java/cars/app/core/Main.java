package cars.app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {

		
		try(var ctx = new AnnotationConfigApplicationContext(Main.class)){
			
			Car familyCar = ctx.getBean("familyCar",Car.class);
			familyCar.drive();
			System.out.println(familyCar.getNumber());
			
			Car f1 =ctx.getBean("f1",Car.class);
			f1.drive();
			System.out.println(f1.getNumber());
			
			Car susita=ctx.getBean("susita",Car.class);
			susita.drive();
			System.out.println(susita.getNumber());
			
			Car susitaBasic=ctx.getBean("basicEngineSusita",Car.class);
			susitaBasic.drive();
			System.out.println(susitaBasic.getNumber());
				
			}
		}
	private static int nextCarNumber=101;
	
	@Bean
	@Scope("prototype")
	public Integer carNumber() {
		return nextCarNumber++;
	}
	
	@Bean
	@Scope("prototype")
	public Susita basicEngineSusita(@Qualifier("basicEngine") Engine engine) {
		Susita susita = new Susita(engine);
		return susita;
	}

}
