
public class Rover{
	
	//TODO: Need to be able to import the input as a text file
	
	private static Position position = null;
	private static Plateau plateau = null;
	
	
	/**
	 * 
	 * R: Turn Right
	 * L: Turn Left
	 * M: Move forward
	 *
	 */
	public enum Command {
	  R, L, M;
	}

	 
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
	
	
	// Apparently the if clause with the (position != plateau does not work, but still Prints and increments :o
	
	// Idea: create method out of bounds and try to include it in this:
	
	private void move() {
		switch (position.getDirection()) {
		
		case N:
			if (position.getY() != plateau.getY()) {
				System.out.println("HEY");
				position.incrementY();	
			}
			else {
				;}
			break;
			
		case E:
	      	if (plateau.getX() != position.getX()) {
	      		System.out.println("Hola");
	      		position.incrementX();
	      		}
	      	else {;}
		    break;
		   
		 case S:
		     position.decrementY();
	      	break;
		       
		 case W:
			 position.decrementX();
	      	break;
		}
	
	}
	
	
}
