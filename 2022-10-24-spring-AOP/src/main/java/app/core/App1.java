package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.aspects.StatisticsAspect;
import app.core.coffee.CoffeeMaker;
import app.core.coffee.Store;

@ComponentScan
@EnableAspectJAutoProxy
public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App1.class);) {
			CoffeeMaker coffeeMaker = ctx.getBean(CoffeeMaker.class);
			System.out.println(coffeeMaker.getClass().getSimpleName());
			coffeeMaker.makeCoffee();
			coffeeMaker.makeCoffee();
			coffeeMaker.addSugar();
			coffeeMaker.addSugar();
			coffeeMaker.addSugar();
			
			Store store = ctx.getBean(Store.class);
			store.buyCoffeeBeans();
			store.buyCoffeeBeans();
			store.buyCoffeeBeans();
			store.buyMilk();
			store.buyMilk();
			store.sellCoffee();
			store.sellCoffee(5);
			
			
			System.out.println("stats ================");
			StatisticsAspect stats = ctx.getBean(StatisticsAspect.class);
			System.out.println("number of coffee made: "+ stats.getCoffeeCount());
			System.out.println("number of sugar used: "+ stats.getSugarCount());
			System.out.println("number of things bought by the store: "+ stats.getBuyCount());
		}
	}
}
