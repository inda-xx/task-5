import java.util.List;
import java.util.ArrayList;

public class Enemy {
    private static ArrayList<int[]> enemyPositions = new ArrayList<>();

    public static void addEnemy(int x, int y) {
        enemyPositions.add(new int[]{x, y});
    }

    public static boolean detectCollision(int[] playerPosition) {
        for (int[] enemyPosition : enemyPositions) {
            if (enemyPosition[0] == playerPosition[0] && enemyPosition[1] == playerPosition[1]) {
                return true; // Collision detected
            }
        }
        return false;
    }
}