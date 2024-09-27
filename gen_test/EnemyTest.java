package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testInteractWithPlayer() {
        Player player = new Player();
        Enemy enemy = new Enemy();
        enemy.interact(player);
        // In this dummy implementation, we just test that the method doesn't throw an exception
        assertTrue(true);
    }

    @Test
    public void testAddEnemy() {
        Enemy enemy = new Enemy();
        Enemy subEnemy = new Enemy();
        enemy.addEnemy(subEnemy);
        // Since no public method exists for checking sub-enemies, this test assumes no exception
        assertTrue(true);
    }
}