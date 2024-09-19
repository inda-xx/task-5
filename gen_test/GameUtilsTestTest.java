package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameUtilsTest {

    @Test
    public void testCalculateScoreNormalScenario() {
        int score = GameUtils.calculateScore(5, 10);
        assertEquals(95, score);
    }

    @Test
    public void testCalculateScoreNoEnemiesDefeated() {
        int score = GameUtils.calculateScore(10, 0);
        assertEquals(-10, score);
    }

    @Test
    public void testCalculateScoreZeroElapsedTime() {
        int score = GameUtils.calculateScore(0, 5);
        assertEquals(50, score);
    }

    @Test
    public void testCalculateScoreNegativeElapsedTime() {
        int score = GameUtils.calculateScore(-10, 5);
        assertEquals(60, score); // Not realistic, but handling negative time
    }
}

