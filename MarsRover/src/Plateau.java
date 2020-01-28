

/*
 *  This class contains methods to define the GRID the rover will be running on.
 *  When loading the input (ideally via an the imput text - not done yet)
 *  	the first line defines the x,y limits of the plateau
 *  
 *  contructor
 */

public class Plateau {

	private int width;
	private int height;
	
	public Plateau (int topRight, int bottomRight) {
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
	
	
	// IDEA for JUnit Test: no negative numbers allowed.
	
	// Idea: put a memthod boolean outofbounds... to check if rover is trying to go out of the plateau
}
