import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    Point plateau;
    Point marsRoverInitial;
    MarsRover marsRover;

    @Before
    public void setUp() {
        plateau = new Point(5, 5);
        marsRoverInitial = new Point(1, 2);
        marsRover = new MarsRover(marsRoverInitial, Compass.N, plateau);
    }

    @Test
    public void shouldReturnOriginalPositionWhenInitialised() {
        assertEquals("1 2 N", marsRover.getPosition());
    }

    @Test
    public void shouldChangeDirectionInLeftWhenInstructionIsGiven() {
        marsRover.doInstruction("L");

        assertEquals("1 2 W", marsRover.getPosition());
    }

    @Test
    public void shouldChangeDirectionInRightWhenInstructionIsGiven() {
        marsRover.doInstruction("R");

        assertEquals("1 2 E", marsRover.getPosition());
    }

    @Test
    public void shouldIncreasePositionInYPointWhenMovedInNorth() {
        marsRover.doInstruction("M");

        assertEquals("1 3 N", marsRover.getPosition());
    }

    @Test
    public void shouldIncreasePositionInXPointWhenMovedInEast() {
        marsRover.doInstruction("RM");

        assertEquals("2 2 E", marsRover.getPosition());
    }

    @Test
    public void shouldDecreasePositionInXPointWhenMovedInWest() {
        marsRover.doInstruction("LM");

        assertEquals("0 2 W", marsRover.getPosition());
    }

    @Test
    public void shouldDecreasePositionInYPointWhenMovedInSouth() {
        marsRover.doInstruction("LLM");

        assertEquals("1 1 S", marsRover.getPosition());
    }

    @Test
    public void shouldMoveAndChangeDirectionOfMarsRoverWhenInstructionIsGiven() {
        Point initial = new Point(3, 3);
        MarsRover marsRover2 = new MarsRover(initial, Compass.E, plateau);
        marsRover2.doInstruction("MMRMMRMRRM");

        assertEquals("5 1 E", marsRover2.getPosition());
    }

    @Test(expected = MovedOutOfPlateau.class)
    public void shouldThrowAnExceptionWhenMovedOutOfPlateau() {
        marsRover.doInstruction("MMMMMMMMMM");
    }
}
