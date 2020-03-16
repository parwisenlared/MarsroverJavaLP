package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Interpreter;
import main.Plateau;

public class InterpreterTest {

	@Test
	public void testPlateauCreation() {
		Interpreter MarsRover = new Interpreter();
		String string = "5 5";
		MarsRover.processLine(string);
		
		Plateau plateau = new Plateau(5,5);
		
		assertEquals(plateau, MarsRover.getPlateau());
	}

}
