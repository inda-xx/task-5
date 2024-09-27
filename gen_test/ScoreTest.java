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
    public void testUpdateScoreNormalCase() {
        Score score = new Score();
        score.updateScore(10, 0);
        assertEquals(10, score.getTotalScore());
        assertEquals(10, score.getActionScore(0));
    }

    @Test
    public void testUpdateScoreMultipleActions() {
        Score score = new Score();
        score.updateScore(5, 0);
        score.updateScore(15, 1);
        assertEquals(20, score.getTotalScore());
        assertEquals(5, score.getActionScore(0));
        assertEquals(15, score.getActionScore(1));
    }

    @Test
    public void testUpdateScoreInvalidActionIndexNegative() {
        Score score = new Score();
        assertThrows(IllegalArgumentException.class, () -> {
            score.updateScore(10, -1);
        });
    }

    @Test
    public void testUpdateScoreInvalidActionIndexTooHigh() {
        Score score = new Score();
        assertThrows(IllegalArgumentException.class, () -> {
            score.updateScore(10, 5);
        });
    }

    @Test
    public void testGetActionScoreInvalidActionIndexNegative() {
        Score score = new Score();
        assertThrows(IllegalArgumentException.class, () -> {
            score.getActionScore(-1);
        });
    }

    @Test
    public void testGetActionScoreInvalidActionIndexTooHigh() {
        Score score = new Score();
        assertThrows(IllegalArgumentException.class, () -> {
            score.getActionScore(5);
        });
    }

    @Test
    public void testTotalScoreWhenMultipleInstancesExist() {
        Score score1 = new Score();
        Score score2 = new Score();

        score1.updateScore(20, 0);
        score2.updateScore(30, 1);

        assertEquals(50, Score.totalScore);
        // Note: This test relies on the fact that `totalScore` is static, which means it
        // is shared across instances. If this is not the intended functionality, it might
        // be better to reconsider the use of static here.
    }
} 

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

