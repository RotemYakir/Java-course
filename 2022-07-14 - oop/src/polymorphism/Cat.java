package polymorphism;

public class Cat extends Animal {

	@Override
	public void speak() {
		System.out.println("speak like a cat");
	}

	public void scratch() {
		System.out.println("scratch like a cat");

	}

}
