package app.core.coffee;

import org.springframework.stereotype.Component;

@Component
public class BlackCoffeeMaker implements CoffeeMaker {

	
	public void makeCoffee() {
		System.out.println("making black coffee");
	}

	public void addSugar() {
		System.out.println("adding white sugar");
	}

}
