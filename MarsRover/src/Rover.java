

public class Rover {
	
	private static Position position = null;
	private static Plateau plateau = null;
	
	public enum Command {
	  RIGHT, LEFT, MOVE;

	private void process(Position position) {
	   switch (this) {
	    case RIGHT:
	     position.setDirectionRight();
	     break;
	    case LEFT:
	     position.setDirectionLeft();
	     break;
	    case MOVE:
	    	
	     switch (position.getDirection()) {
	     
	      case N:
	       position.increment(position.getY());
	       		if (plateau.y < position.getY()) {
	       			position.decrement(position.getY());
	       }
	       break;
	       
	      case E:
	       position.increment(position.getX());
      		if (plateau.x < position.getX()) {
      			position.decrement(position.getX());
      		}
	       break;
	       
	      case S:
	       position.decrement(position.getY());
      		if (plateau.y > position.getY()) {
      			position.increment(position.getY());
      		}
	       break;
	       
	      case W:
	       position.decrement(position.getX());
      		if (plateau.x > position.getX()) {
      			position.increment(position.getX());
      		}
      		break;
	   }
	  }
	 }
	  
	}


	 
	public Rover(Plateau plateau, Position position) {
		  this.position = position;
		  this.plateau = plateau;
	}
	
	public Position getPosition() {
		return Rover.position;
	}
	
	public void processCommands(Command[] commands) {
		  for (int i = 0; i < commands.length; i++) {
		   commands[i].process(Rover.position);
		  }
		 }

	
	
}
