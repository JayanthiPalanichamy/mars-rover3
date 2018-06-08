import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    Point plateau;
    Point marsRoverInitial;
    MarsRover marsRover;

    @Before
    public void setUp(){
        plateau = new Point(5,5);
        marsRoverInitial = new Point(1,2);
        marsRover = new MarsRover(marsRoverInitial,Compass.N,plateau);
    }
    @Test
    public void shouldReturnOriginalPositionWhenInitialised(){
        assertEquals("1 2 N",marsRover.getPosition());
    }

    @Test
    public void shouldChangeDirectionInLeftWhenInstructionIsGiven() {
        marsRover.doInstruction("L");

        assertEquals("1 2 W",marsRover.getPosition());
    }

    @Test
    public void shouldChangeDirectionInRightWhenInstructionIsGiven(){
        marsRover.doInstruction("R");

        assertEquals("1 2 E",marsRover.getPosition());
    }

    @Test
    public void shouldIncreasePositionInYPointWhenMovedInNorth() {
        marsRover.doInstruction("M");

        assertEquals("1 3 N",marsRover.getPosition());
    }

    @Test
    public void shouldIncreasePositionInXPointWhenMovedInEast() {
        marsRover.doInstruction("RM");

        assertEquals("2 2 E",marsRover.getPosition());
    }
}
