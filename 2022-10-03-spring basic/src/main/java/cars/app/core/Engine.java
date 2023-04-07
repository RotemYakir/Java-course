package cars.app.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("protorype")
public interface Engine {

	void turnOn();
	void turnOff();
	
	
	
}
