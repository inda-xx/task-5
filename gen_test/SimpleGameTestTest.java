package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGameTest {

    @Test
    public void testMovePlayerUp() {
        int[] startPosition = {0, 0};
        int[] expectedPosition = {0, -1};
        assertArrayEquals(expectedPosition, SimpleGame.movePlayer(startPosition, "up"));
    }

    @Test
    public void testMovePlayerDown() {
        int[] startPosition = {0, 0};
        int[] expectedPosition = {0, 1};
        assertArrayEquals(expectedPosition, SimpleGame.movePlayer(startPosition, "down"));
    }

    @Test
    public void testMovePlayerLeft() {
        int[] startPosition = {0, 0};
        int[] expectedPosition = {-1, 0};
        assertArrayEquals(expectedPosition, SimpleGame.movePlayer(startPosition, "left"));
    }

    @Test
    public void testMovePlayerRight() {
        int[] startPosition = {0, 0};
        int[] expectedPosition = {1, 0};
        assertArrayEquals(expectedPosition, SimpleGame.movePlayer(startPosition, "right"));
    }

    @Test
    public void testMovePlayerInvalidDirection() {
        int[] startPosition = {0, 0};
        int[] expectedPosition = {0, 0};
        assertArrayEquals(expectedPosition, SimpleGame.movePlayer(startPosition, "invalid"));
    }

    @Test
    public void testUpdateScore() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores = SimpleGame.updateScore(scores, 10);
        assertEquals(1, scores.size());
        assertEquals(10, (int) scores.get(0));
    }

    @Test
    public void testCheckCollisionTrue() {
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{0, 0});
        int[] playerPosition = {0, 0};
        assertTrue(SimpleGame.checkCollision(enemies, playerPosition));
    }

    @Test
    public void testCheckCollisionFalse() {
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{1, 1});
        int[] playerPosition = {0, 0};
        assertFalse(SimpleGame.checkCollision(enemies, playerPosition));
    }

    @Test
    public void testUpdateLeaderboard() {
        ArrayList<Integer> leaderboard = new ArrayList<>();
        Leaderboard.updateLeaderboard(leaderboard, 10);
        assertEquals(1, leaderboard.size());
        assertEquals(10, (int) leaderboard.get(0));
    }

    @Test
    public void testUpdateLeaderboardSizeLimit() {
        ArrayList<Integer> leaderboard = new ArrayList<>();
        Leaderboard.updateLeaderboard(leaderboard, 10);
        Leaderboard.updateLeaderboard(leaderboard, 20);
        Leaderboard.updateLeaderboard(leaderboard, 30);
        Leaderboard.updateLeaderboard(leaderboard, 40);
        Leaderboard.updateLeaderboard(leaderboard, 50);
        Leaderboard.updateLeaderboard(leaderboard, 60); // This should not be added to the top 5

        assertEquals(5, leaderboard.size());
        assertEquals(60, (int) leaderboard.get(0));
        assertEquals(50, (int) leaderboard.get(1));
        assertEquals(40, (int) leaderboard.get(2));
        assertEquals(30, (int) leaderboard.get(3));
        assertEquals(20, (int) leaderboard.get(4));
    }
}