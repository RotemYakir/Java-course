package animals;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Ostrich();
		animals[3] = new Ant();
		// animals[4]=new Dog(); null
		animals[5] = new Bat();
		// animals[6]=new Dog(); null
		animals[7] = new Sparrow();
		animals[8] = new Dog();
		animals[9] = new Sparrow();

		for (Animal animal : animals) {
			if (animal != null) {
				animal.speak();
				if (animal instanceof AdvancedFlyer) {
					((AdvancedFlyer) animal).takeOff();
					((AdvancedFlyer) animal).navigate();
					((AdvancedFlyer) animal).land();
				} else if (animal instanceof Flyer) {
					Flyer flyer = (Flyer) animal;
					flyer.fly();
				} else if (animal instanceof Navigator) {
					((Navigator) animal).navigate();
				}
			} else {
				System.out.println(animal);
			}
			System.out.println("=====================");
		}

	}

}
