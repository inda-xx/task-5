package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleGameTest {

    private int[][] board;
    private static final int BOARD_SIZE = 5;

    @Before
    public void setup() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        SimpleGame.scores = new int[]{0, 0, 0};
        SimpleGame.enemies = new ArrayList<>();
    }

    @After
    public void teardown() {
        SimpleGame.scores = new int[]{0, 0, 0};
        SimpleGame.enemies.clear();
    }

    @Test
    public void testMovePlayer() {
        SimpleGame.movePlayer(board, 2, 2);
        // Check player is moved to correct position
        assertEquals(1, board[2][2]);
        // Check other positions are cleared
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!(i == 2 && j == 2)) {
                    assertEquals(0, board[i][j]);
                }
            }
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMovePlayerInvalidPosition() {
        SimpleGame.movePlayer(board, BOARD_SIZE, BOARD_SIZE); // should throw exception
    }

    @Test
    public void testUpdateScore() {
        SimpleGame.updateScore(0);
        assertEquals(10, SimpleGame.scores[0]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testUpdateScoreInvalidPlayerIndex() {
        SimpleGame.updateScore(3); // should throw exception
    }

    @Test
    public void testSpawnEnemy() {
        int initialEnemyCount = SimpleGame.enemies.size();
        SimpleGame.spawnEnemy(board);
        assertEquals(initialEnemyCount + 1, SimpleGame.enemies.size());

        // Check if an enemy is placed on the board
        boolean enemyFound = false;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == -1) {
                    enemyFound = true;
                    break;
                }
            }
            if (enemyFound) break;
        }
        assertTrue(enemyFound);
    }

    @Test
    public void testCheckEnemyInteractionNoInteraction() {
        // Initial score should be 0
        assertEquals(0, SimpleGame.scores[0]);

        // No enemy placed initially
        SimpleGame.checkEnemyInteraction(board, SimpleGame.enemies, 0, 0);
        assertEquals(0, SimpleGame.scores[0]);
    }

    @Test
    public void testCheckEnemyInteractionWithInteraction() {
        SimpleGame.movePlayer(board, 0, 0);
        SimpleGame.enemies.add(new int[]{0, 0});
        // Deduct score for interacting with enemy
        SimpleGame.checkEnemyInteraction(board, SimpleGame.enemies, 0, 0);
        assertEquals(-5, SimpleGame.scores[0]);
    }

    @Test
    public void testPerformanceSpawnEnemy() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            SimpleGame.spawnEnemy(board);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        // Performance should be reasonable (arbitrary acceptable time threshold)
        assertTrue(duration < 500);
    }
}