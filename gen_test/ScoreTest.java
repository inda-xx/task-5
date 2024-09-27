package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void testInitialTotalScore() {
        Score score = new Score();
        assertEquals(0, score.getTotalScore());
    }

    @Test
    public void testInitialActionScores() {
        Score score = new Score();
        for (int i = 0; i < 5; i++) {
            assertEquals(0, score.getActionScore(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateScoreInvalidActionIndexNegative() {
        Score score = new Score();
        score.updateScore(10, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateScoreInvalidActionIndexTooHigh() {
        Score score = new Score();
        score.updateScore(10, 5);
    }

    @Test
    public void testUpdateScore() {
        Score score = new Score();
        score.updateScore(10, 0);
        score.updateScore(20, 1);
        assertEquals(30, score.getTotalScore());
        assertEquals(10, score.getActionScore(0));
        assertEquals(20, score.getActionScore(1));
    }

    @Test
    public void testMultipleUpdatesSameActionIndex() {
        Score score = new Score();
        score.updateScore(10, 2);
        score.updateScore(15, 2);
        assertEquals(25, score.getActionScore(2));
        assertEquals(25, score.getTotalScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetActionScoreInvalidActionIndexNegative() {
        Score score = new Score();
        score.getActionScore(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetActionScoreInvalidActionIndexTooHigh() {
        Score score = new Score();
        score.getActionScore(5);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

