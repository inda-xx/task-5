import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    // Static variables for game state management
    private static int playerScore = 0;
    private static final int GRID_SIZE = 10;

    public static void main(String[] args) {
        int[] playerPosition = {0, 0};
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{2, 2});
        enemies.add(new int[]{3, 3});
        
        // Example game loop
        for (int i = 0; i < 10; i++) {
            movePlayer(playerPosition, "up");
            moveEnemies(enemies);
            
            if (checkEnemyCollision(playerPosition, enemies)) {
                System.out.println("Collision with enemy!");
                updateScore(-10);
            } else {
                updateScore(10);
            }

            // Output the current score
            System.out.println("Current score: " + playerScore);
        }
    }

    // Method to move player according to a given direction
    public static void movePlayer(int[] playerPosition, String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                if (playerPosition[1] < GRID_SIZE - 1) playerPosition[1]++;
                break;
            case "down":
                if (playerPosition[1] > 0) playerPosition[1]--;
                break;
            case "left":
                if (playerPosition[0] > 0) playerPosition[0]--;
                break;
            case "right":
                if (playerPosition[0] < GRID_SIZE - 1) playerPosition[0]++;
                break;
            default:
                System.out.println("Invalid direction!");
                break;
        }
    }

    // Method to update the player's score
    public static void updateScore(int points) {
        playerScore += points;
    }

    // Method to check whether player has collided with any enemy
    public static boolean checkEnemyCollision(int[] playerPosition, ArrayList<int[]> enemies) {
        for (int[] enemy : enemies) {
            if (playerPosition[0] == enemy[0] && playerPosition[1] == enemy[1]) {
                return true;
            }
        }
        return false;
    }

    // Method to move enemies to a random position in the grid
    public static void moveEnemies(ArrayList<int[]> enemies) {
        Random rand = new Random();
        for (int[] enemy : enemies) {
            enemy[0] = rand.nextInt(GRID_SIZE);
            enemy[1] = rand.nextInt(GRID_SIZE);
        }
    }
}