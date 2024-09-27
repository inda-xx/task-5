package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testInitialPosition() {
        Player player = new Player();
        ArrayList<Integer> position = player.getPosition();
        assertEquals(0, (int) position.get(0));
        assertEquals(0, (int) position.get(1));
    }

    @Test
    public void testMoveUp() {
        Player player = new Player();
        player.move(0); // UP
        ArrayList<Integer> position = player.getPosition();
        assertEquals(0, (int) position.get(0));
        assertEquals(1, (int) position.get(1));
    }

    @Test
    public void testMoveDown() {
        Player player = new Player();
        player.move(1); // DOWN
        ArrayList<Integer> position = player.getPosition();
        assertEquals(0, (int) position.get(0));
        assertEquals(-1, (int) position.get(1));
    }

    @Test
    public void testMoveLeft() {
        Player player = new Player();
        player.move(2); // LEFT
        ArrayList<Integer> position = player.getPosition();
        assertEquals(-1, (int) position.get(0));
        assertEquals(0, (int) position.get(1));
    }

    @Test
    public void testMoveRight() {
        Player player = new Player();
        player.move(3); // RIGHT
        ArrayList<Integer> position = player.getPosition();
        assertEquals(1, (int) position.get(0));
        assertEquals(0, (int) position.get(1));
    }

    @Test
    public void testInvalidDirection() {
        Player player = new Player();
        player.move(4); // Invalid direction
        ArrayList<Integer> position = player.getPosition();
        assertEquals(0, (int) position.get(0));
        assertEquals(0, (int) position.get(1)); // Position remains unchanged
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

