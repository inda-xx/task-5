package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {

    @Test
    public void testNoCollision() {
        Enemy.addEnemy(5, 5);
        Player player = new Player();
        player.move(1, 1);
        assertFalse(Enemy.detectCollision(player.getPosition()));
    }

    @Test
    public void testCollisionDetected() {
        Enemy.addEnemy(1, 1);
        Player player = new Player();
        player.move(1, 1);
        assertTrue(Enemy.detectCollision(player.getPosition()));
    }

    @Test
    public void testMultipleEnemiesNoCollision() {
        Enemy.addEnemy(10, 10);
        Enemy.addEnemy(15, 15);
        Player player = new Player();
        player.move(5, 5);
        assertFalse(Enemy.detectCollision(player.getPosition()));
    }

    @Test
    public void testMultipleEnemiesCollision() {
        Enemy.addEnemy(10, 10);
        Enemy.addEnemy(15, 15);
        Player player = new Player();
        player.move(10, 10);
        assertTrue(Enemy.detectCollision(player.getPosition()));
    }

    @Test
    public void testCollisionAfterMovement() {
        Enemy.addEnemy(0, 0);
        Player player = new Player();
        assertTrue(Enemy.detectCollision(player.getPosition()));
        player.move(1, 1);
        assertFalse(Enemy.detectCollision(player.getPosition()));
    }
}