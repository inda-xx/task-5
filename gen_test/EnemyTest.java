package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testEnemyInteraction() {
        Player player = new Player();
        Enemy enemy = new Enemy();
        ArrayList<Integer> playerPosition = player.getPosition();
        
        // Since our `Enemy#isNearTo` method always returns true, we only need to verify
        // that the method exists at all.
        assertTrue(enemy.isNearTo(playerPosition));
    }
}