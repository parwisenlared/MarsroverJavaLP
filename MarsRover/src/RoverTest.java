
public class RoverTest{
	/**
	  * @param args
	  */
	public static void main(String[] args) {
		
	/*
	 * To be resolved: limit for Plateau is not well defined. I use the swithc and case tool, 
	 * hence I think the if clause is not doing any work and my rover goes out of bounds.	
	 */
	
	  // Test 1 LMLMLMLMM
		 
		Plateau plateau = new Plateau(5,5);
		Position position = new Position(1,2,PositionIF.Direction.N);
		Rover rover1 = new Rover(plateau, position);
		
		
		System.out.println(rover1.getPosition());
		
		rover1.process("RMLMRMMMM");
		

	
	  
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
