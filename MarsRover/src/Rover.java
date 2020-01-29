/**
 * 
 * 	This class holds the information about the Rover and methods to move and change position once the instructions
 * 		have been triggered. 
 * 
 * 	The method moves checks that the rover does not move out of bounds.
 * 
 * 
 */


public class Rover{
	

	
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
	
	
	
	
	/*
	 *  Call this method to make the rover move. 
	 *  An initial position and plateau are needed for the rover to move.
	 */
		
	
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
