package robotTar2;

public class RobotUtil {
	
	// this method is using polymorphism
	public static void activiate(Robot robot) {
		robot.work();
	}
	
	public static void main(String[] args) {
		activiate(new TeachingRobot());
		activiate(new DrivingRobot());
		
		PaintingRobot r = new PaintingRobot();
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
	}

}