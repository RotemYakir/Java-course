package app.core;

public class CoffeMakerSugarCountProxy implements CoffeeMaker {

	private CoffeeMaker coffeeMaker;
	private int sugarcount;

	public CoffeMakerSugarCountProxy(CoffeeMaker coffeeMaker) {
		super();
		this.coffeeMaker = coffeeMaker;
	}

	@Override
	public void makeCoffee() {
		this.coffeeMaker.makeCoffee(); // just sent the helper to make coffee
	}

	@Override
	public void addSugar() {
		this.coffeeMaker.addSugar(); // just sent the helper to add sugar
		sugarcount++;
	}

}
