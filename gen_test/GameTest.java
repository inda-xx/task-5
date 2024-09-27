package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testCalculateTotalScoreWithPositiveScores() {
        int[] scores = {5, 10, 5, 10};
        assertEquals(30, Game.calculateTotalScore(scores));
    }

    @Test
    public void testCalculateTotalScoreWithZeroScores() {
        int[] scores = {0, 0, 0, 0};
        assertEquals(0, Game.calculateTotalScore(scores));
    }

    @Test
    public void testCalculateTotalScoreWithMixedScores() {
        int[] scores = {5, 0, 10, 0};
        assertEquals(15, Game.calculateTotalScore(scores));
    }

    @Test
    public void testPlayerMoveUp() {
        Player player = new Player(0, 0);
        player.move("up");
        assertEquals(0, player.getX());
        assertEquals(-1, player.getY());
    }

    @Test
    public void testPlayerMoveDown() {
        Player player = new Player(0, 0);
        player.move("down");
        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    public void testPlayerMoveLeft() {
        Player player = new Player(0, 0);
        player.move("left");
        assertEquals(-1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerMoveRight() {
        Player player = new Player(0, 0);
        player.move("right");
        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerMoveUnknownDirection() {
        Player player = new Player(0, 0);
        player.move("unknown");
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testSpawnEnemy() {
        Enemy enemyManager = new Enemy();
        enemyManager.spawnEnemy("Goblin");
        assertTrue(enemyManager.isEnemyNear(0, 0));
    }

    @Test
    public void testIsEnemyNearWithNoEnemies() {
        Enemy enemyManager = new Enemy();
        assertEquals(false, enemyManager.isEnemyNear(0, 0));
    }
    
    @Test
    public void testPerformance() {
        long startTime = System.currentTimeMillis();
        
        int[] scores = new int[1000000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = 5;
        }
        
        int totalScore = Game.calculateTotalScore(scores);
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        assertTrue("Performance issue: test took longer than expected", duration < 1000);
        assertEquals(5000000, totalScore);
    }
}