import java.util.List;
import java.util.ArrayList;

public class Enemy {
    private ArrayList<Enemy> enemies;

    public Enemy() {
        enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void interact(Player player) {
        ArrayList<Integer> playerPosition = player.getPosition();
        for (Enemy enemy : enemies) {
            // Logic to interact with the player
            // For simplicity, assume each enemy has a method to determine distance to player
            if (enemy.isNearTo(playerPosition)) {
                System.out.println("Enemy interacting with player!");
                // Implement interaction logic, e.g., reduce score, etc.
            }
        }
    }
    
    private boolean isNearTo(ArrayList<Integer> playerPosition) {
        // Dummy logic for determining if an enemy is near the player
        // In practice, you'd have more attributes (like position) to use here
        return true; 
    }
}