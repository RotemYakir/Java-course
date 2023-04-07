package robotTar2;

public class PaintingRobot extends Robot implements Chargable {

	private int battery = 10;

	@Override
	public void work() {
		if(battery > 0) {
			System.out.println("robot is painting");
			battery--;
		}else {
			System.out.println("batery empty - charging");
			charge();
		}
	}

	@Override
	public void charge() {
		battery = 10;
	}

	@Override
	public int getBatteryLevel() {
		return battery;
	}
}
