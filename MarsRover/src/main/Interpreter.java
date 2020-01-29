package main;
/**
 * 
 *  The interpreter holds the information to read the input from a file and process it.
 *  
 *  It creates the Plateau and Rovers. Rovers move as the "instruction" line has been processed.
 *  		(first line defines the limit of the plateau and next lines correspond to the Rovers being the
 *  		first line the position of the rover and the second line the instructions to move on the plateau.
 * 		
 * 
 */




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Interpreter {
	private static Position position;
	private static Rover rover;
	private static Plateau plateau;
	private static File file;
	
	
	public void readFile(String filename) {	
	
		try {	
		File f = new File(filename); 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(f); 
		while (scanner.hasNextLine()) {
			//read first line and process it
		
			String inputLine = scanner.nextLine();
			if (inputLine.length() != 0) {//ignored if blank line
			     processLine(inputLine);
			} 
		}
	}
		
		catch (FileNotFoundException fnf){ 
			System.out.println("File not found"); 
			System.exit(0);
			}
	}
	
	public void processLine (String line){
	
		if (line.length() == 3) {
			try {
				createPlateau(line);
			}
			catch (NumberFormatException nfe) {
				System.out.println("Format not valid: 2 int with space separation"); 
				System.exit(0);
			}
		}
		
		if (line.length() == 5) {
			try {
			createRover(line);
		}
			catch (NumberFormatException nfe2){
				System.out.println("Format not valid: 2 int and letter (N,S,W,E) with space separation"); 
				System.exit(0);
			}
	
			}
		else if (line.length() > 5) {
			followInstructions(line);
		}
	}

		
	
	private void createPlateau(String line) {
		int width = Integer.parseInt(String.valueOf(line.charAt(0)));
		int height = Integer.parseInt(String.valueOf(line.charAt(2)));
		
		plateau = new Plateau(width, height);
		
		
	}
	
	private void createRover(String line) {
		int positionX = Integer.parseInt(String.valueOf(line.charAt(0)));
		int positionY = Integer.parseInt(String.valueOf(line.charAt(2)));
		Character roverOrientation = line.charAt(4);
		
		PositionIF.Direction orientation = null;
    	switch (roverOrientation) {
    	case 'N':
    		orientation = PositionIF.Direction.N;
    		break;
    	case 'E':
    		orientation = PositionIF.Direction.E;
    		break;
    	case 'S':
    		orientation = PositionIF.Direction.S;
    		break;
    	case 'W':
    		orientation = PositionIF.Direction.W;
    		break;
    	default:
    		throw new IllegalArgumentException(
					"Command not valid: need N, S, E or W in direction");
    			
    	}
    	
    	position = new Position (positionX, positionY, orientation);
    	rover = new Rover(plateau, position);
    	
    		
	}
	
		private void followInstructions(String line) {
			String instructions = line;
			process(instructions);
			System.out.println(rover.getPosition());
		
		}
	
		
		public void process(String commands) {
			for (int idx = 0; idx < commands.length(); idx++) {
				process(commands.charAt(idx));
			}
		}
		
		// Process the instructions for the rover to move and explore the plateau
		private void process(Character command) {
			if (command.equals('L')) {
				position.setDirectionLeft();
			} else if (command.equals('R')) {
				position.setDirectionRight();
			} else if (command.equals('M')) {
				rover.move();
			} else {
				throw new IllegalArgumentException(
						"Command not valid: need L, R or M in instructions");
			}
		}
		

	public Interpreter () {
		
	}
}