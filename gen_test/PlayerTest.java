package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testInitialPosition() {
        Player player = new Player();
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(0); // x-coordinate
        expectedPosition.add(0); // y-coordinate
        assertEquals(expectedPosition, player.getPosition());
    }

    @Test
    public void testMoveUp() {
        Player player = new Player();
        player.move(0); // UP
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(0);
        expectedPosition.add(1);
        assertEquals(expectedPosition, player.getPosition());
    }

    @Test
    public void testMoveDown() {
        Player player = new Player();
        player.move(1); // DOWN
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(0);
        expectedPosition.add(-1);
        assertEquals(expectedPosition, player.getPosition());
    }

    @Test
    public void testMoveLeft() {
        Player player = new Player();
        player.move(2); // LEFT
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(-1);
        expectedPosition.add(0);
        assertEquals(expectedPosition, player.getPosition());
    }

    @Test
    public void testMoveRight() {
        Player player = new Player();
        player.move(3); // RIGHT
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(1);
        expectedPosition.add(0);
        assertEquals(expectedPosition, player.getPosition());
    }

    @Test
    public void testInvalidDirection() {
        Player player = new Player();
        player.move(4); // Invalid direction
        ArrayList<Integer> expectedPosition = new ArrayList<>();
        expectedPosition.add(0); // x-coordinate
        expectedPosition.add(0); // y-coordinate
        assertEquals(expectedPosition, player.getPosition());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

