
public class Position implements PositionIF{

	private int x = 0;
	private int y = 0;
	private Direction direction = null;
	  
	public Position(int x, int y, Direction n) {
	  this.direction = n;
	  this.x = x;
	  this.y = y;
	 }
	 

	
	public String getPosition() {
		return x + " " + y;
	}
	

	protected void setDirectionRight() {
		direction = direction.right();
	}
	
	 
	protected void setDirectionLeft() {
		direction = direction.left();
	}
	 
	public int increment(int a) {
		a++;
		return a;
	}
	
	public int decrement(int a) {
		a--;
		return a;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
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
	
}
