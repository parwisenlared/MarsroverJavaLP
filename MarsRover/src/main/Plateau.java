package main;

/*
 *  This class contains methods to define the Plateau (grid) the Rover will be running on.
 *  
 *  In this implementation, the plateau coordinates must be bigger than 0,0 
 *  	so that the Rover can move at least 1 coordinate in x and y.
 *  
 * 
 */

public class Plateau {

	private int width;
	private int height;
	
	
	public Plateau (int topRight, int bottomRight) {
		if (topRight <= 0) throw new IllegalArgumentException("Value of number coordinate X must be bigger than 0");
		if (bottomRight <= 0) throw new IllegalArgumentException("Value of number coordinate Y must be bigger than 0");
		this.width = topRight;
		this.height = bottomRight;
	}

	public int getX() {
		return width;
	}

	public void setX(int x) {
		this.width = x;
	}

	public int getY() {
		return height;
	}

	public void setY(int y) {
		this.height = y;
	}
	
	public String toString() {
		 return getX() + " " + getY();
	}
	
	
}
