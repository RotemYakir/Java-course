package exampleOfClassDeclaration;

public class Point {

	//private attributes:
	private int x;
	private int y;
	
	//public attributes:
	public String description;
	
	//constructor(creates the point at 0,0)
	public Point () {
	}
	
	//creates a point at specified location
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//creates a point at specified location where x and y are equal
	public Point (int val) {
		this(val,val); //calls another constructor in this class
		//this.x=val;
		//this.y=val;
	}
	
	//methods:
	
	//move point to the right and return the current x
	public int moveRight(int units) {
		x = x+units;
		return x;
	}
	//move point to the left and return the current x
	public int moveLeft(int units) {
		x = x-units;
		return x;
	}
	
	public void moveUp(int units) {
		y = y+units;
	}
	
	public void moveDown(int units) {
		y = y-units;
	}
	
	
	public String getPointDetails() {
		return "("+x+","+y+")";  //return (x,y)
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
}
