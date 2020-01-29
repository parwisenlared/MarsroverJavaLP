package test;

import main.Plateau;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlateauTest {
	
	private static final int width = 3;
    private static final int height = 4;
    
    private Plateau plateau;

	@Before
	public void before() {
        this.plateau = new Plateau(width, height);
    }

	 @Test
	 public void createCorrectPlateau() throws Exception {
		 assertEquals(plateau.getX(), width);
		 assertEquals(plateau.getY(), height);
		 assertTrue(plateau.getY() != width);
		 assertTrue(plateau.getX() != height);
	 }
	 
	
	 @Test
	 public void updatePlateau() throws Exception {
		 final int newX = 11;
		 final int newY = 21;

		 plateau.setX(newX);
		 plateau.setY(newY);

		 assertEquals(plateau.getX(), newX);
		 assertEquals(plateau.getY(), newY);
	    }

	
}
