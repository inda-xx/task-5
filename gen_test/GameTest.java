package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testMovePlayerUp() {
        int[] playerPosition = {0, 0};
        Game.movePlayer(playerPosition, "up");
        assertArrayEquals(new int[]{0, 1}, playerPosition);
    }

    @Test
    public void testMovePlayerDown() {
        int[] playerPosition = {0, 1};
        Game.movePlayer(playerPosition, "down");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerLeft() {
        int[] playerPosition = {1, 0};
        Game.movePlayer(playerPosition, "left");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerRight() {
        int[] playerPosition = {0, 0};
        Game.movePlayer(playerPosition, "right");
        assertArrayEquals(new int[]{1, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerEdgeUp() {
        int[] playerPosition = {0, 9};
        Game.movePlayer(playerPosition, "up");
        assertArrayEquals(new int[]{0, 9}, playerPosition);
    }

    @Test
    public void testMovePlayerEdgeDown() {
        int[] playerPosition = {0, 0};
        Game.movePlayer(playerPosition, "down");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerEdgeLeft() {
        int[] playerPosition = {0, 0};
        Game.movePlayer(playerPosition, "left");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerEdgeRight() {
        int[] playerPosition = {9, 0};
        Game.movePlayer(playerPosition, "right");
        assertArrayEquals(new int[]{9, 0}, playerPosition);
    }

    @Test
    public void testInvalidDirection() {
        int[] playerPosition = {0, 0};
        Game.movePlayer(playerPosition, "invalid_direction");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testUpdateScoreIncrease() {
        Game.updateScore(10);
        // Assuming previous tests reset any static state, otherwise need to reset manually.
        assertEquals(10, Game.playerScore);
    }

    @Test
    public void testUpdateScoreDecrease() {
        Game.updateScore(10);
        Game.updateScore(-5);
        assertEquals(5, Game.playerScore);
    }

    @Test
    public void testCheckEnemyCollision() {
        int[] playerPosition = {2, 2};
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{2, 2});
        assertTrue(Game.checkEnemyCollision(playerPosition, enemies));
    }

    @Test
    public void testNoEnemyCollision() {
        int[] playerPosition = {0, 0};
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{2, 2});
        assertFalse(Game.checkEnemyCollision(playerPosition, enemies));
    }

    @Test
    public void testMoveEnemies() {
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{2, 2});
        enemies.add(new int[]{3, 3});
        Game.moveEnemies(enemies);
        for (int[] enemy : enemies) {
            assertTrue(enemy[0] >= 0 && enemy[0] < 10);
            assertTrue(enemy[1] >= 0 && enemy[1] < 10);
        }
    }
}