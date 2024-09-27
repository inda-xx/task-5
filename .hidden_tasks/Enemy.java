import java.util.List;
import java.util.ArrayList;

public class Enemy {
    private ArrayList<String> enemies;

    public Enemy() {
        enemies = new ArrayList<>();
    }

    public void spawnEnemy(String enemyType) {
        enemies.add(enemyType);
        System.out.println("Spawned a " + enemyType);
    }

    public void displayEnemies() {
        System.out.println("Active Enemies: ");
        for (String enemy : enemies) {
            System.out.println(enemy);
        }
    }

    public boolean isEnemyNear(int playerX, int playerY) {
        // Simplified logic: let's say an enemy is 'near' if an enemy exists.
        return !enemies.isEmpty();
    }
}