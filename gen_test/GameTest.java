package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import src.Game; // Adjust based on your actual package

public class GameTest {
    
    @Before
    public void setUp() {
        Game.setScore(0);
        Game.initializeEnemies();
    }

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
        Game.movePlayer(initialPosition, "down");
        Game.checkCollisionsWithEnemies();

        assertEquals(10, Game.getScore()); // Assuming score increases by 10
        assertEquals(1, Game.getEnemies().size()); // Assuming one enemy defeated
    }

    @Test
    public void testAllEnemiesDefeated() {
        int[] position = {0, 0}; 
        Game.setScore(0); // Reset score

        // Simulate defeating all enemies
        Game.checkCollisionsWithEnemies();
        Game.checkCollisionsWithEnemies();
        Game.checkCollisionsWithEnemies();

        assertEquals(30, Game.getScore()); // Assuming score increases by 10 each time
        assertTrue(Game.getEnemies().isEmpty()); // All enemies defeated
    }

    // Optional: Use JUnit's built-in assertArrayEquals
    // If you need a custom implementation, ensure it's within the class
    private void assertArrayEquals(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
