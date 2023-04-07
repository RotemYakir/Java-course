package exceptionsTar;

public class Point {

	// bounds for x / y coordinations
// in any attempt to assign illegal values - throw an unchecked exception

	public static final int MIN = 10;
	public static final int MAX = 20;

	private int x;
	private int y;

	// CTORs

	public void point() {

	}

	public Point(int val) {
		setX(val);
		setY(val);
	}

	public Point(int x, int y) {
		super();
		setX(x);
		setY(y);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws PointXYException {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		} else {
			throw new PointXYException("illegal x value");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws PointXYException {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		} else {
			throw new PointXYException("illegal y value");
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
