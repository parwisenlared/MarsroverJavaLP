
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
	
	
	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}
	
	// Process the input and do the correspondent actions
	
	private void process(Character command) {
		if (command.equals('L')) {
			position.setDirectionLeft();
		} else if (command.equals('R')) {
			position.setDirectionRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Command not valid");
		}
	}
	
	
	
	
	// Idea: create method out of bounds and try to include it in this:
	
	private void move() {
		
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
			 if (position.getY() != plateau.getY()) {
				position.decrementY();
			}
	      	break;
		       
		 case W:
			 if (position.getX() != plateau.getX()) {
				position.decrementX();
			}
	      	break;
		}
		
	
	}
	
	
}
