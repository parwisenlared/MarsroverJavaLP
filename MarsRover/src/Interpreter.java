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
	
		if (line.length() == 2) {
			createPlateau(line);
		}
		
		if (line.length() == 3) {
			createRover(line);
		}
		else if (line.length() > 3) {
			followInstructions(line);
		}
	}

		
	
	private void createPlateau(String line) {
		int width = Character.getNumericValue(line.charAt(0));
		int height = Character.getNumericValue(line.charAt(1));
		
		plateau = new Plateau(width, height);
		
		
	}
	
	private void createRover(String line) {
		int positionX = Character.getNumericValue(line.charAt(0));
		int positionY = Character.getNumericValue(line.charAt(1));
		Character roverOrientation = line.charAt(2);
		
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
    	}
    	
    	position = new Position (positionX, positionY, orientation);
    	rover = new Rover(plateau, position);
    	//System.out.println("Rover has been created at: " + rover.getPosition() + "plateau: " + rover.getPlateau());
    		
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
		
		// Process the input and do the correspondent actions
		
		private void process(Character command) {
			if (command.equals('L')) {
				position.setDirectionLeft();
			} else if (command.equals('R')) {
				position.setDirectionRight();
			} else if (command.equals('M')) {
				rover.move();
			} else {
				throw new IllegalArgumentException(
						"Command not valid");
			}
		}
		

	public Interpreter () {
		
	}
}