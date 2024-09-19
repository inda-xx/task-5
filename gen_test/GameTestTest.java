package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @Test
    public void testSetScoreValidLevel() {
        Game.setScore(0, 100);
        Game.setScore(5, 200);
        Game.setScore(9, 300);
        int[] expectedScores = { 100, 0, 0, 0, 0, 200, 0, 0, 0, 300 };
        assertArrayEquals(expectedScores, Game.scores);
    }

    @Test
    public void testSetScoreInvalidLevelNegative() {
        int[] before = Game.scores.clone();
        Game.setScore(-1, 100);
        assertArrayEquals(before, Game.scores);
    }

    @Test
    public void testSetScoreInvalidLevelTooHigh() {
        int[] before = Game.scores.clone();
        Game.setScore(10, 100);
        assertArrayEquals(before, Game.scores);
    }
}

