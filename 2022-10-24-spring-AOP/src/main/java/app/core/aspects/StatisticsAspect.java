package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StatisticsAspect {

	private int sugarCount;
	private int coffeeCount;
	private int buyCount;
	private int buyAll;
	private int countGeneral;
	private int SellCountSpecific;

	@Before("execution(void addSugar())")
	public void sugarCount() {
		sugarCount++;
		// System.out.println("added sugar " + sugarCount + " times");
	}

	@Before("execution(void makeCoffee())")
	public void makingCoffeeCount() {
		coffeeCount++;
		// System.out.println("made coffee " + coffeCount + " times");
	}

	@Before("execution(void buy*())")
	public void buyCount() {
		buyCount++;
	}

	//Pointcut Expression Language Syntax:
	//execution - pointcut designator
	 /* access level
	 * return type - MUST
	 * package
	 * method name - MUST
	 * parameters - MUST
	 * throws
	 */
	
	@Before("execution(public void app.core.coffee.Store.sellCoffee(int))")
	public void countSpecific() {
		System.out.println("-------------------------->>> specific");
		SellCountSpecific++;
	}

	// (..) 0 or more parameters of any type
	// (.) 1 parameters of any type
	@Before("execution(* * (..))")
	public void countGeneral() {
		System.out.println("------------------------->>> any method, any class, any package");
		countGeneral++;
	}

	public int getSugarCount() {
		return sugarCount;
	}

	public int getCoffeeCount() {
		return coffeeCount;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public int getBuyAll() {
		return buyAll;
	}

	public int getCountGeneral() {
		return countGeneral;
	}

	public int getSellCountSpecific() {
		return SellCountSpecific;
	}
	
	

}
