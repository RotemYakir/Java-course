package rectangle;

public class Rectangle {

	private int length;
	private int width;
	

	// constructor
	public Rectangle() {

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if(length>0) {			
			this.length = length;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width>0) {			
		this.width = width;
		}
	}

	public int getArea() {
     return width*length;		
	}
	
		
	}


