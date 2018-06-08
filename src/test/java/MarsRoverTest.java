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
    public void shouldChangeDirectionWhenInstructionIsGiven() {
        marsRover.instruction("LLR");

        assertEquals("1 2 W",marsRover.getPosition());
    }
}
