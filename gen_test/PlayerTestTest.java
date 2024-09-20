package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {

    @Test
    public void testInitialPosition() {
        Player player = new Player();
        assertArrayEquals(new int[]{0, 0}, player.getPosition());
    }

    @Test
    public void testMovePositiveCoordinates() {
        Player player = new Player();
        player.move(5, 10);
        assertArrayEquals(new int[]{5, 10}, player.getPosition());
    }

    @Test
    public void testMoveNegativeCoordinates() {
        Player player = new Player();
        player.move(-5, -10);
        assertArrayEquals(new int[]{-5, -10}, player.getPosition());
    }

    @Test
    public void testMoveMixedCoordinates() {
        Player player = new Player();
        player.move(3, -7);
        assertArrayEquals(new int[]{3, -7}, player.getPosition());
    }

    @Test
    public void testMultipleMoves() {
        Player player = new Player();
        player.move(1, 1);
        player.move(4, 5);
        player.move(-3, -2);
        assertArrayEquals(new int[]{2, 4}, player.getPosition());
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

