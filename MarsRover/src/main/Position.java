package main;
/*
 * This class holds the information regarding to the Position of the Rover and its methods to update and access 
 * to the variables. Implements the Position Interface Class that holds methods for the direction of the Rover.
 * 
 * In this class methods for moving the rover around the the grid can be found 
 * 		(increment and decrement the x,y positions)
 * 
 * 
 */


public class Position implements PositionIF{

	private int x;
	private int y;
	private Direction direction = null;
	  
	public Position(int x, int y, Direction n) {
	  this.direction = n;
	  this.x = x;
	  this.y = y;
	 }
	 

	
	public String getPosition() {
		return x + " " + y;
	}
	
	protected void setPosition(int x,int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	

	protected void setDirectionRight() {
		direction = direction.right();
	}
	
	 
	protected void setDirectionLeft() {
		direction = direction.left();
	}
	 
	public void incrementX() {
		x = this.x;
		x++;
		this.x = x;
	}
	
	public void incrementY() {
		y = this.y;
		y++;
		this.y = y;
	}
	
	public void decrementX() {
		x = this.x;
		x--;
		this.x = x;
	}
	
	protected void decrementY() {
		y = this.y;
		y--;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

	 @Override
	public Direction getDirection() {
		 return direction;
	}

	 
	 @Override
	public String toString() {
		 return getX() + " " + getY() + " " 
				 + getDirection().name();
	 }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (direction != other.direction)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	 
	 
	
}
