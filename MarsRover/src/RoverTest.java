
public class RoverTest{
	/**
	  * @param args
	  */
	public static void main(String[] args) {
	  // Test 1 LMLMLMLMM
		 
		Plateau plateau = new Plateau(5,5);
		Position position = new Position(1,2,PositionIF.Direction.E);
		Rover rover1 = new Rover(plateau, position);
		
		
		System.out.println(rover1.getPosition());
		
		rover1.processCommands(new Rover.Command[] {Rover.Command.RIGHT, Rover.Command.MOVE});
				//Rover.Command.LEFT, Rover.Command.MOVE, Rover.Command.LEFT, Rover.Command.MOVE,
				//Rover.Command.LEFT, Rover.Command.MOVE, Rover.Command.MOVE });
	
	  
		System.out.println(rover1.getPosition());
	}
		
	  /**
		System.out.println(rover1.getPosition());
		rover1.processCommands(new Rover.Command[] { Rover.Command.LEFT, Rover.Command.MOVE,
				Rover.Command.LEFT, Rover.Command.MOVE, Rover.Command.LEFT, Rover.Command.MOVE,
				Rover.Command.LEFT, Rover.Command.MOVE, Rover.Command.MOVE });
	
	  
		System.out.println(rover1.getPosition());
		}
	 
	  // Test 2 MMRMMRMRRM
		Rover rover2 = new Rover(new PositionIF.Axis(3),
				new PositionIF.Axis(3), PositionIF.Direction.E);
		rover2.processCommands(new Rover.Command[] { Rover.Command.MOVE, Rover.Command.MOVE,
				Rover.Command.RIGHT, Rover.Command.MOVE, Rover.Command.MOVE, Rover.Command.RIGHT,
				Rover.Command.MOVE, Rover.Command.RIGHT, Rover.Command.RIGHT, Rover.Command.MOVE });
		
		System.out.println(rover2.getPosition());
	  
	 }
	   **/
	
}
