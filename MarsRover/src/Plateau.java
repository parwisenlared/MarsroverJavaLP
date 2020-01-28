

/*
 *  This class contains methods to define the GRID the rover will be running on.
 *  When loading the input (ideally via an the imput text - not done yet)
 *  	the first line defines the x,y limits of the plateau
 */
public class Plateau {

	private int x;
	private int y;
	
	public Plateau (int topRight, int bottomRight) {
		topRight = x;
		bottomRight = y;
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
	
	
	// IDEA for JUnit Test: no negative numbers allowed.
	
	// Idea: put a memthod boolean outofbounds... to check if rover is trying to go out of the plateau
}
