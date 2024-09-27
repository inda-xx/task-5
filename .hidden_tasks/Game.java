import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    // Static variables for player position and score
    public static int[] playerPosition = {0, 0};
    public static int score = 0;
    public static ArrayList<int[]> enemies = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;
        
        while (gameRunning) {
            System.out.println("Welcome to the Simple Game!");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    gameRunning = false;
                    System.out.println("Exiting game.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void startGame(Scanner scanner) {
        boolean gameActive = true;

        // Example of adding enemies at random positions
        spawnEnemy(2, 2);
        spawnEnemy(3, 3);

        while (gameActive) {
            System.out.println("\nPlayer Position: " + Arrays.toString(playerPosition));
            System.out.println("Score: " + score);
            System.out.println("Enemies: ");
            for (int[] enemy : enemies) {
                System.out.println(Arrays.toString(enemy));
            }

            System.out.println("\nMove Player: (W)Up (S)Down (A)Left (D)Right (Q)Quit");
            char move = scanner.next().toUpperCase().charAt(0);

            switch (move) {
                case 'W':
                    moveUp();
                    break;
                case 'S':
                    moveDown();
                    break;
                case 'A':
                    moveLeft();
                    break;
                case 'D':
                    moveRight();
                    break;
                case 'Q':
                    gameActive = false;
                    System.out.println("Exiting current game.");
                    break;
                default:
                    System.out.println("Invalid move. Try again.");
            }

            // Check for interactions after move
            checkInteractions();
        }
    }

    public static void moveUp() {
        playerPosition[1] += 1;
    }

    public static void moveDown() {
        if (playerPosition[1] > 0) {
            playerPosition[1] -= 1;
        }
    }

    public static void moveLeft() {
        if (playerPosition[0] > 0) {
            playerPosition[0] -= 1;
        }
    }

    public static void moveRight() {
        playerPosition[0] += 1;
    }

    public static void spawnEnemy(int x, int y) {
        enemies.add(new int[]{x, y});
    }

    public static void checkInteractions() {
        for (int i = 0; i < enemies.size(); i++) {
            int[] enemyPosition = enemies.get(i);
            if (Arrays.equals(playerPosition, enemyPosition)) {
                System.out.println("Encountered an enemy!");
                // Update game rules on enemy encounter
                score -= 10;
                enemies.remove(i);
                System.out.println("Score deducted. Current Score: " + score);
                i--; // Important to adjust the index after removal.
            }
        }
    }
}