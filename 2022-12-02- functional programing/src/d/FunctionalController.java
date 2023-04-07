package d;

public class FunctionalController {

	public int instanceVar = 5; // instance variables can be captured
	public static int classVar = 10; // class variables can be captured

	public Randomizer getrRandomizer() {

		int localVar = 100; // local variables can be captured - must be final
		Randomizer randomizer = () -> {
			int r = localVar + this.instanceVar + classVar;
			return r;
		};
		return randomizer;
	}

	public static void main(String[] args) {
		FunctionalController controller = new FunctionalController();
		Randomizer randomizer = controller.getrRandomizer();
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		controller.instanceVar = 10;
		System.out.println(randomizer.get());
		FunctionalController.classVar=900;
		System.out.println(randomizer.get());
	}

}
