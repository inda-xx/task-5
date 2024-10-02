import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Random;

public class SimpleGame {

    // Static integer array to keep track of scores for up to 3 players
    public static int[] scores = new int[3];

    // ArrayList to manage enemy positions on the board
    public static ArrayList<int[]> enemies = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize the game board with size 5x5
        int[][] board = new int[5][5];

        // Example moves and interactions
        movePlayer(board, 0, 0);
        updateScore(0);
        spawnEnemy(board);
        displayScores();
        checkEnemyInteraction(board, enemies, 0, 0);
        displayScores();
    }

    // Method to move player to a specified position on the board
    public static void movePlayer(int[][] board, int x, int y) {
        // Clear previous player position
        clearBoard(board);
        // Set player's new position
        board[x][y] = 1;
    }

    // Method to update the score of a player
    public static void updateScore(int playerIndex) {
        // Increase the player's score by 10
        scores[playerIndex] += 10;
    }

    // Method to spawn an enemy at a random position on the board
    public static void spawnEnemy(int[][] board) {
        Random random = new Random();
        int x = random.nextInt(board.length);
        int y = random.nextInt(board[0].length);
        enemies.add(new int[]{x, y});
        board[x][y] = -1; // Mark enemy position on the board
    }

    // Method to check interaction between player and enemies
    public static void checkEnemyInteraction(int[][] board, ArrayList<int[]> enemies, int playerX, int playerY) {
        for (int[] enemy : enemies) {
            if (enemy[0] == playerX && enemy[1] == playerY) {
                scores[0] -= 5; // Deduct points for interacting with an enemy
            }
        }
    }

    // Method to display scores of all players
    public static void displayScores() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Player " + (i + 1) + " Score: " + scores[i]);
        }
    }

    // Utility method to clear the board
    private static void clearBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }
}