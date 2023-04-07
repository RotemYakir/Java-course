package app.core;

public class CoffeeMakerImpl implements CoffeeMaker {

	@Override
	public void makeCoffee() {
		System.out.println("making coffee");
	}

	@Override
	public void addSugar() {
		System.out.println("adding sugar");
	}

}
