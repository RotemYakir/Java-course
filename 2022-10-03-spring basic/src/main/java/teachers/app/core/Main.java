package teachers.app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
@ComponentScan
public class Main {

	public static void main(String[] args) {

		try(var ctx= new AnnotationConfigApplicationContext(Main.class)){
			
			Teacher teacher;
			
			teacher = ctx.getBean("englishTeacher", Teacher.class);
			teacher.teach();
			teacher = ctx.getBean("mathsTeacher", Teacher.class);
			teacher.teach();
			
		}
		
		
	}

}
