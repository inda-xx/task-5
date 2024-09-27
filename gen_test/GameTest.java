package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testGameInitialization() {
        Game game = new Game();
        // Check if the game initializes properly
        assertNotNull(game);
    }

    @Test
    public void testScoreUpdatesOnMove() {
        Game game = new Game();
        Score score = new Score();
        int initialScore = score.getTotalScore();
        
        game.runGame();
        
        // After running the game, the score should have updated
        assertTrue(score.getTotalScore() > initialScore);
    }
}

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

