package robotTar1;

public class Test {

	public static void main(String[] args) {

		
		Robot robot = new Robot();
		System.out.println(robot.work());
		robot = new IRobot();
		System.out.println(robot.work());
	}

}
