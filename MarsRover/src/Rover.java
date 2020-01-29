
public class Rover{
	
	//TODO: Need to be able to import the input as a text file
	
	private static Position position;
	private static Plateau plateau;
	
	
	/**
	 * 
	 * R: Turn Right
	 * L: Turn Left
	 * M: Move forward
	 *
	 */
	

	public Rover(Plateau plateau, Position position) {
		  this.position = position;
		  this.plateau = plateau;
	}
	
	public Position getPosition() {
		return Rover.position;
	}
	
	public Plateau getPlateau() {
		return Rover.plateau;
	}
	
	public Position getDirection() {
		return position;
	}
	
	
	
	
	// Idea: create method out of bounds and try to include it in this:
	
	public void move() {
		
		switch (position.getDirection()) {
		
		case N:
			if (position.getY() != plateau.getY()) {
				position.incrementY();
				}
			break;
			
		case E:
			if (position.getX() != plateau.getX()) {
				position.incrementX();
				}
		    break;
		   
		 case S:
			 if (position.getY() != 0) {
				position.decrementY();
			}
	      	break;
		       
		 case W:
			 if (position.getX() != 0) {
				position.decrementX();	
			}
	      	break;
		}
		
	
	}
	
	
}
