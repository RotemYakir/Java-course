package polymorphism;

public class Test {

	public static void main(String[] args) {

		Animal a; // reference of type animal (general)
		a = new Dog(); // point to a specific type of animal
		a.speak(); // use the dog behavior

		Animal b; // reference of type animal (general)
		b = new Cat();// point to a specific type of animal
		b.speak(); // use the dog behavior

		System.out.println("=======================");
		
		// arrays
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[0].speak();
		animals[1].speak();
		
		
		System.out.println("=======================");
		
		Animal animal = new Cat() ;
		if (animal instanceof Cat) {
		((Cat)animal).scratch();
		}
		System.out.println("=======================");
	}

}
