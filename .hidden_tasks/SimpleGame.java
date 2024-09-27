import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGame {
    // Main method to start the game
    public static void main(String[] args) {
        gameLoop();
    }

    // Method to handle player movement; takes current position and direction as input
    public static int[] movePlayer(int[] position, String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                position[1]--; // Move up
                break;
            case "down":
                position[1]++; // Move down
                break;
            case "left":
                position[0]--; // Move left
                break;
            case "right":
                position[0]++; // Move right
                break;
            default:
                System.out.println("Invalid direction! Use 'up', 'down', 'left', or 'right'.");
                break;
        }
        return position;
    }

    // Method to update the player's score based on points gained; uses an ArrayList for dynamic storage
    public static ArrayList<Integer> updateScore(ArrayList<Integer> scores, int points) {
        scores.add(points);
        return scores;
    }

    // Method to check collision between player and enemies; compares positions
    public static boolean checkCollision(ArrayList<int[]> enemies, int[] playerPos) {
        for (int[] enemyPos : enemies) {
            if (enemyPos[0] == playerPos[0] && enemyPos[1] == playerPos[1]) {
               return true;
            }
        }
        return false;
    }

    // Game loop that simulates game life cycle
    public static void gameLoop() {
        // Initialize player start position
        int[] playerPosition = {0, 0};
        // Initialize scores list
        ArrayList<Integer> scores = new ArrayList<>();
        // Initialize enemy positions
        ArrayList<int[]> enemies = new ArrayList<>();
        enemies.add(new int[]{2, 2}); // Static example, can be randomized

        Scanner scanner = new Scanner(System.in);

        // Continuous game loop
        while (true) {
            System.out.println("Current position: (" + playerPosition[0] + ", " + playerPosition[1] + ")");
            System.out.print("Enter move direction (up, down, left, right): ");
            String direction = scanner.nextLine();

            // Move player based on input
            playerPosition = movePlayer(playerPosition, direction);

            // Check for collision
            if (checkCollision(enemies, playerPosition)) {
                System.out.println("Collision detected! Game Over.");
                break;
            }

            // Update score (simulated as a constant gain here for simplicity)
            scores = updateScore(scores, 10);

            // Display current score
            System.out.println("Current Score: " + scores.stream().mapToInt(Integer::intValue).sum());
        }

        scanner.close();
    }
}