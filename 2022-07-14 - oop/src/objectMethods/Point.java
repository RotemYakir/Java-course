package objectMethods;

import java.util.Objects;

public class Point {
	
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}

	//override toString, hashcode, equals 
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	
	

}
