package carsProject2;

public class Car {

private int number;
private int speed; //0-110


public Car(int number, int speed) {
	super();
	this.number = number;
	this.setSpeed(speed);
}


public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}


public int getSpeed() {
	return speed;
}


public void setSpeed(int speed) {
	if(speed>-1&&speed<111) {		
	this.speed = speed;
	}else {
		System.out.println("speed"+speed+"is not in the range of 0-110");
	}

}

@Override
public String toString() {
	return "Car [number=" + number + ", speed=" + speed + "]";
}

	
}
