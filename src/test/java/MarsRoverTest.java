import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void shouldReturnOriginalPositionWhenInitialised(){
        Point plateau = new Point(5,5);
        Point marsRoverInitial = new Point(1,2);
        MarsRover marsRover = new MarsRover(marsRoverInitial,Compass.N,plateau);

        assertEquals("1 2 N",marsRover.getPosition());
    }
}
