import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private static int score = 0; // Static field to maintain the player's score
    private static int[] playerPosition = {0, 0}; // Array to store player's position (x, y)
    private static ArrayList<Enemy> enemies = new ArrayList<>(); // ArrayList to store enemies

    public static void main(String[] args) {
        // Setup initial game environment
        initializeEnemies();
        Scanner scanner = new Scanner(System.in);
        
        // Main game loop
        while (true) {
            System.out.println("Player Position: (" + playerPosition[0] + ", " + playerPosition[1] + ")");
            System.out.println("Score: " + score);
            System.out.println("Enter move direction (up, down, left, right) or 'quit' to stop:");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            movePlayer(playerPosition, input);
            checkCollisionsWithEnemies();
        }

        scanner.close();
        System.out.println("Game Over! Final Score: " + score);
    }

    // Initialize enemies in the game
    private static void initializeEnemies() {
        enemies.add(new Enemy("Goblin"));
        enemies.add(new Enemy("Orc"));
        enemies.add(new Enemy("Troll"));
    }

    // Method to move the player based on input direction
    public static void movePlayer(int[] playerPosition, String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                playerPosition[1]++;
                break;
            case "down":
                playerPosition[1]--;
                break;
            case "left":
                playerPosition[0]--;
                break;
            case "right":
                playerPosition[0]++;
                break;
            default:
                System.out.println("Invalid direction! Use up, down, left or right.");
        }
    }

    // Method to check for collisions with enemies
    private static void checkCollisionsWithEnemies() {
        // Assuming for simplicity, all enemies are at position (0, 0)
        // Normally you would have enemies with their own positions
        if (playerPosition[0] == 0 && playerPosition[1] == 0) {
            if (!enemies.isEmpty()) {
                Enemy defeatedEnemy = enemies.remove(0);
                score += 10; // Increase score when an enemy is defeated
                System.out.println("You defeated an enemy: " + defeatedEnemy.getName());
            }
        }

        if (enemies.isEmpty()) {
            System.out.println("Congratulations! You defeated all enemies.");
        }
    }
}
