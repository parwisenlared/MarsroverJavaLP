package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import main.Plateau;
import main.Position;
import main.Rover;
import main.PositionIF.Direction;
import main.PositionIF;

public class RoverTest {
	
	private static final int width = 3;
    private static final int height = 4;
    
    private static final int x = 1;
    private static final int y = 0;
    
    private static final Direction direction = PositionIF.Direction.N;
    
    private Plateau plateau;
    private Position position;
    private Rover rover;

	@Before
	public void before() {
		this.plateau = new Plateau(width, height);
		this.position = new Position(x,y,direction);
        this.rover = new Rover(plateau, position);
    }

	 @Test
	 public void createRover() throws Exception {
		 assertEquals(rover.getPosition(), position);
	     assertEquals(rover.getDirection(), direction);
	     assertTrue(rover.getPosition().getX() != y);
	     assertTrue(rover.getPosition().getY() != x);
	     assertTrue(rover.getPlateau().getX() != height);
	     assertTrue(rover.getPlateau().getY() != width);
	     assertTrue(rover.getPosition().getY() != height);
	     assertTrue(rover.getPosition().getY() != width);
	     assertTrue(rover.getPosition().getX() != height);
	     assertTrue(rover.getPosition().getX() != width);
	 }



}
