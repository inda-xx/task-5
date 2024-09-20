package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    @Test
    public void testInitializeGrid() {
        Game.initializeGrid();
        char[] expected = {'P', '.', '.', '.', '.', '.', '.', '.', '.', '.'};
        assertArrayEquals(expected, getPlayerPosition());
    }

    @Test
    public void testMovePlayerWithinBounds() {
        Game.initializeGrid();
        Game.movePlayer(3);
        char[] expected = {'.', '.', '.', 'P', '.', '.', '.', '.', '.', '.'};
        assertArrayEquals(expected, getPlayerPosition());
    }

    @Test
    public void testMovePlayerOutOfBoundsNegative() {
        Game.initializeGrid();
        Game.movePlayer(-1);
        char[] expected = {'P', '.', '.', '.', '.', '.', '.', '.', '.', '.'};
        assertArrayEquals(expected, getPlayerPosition());
    }

    @Test
    public void testMovePlayerOutOfBoundsPositive() {
        Game.initializeGrid();
        Game.movePlayer(10);
        char[] expected = {'P', '.', '.', '.', '.', '.', '.', '.', '.', '.'};
        assertArrayEquals(expected, getPlayerPosition());
    }

    @Test
    public void testUpdateScorePositivePoints() {
        Game.initializeGrid();
        Game.updateScore(10);
        assertEquals(10, getScore());
    }

    @Test
    public void testUpdateScoreNegativePoints() {
        Game.initializeGrid();
        Game.updateScore(-5);
        assertEquals(-5, getScore());
    }

    @Test
    public void testEnemyEncounterGoblin() {
        Game.initializeGrid();
        Game.updateScore(10);
        Game.enemyEncounter("Goblin");
        assertEquals(5, getScore());
    }

    @Test
    public void testEnemyEncounterDragon() {
        Game.initializeGrid();
        Game.updateScore(30);
        Game.enemyEncounter("Dragon");
        assertEquals(10, getScore());
    }

    @Test
    public void testEnemyEncounterElf() {
        Game.initializeGrid();
        Game.updateScore(15);
        Game.enemyEncounter("Elf");
        assertEquals(15, getScore());
    }

    @Test
    public void testEnemyEncounterUnknown() {
        Game.initializeGrid();
        Game.updateScore(15);
        Game.enemyEncounter("Orc");
        assertEquals(15, getScore());
    }

    @Test
    public void testAddEnemy() {
        Game.initializeGrid();
        Game.addEnemy("Orc");
        assertEquals(1, getEnemies().size());
        assertEquals("Orc", getEnemies().get(0));
    }

    // Helper methods to access private static fields for testing
    private char[] getPlayerPosition() {
        // Reflection or helper function within the 'Game' 