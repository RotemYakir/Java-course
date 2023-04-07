package cars.app.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

    // @Primary
@Component
@Scope("prototype")
public class BasicEngine implements Engine {

	@Override
	public void turnOn() {
System.out.println("BasicEngine on");		
	}

	@Override
	public void turnOff() {
System.out.println("BasicEngine off");		
	}

	



}
