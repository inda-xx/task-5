package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class ScoreBoardTest {

    @Test
    public void testEmptyScoreBoard() {
        assertEquals(0.0, ScoreBoard.getAverageScore(), 0);
    }

    @Test
    public void testSingleScoreAddition() {
        ScoreBoard.addScore(10);
        assertEquals(10.0, ScoreBoard.getAverageScore(), 0);
    }

    @Test
    public void testMultipleScoreAddition() {
        ScoreBoard.addScore(10);
        ScoreBoard.addScore(20);
        ScoreBoard.addScore(30);
        assertEquals(20.0, ScoreBoard.getAverageScore(), 0);
    }

    @Test
    public void testAddZeroScore() {
        ScoreBoard.addScore(0);
        assertEquals(0.0, ScoreBoard.getAverageScore(), 0);
    }

    @Test
    public void testAddNegativeScore() {
        ScoreBoard.addScore(-5);
        assertEquals(-5.0, ScoreBoard.getAverageScore(), 0);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

