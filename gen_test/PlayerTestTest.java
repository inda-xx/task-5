package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {

    private Player player;

    @Before
    public void setup() {
        player = new Player();
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testMoveUp() {
        player.move('W');
        assertEquals(0, player.getX());
        assertEquals(-1, player.getY());
    }

    @Test
    public void testMoveDown() {
        player.move('S');
        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    public void testMoveLeft() {
        player.move('A');
        assertEquals(-1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testMoveRight() {
        player.move('D');
        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testInvalidMove() {
        player.move('X'); // Invalid direction
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }
}

