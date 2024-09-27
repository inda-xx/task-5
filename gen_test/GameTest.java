package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Before
    public void setUp() {
        Game.playerPosition = new int[]{0, 0};
        Game.score = 0;
        Game.enemies = new ArrayList<>();
    }

    @Test
    public void testPlayerInitialPosition() {
        assertArrayEquals(new int[]{0, 0}, Game.playerPosition);
    }

    @Test
    public void testPlayerMoveUp() {
        Game.moveUp();
        assertArrayEquals(new int[]{0, 1}, Game.playerPosition);
    }

    @Test
    public void testPlayerMoveDownWhenAtBoundary() {
        Game.moveDown();
        assertArrayEquals(new int[]{0, 0}, Game.playerPosition); // Cannot move down from (0, 0)
    }

    @Test
    public void testPlayerMoveDown() {
        Game.moveUp(); // Move first to allow down movement.
        Game.moveDown();
        assertArrayEquals(new int[]{0, 0}, Game.playerPosition);
    }

    @Test
    public void testPlayerMoveLeftWhenAtBoundary() {
        Game.moveLeft();
        assertArrayEquals(new int[]{0, 0}, Game.playerPosition); // Cannot move left from (0, 0)
    }

    @Test
    public void testPlayerMoveLeft() {
        Game.moveRight(); // Move to allow left movement.
        Game.moveLeft();
        assertArrayEquals(new int[]{0, 0}, Game.playerPosition);
    }

    @Test
    public void testPlayerMoveRight() {
        Game.moveRight();
        assertArrayEquals(new int[]{1, 0}, Game.playerPosition);
    }

    @Test
    public void testSpawnEnemy() {
        Game.spawnEnemy(5, 5);
        assertEquals(1, Game.enemies.size());
        assertArrayEquals(new int[]{5, 5}, Game.enemies.get(0));
    }

    @Test
    public void testEnemyEncounterReducesScore() {
        Game.score = 50;
        Game.spawnEnemy(0, 0); // Spawn enemy at player's initial position
        Game.checkInteractions();
        assertEquals(40, Game.score); // Score should reduce by 10
        assertEquals(0, Game.enemies.size()); // Enemy should be removed
    }

    @Test
    public void testNoEnemyInteractionDoesNotChangeScore() {
        Game.score = 50;
        Game.spawnEnemy(5, 5); // Spawn enemy away from player
        Game.checkInteractions();
        assertEquals(50, Game.score); // Score should remain unchanged
        assertEquals(1, Game.enemies.size()); // Enemy should remain
    }

    @Test
    public void testComplexMovementAndInteraction() {
        Game.spawnEnemy(2, 2);
        Game.spawnEnemy(3, 3);
        
        Game.moveRight(); // [1, 0]
        Game.moveRight(); // [2, 0]
        Game.moveUp();    // [2, 1]
        Game.moveUp();    // [2, 2] - Interact with enemy, score -10

        Game.checkInteractions();

        assertArrayEquals(new int[]{2, 2}, Game.playerPosition);
        assertEquals(-10, Game.score); // Score reduced by 10
        assertEquals(1, Game.enemies.size()); // One enemy removed
    }

    @Test
    public void testMultipleEnemyEncounters() {
        Game.spawnEnemy(1, 0);
        Game.spawnEnemy(2, 0);
        Game.score = 20;

        Game.moveRight(); // [1, 0] - Encounter first enemy
        Game.checkInteractions();
        assertEquals(10, Game.score); // Score -10
        assertEquals(1, Game.enemies.size()); // One enemy removed

        Game.moveRight(); // [2, 0] - Encounter second enemy
        Game.checkInteractions();
        assertEquals(0, Game.score); // Score -10 again
        assertEquals(0, Game.enemies.size()); // Second enemy removed
    }
}