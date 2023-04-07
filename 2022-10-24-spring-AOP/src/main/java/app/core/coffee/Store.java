package app.core.coffee;

import org.springframework.stereotype.Component;

@Component
public class Store {

	public void sellCoffee() {
		System.out.println("sell coffe");
	}
	
	public void sellCoffee(int ml) {
		System.out.println("sell coffe - "+ml+ " ml");
	}

	public void sellSugar() {
		System.out.println("sell sugar");
	}

	public void sellPaperCup() {
		System.out.println("sell paper cups");
	}
	
	public void buyCoffeeBeans() {
		System.out.println("buy coffee beans");
	}
	
	public void buyMilk() {
		System.out.println("buy milk");
	}
}
