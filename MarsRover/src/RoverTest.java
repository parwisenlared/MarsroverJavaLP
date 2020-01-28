
public class RoverTest{
	
	public static void main(String[] args) {
		
	
	  // Test 1 LMLMLMLMM
		 
		Plateau plateau = new Plateau(5,5);
		//System.out.println(plateau.getX() + " " + plateau.getY());
		Position position = new Position(1,2,PositionIF.Direction.N);
		Rover rover1 = new Rover(plateau, position);
		
		
		System.out.println(rover1.getPosition());
		
		rover1.process("LMLMLMLMM");
	  
		System.out.println(rover1.getPosition());
		
		System.out.println();
		
	// Test 2 MMRMMRMRRM	
		
		Position position2 = new Position(3,3,PositionIF.Direction.E);
		Rover rover2 = new Rover(plateau, position2);
		
		System.out.println(rover1.getPosition());
		
		rover2.process("MMRMMRMRRM");
	  
		System.out.println(rover2.getPosition());
	}
	
}
