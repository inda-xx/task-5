package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    
    @Test
    public void testMovePlayerUp() {
        int[] initialPosition = {0, 0};
        Game.movePlayer(initialPosition, "up");
        int[] expectedPosition = {0, 1};
        assertArrayEquals(expectedPosition, initialPosition);
    }

    @Test
    public void testMovePlayerDown() {
        int[] initialPosition = {0, 0};
        Game.movePlayer(initialPosition, "down");
        int[] expectedPosition = {0, -1};
        assertArrayEquals(expectedPosition, initialPosition);
    }

    @Test
    public void testMovePlayerLeft() {
        int[] initialPosition = {0, 0};
        Game.movePlayer(initialPosition, "left");
        int[] expectedPosition = {-1, 0};
        assertArrayEquals(expectedPosition, initialPosition);
    }

    @Test
    public void testMovePlayerRight() {
        int[] initialPosition = {0, 0};
        Game.movePlayer(initialPosition, "right");
        int[] expectedPosition = {1, 0};
        assertArrayEquals(expectedPosition, initialPosition);
    }

    @Test
    public void testMovePlayerInvalidDirection() {
        int[] initialPosition = {0, 0};
        Game.movePlayer(initialPosition, "invalid");
        int[] expectedPosition = {0, 0}; // No movement
        assertArrayEquals(expectedPosition, initialPosition);
    }

    @Test
    public void testCollisionWithEnemies() {
        int[] initialPosition = {0, 0}; 
        Game.initializeEnemies(); // Reset enemy list
        Game.movePlayer(initialPosition, "down");
        Game.checkCollisionsWithEnemies();

        assertEquals(10, Game.getScore()); // Check if score increased by 10 after defeating an enemy
        assertEquals(2, Game.getEnemies().size()); // Check if one enemy was defeated
    }

    @Test
    public void testAllEnemiesDefeated() {
        int[] position = {0, 0}; 
        Game.initializeEnemies(); // Reset enemy list
        Game.setScore(0); // Reset score

        // Move to defeat all enemies
        Game.checkCollisionsWithEnemies();
        Game.checkCollisionsWithEnemies();
        Game.checkCollisionsWithEnemies();

        assertEquals(30, Game.getScore()); // Check if score increased to 30 after defeating all enemies
        assertTrue(Game.getEnemies().isEmpty()); // Check if all enemies were defeated
    }

    // If you need a custom assertArrayEquals, it should be inside the class
    private void assertArrayEquals(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
