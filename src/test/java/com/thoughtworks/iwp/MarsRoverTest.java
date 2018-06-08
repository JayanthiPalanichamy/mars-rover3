package com.thoughtworks.iwp;

import com.thoughtworks.iwp.Compass;
import com.thoughtworks.iwp.MarsRover;
import com.thoughtworks.iwp.MovedOutOfPlateau;
import com.thoughtworks.iwp.Point;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    Point plateauMaxPoint;
    Point marsRoverInitial;
    MarsRover marsRover;


    @Before
    public void setUp() {
        plateauMaxPoint = new Point(5, 5);
        marsRoverInitial = new Point(1, 2);
        marsRover = new MarsRover(marsRoverInitial, Compass.N, plateauMaxPoint);
    }

    @Test
    public void shouldReturnOriginalPositionWhenInitialised() {
        assertEquals("1 2 N", marsRover.getPosition());
    }

    @Test
    public void shouldChangeCompassInLeftWhenLeftInstructionIsGiven() {
        marsRover.doInstruction("L");

        assertEquals("1 2 W", marsRover.getPosition());
    }

    @Test
    public void shouldChangeCompassInRightWhenRightInstructionIsGiven() {
        marsRover.doInstruction("R");

        assertEquals("1 2 E", marsRover.getPosition());
    }

    @Test
    public void shouldIncreaseYCoordinatePointWhenMovedInNorth() {
        marsRover.doInstruction("M");

        assertEquals("1 3 N", marsRover.getPosition());
    }

    @Test
    public void shouldIncreaseXCoordinateWhenMovedInEast() {
        marsRover.doInstruction("RM");

        assertEquals("2 2 E", marsRover.getPosition());
    }

    @Test
    public void shouldDecreaseXCoordinateWhenMovedInWest() {
        marsRover.doInstruction("LM");

        assertEquals("0 2 W", marsRover.getPosition());
    }

    @Test
    public void shouldDecreaseYCoordinateWhenMovedInSouth() {
        marsRover.doInstruction("LLM");

        assertEquals("1 1 S", marsRover.getPosition());
    }

    @Test
    public void shouldMoveAndChangeDirectionOfMarsRoverWhenInstructionIsGiven() {
        Point initial = new Point(3, 3);
        MarsRover marsRover2 = new MarsRover(initial, Compass.E, plateauMaxPoint);

        marsRover2.doInstruction("MMRMMRMRRM");

        assertEquals("5 1 E", marsRover2.getPosition());
    }

    @Test(expected = MovedOutOfPlateau.class)
    public void shouldThrowAnExceptionWhenMovedOutOfPlateau() {
        marsRover.doInstruction("MMMMMMMMMM");
    }
}
