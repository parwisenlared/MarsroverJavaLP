package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Position;
import main.PositionIF;

public class PositionTest {

	private static final int coordinateX = 3;
    private static final int coordinateY = 4;
    private static final PositionIF.Direction direction = PositionIF.Direction.N;
    
    private Position position;

	@Before
	public void before() {
        this.position = new Position(coordinateX, coordinateY, direction);
    }

	 @Test
	 public void createCorrectposition() throws Exception {
		 assertEquals(position.getX(), coordinateX);
		 assertEquals(position.getY(), coordinateY);
		 assertTrue(position.getY() != coordinateX);
		 assertTrue(position.getX() != coordinateY);
	 }

	 @Test
	 public void updateposition() throws Exception {
		 final int newX = 11;
		 final int newY = 21;

		 position.setX(newX);
		 position.setY(newY);

		 assertEquals(position.getX(), newX);
		 assertEquals(position.getY(), newY);
	    }

	 @Test
	 public void incrementposition() throws Exception{
		 position.incrementX();
		 position.incrementY();
		 assertTrue(position.getX() == 4);
		 assertTrue(position.getY() == 5);
		 
	 }

}
