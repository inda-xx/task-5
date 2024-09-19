package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setup() {
        player = new Player();
        enemy = new Enemy(2, 2);
    }

    @Test
    public void testInitialPosition() {
        assertEquals(2, enemy.getX());
        assertEquals(2, enemy.getY());
    }

    @Test
    public void testEnemyMoveTowardsPlayer() {
        player.move('D'); // Move player to the right
        player.move('D');
        enemy.moveTowardsPlayer(player);
        assertEquals(3, enemy.getX());
        assertEquals(2, enemy.getY());
        player.move('S'); // Move player down
        player.move('S');
        enemy.moveTowardsPlayer(player);
        assertEquals(3, enemy.getX());
        assertEquals(3, enemy.getY());
    }

    @Test
    public void testEnemyMoveAwayWhenAlreadyOnPlayer() {
        enemy = new Enemy(0, 0);
        enemy.moveTowardsPlayer(player);
        assertNotEquals(0, enemy.getX());
        assertNotEquals(0, enemy.getY());
    }

    @Test
    public void testEnemyDoesNotMoveIfAlreadyAtPlayerPosition() {
        enemy = new Enemy(player.getX(), player.getY());
        int xBefore = enemy.getX();
        int yBefore = enemy.getY();
        enemy.moveTowardsPlayer(player);
        assertEquals(xBefore, enemy.getX());
        assertEquals(yBefore, enemy.getY());
    }
}