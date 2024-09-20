import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Game {
    // Static variables for score and player position
    private static int score = 0;
    private static char[] playerPosition = new char[10];
    
    // ArrayList to hold enemy types
    private static ArrayList<String> enemies = new ArrayList<>();
    
    // Initialize the game grid
    public static void initializeGrid() {
        for (int i = 0; i < playerPosition.length; i++) {
            playerPosition[i] = '.'; // Empty cell
        }
        playerPosition[0] = 'P'; // Initial player position
        printGrid();
    }
    
    // Move the player to a new position
    public static void movePlayer(int newPosition) {
        if (newPosition >= 0 && newPosition < playerPosition.length) {
            for (int i = 0; i < playerPosition.length; i++) {
                playerPosition[i] = '.'; // Clear old position
            }
            playerPosition[newPosition] = 'P'; // Set new position
            printGrid();
        } else {
            System.out.println("Invalid move. Stay within the grid boundaries.");
        }
    }
    
    // Update the player's score
    public static void updateScore(int points) {
        score += points; // Add points to score
        System.out.println("Score updated: " + score);
    }
    
    // Handle an encounter with an enemy
    public static void enemyEncounter(String enemyType) {
        System.out.println("Encountered enemy: " + enemyType);
        switch(enemyType) {
            case "Goblin":
                score -= 5; // Deduct points for Goblin
                System.out.println("Lost 5 points to a Goblin. Score: " + score);
                break;
            case "Dragon":
                score -= 20; // Deduct points for Dragon
                System.out.println("Lost 20 points to a Dragon. Score: " + score);
                break;
            case "Elf":
                System.out.println("Neutral interaction with an Elf.");
                break;
            default:
                System.out.println("Unknown enemy. No effect.");
        }
    }
    
    // Add an enemy type to the list
    public static void addEnemy(String enemyType) {
        enemies.add(enemyType);
        System.out.println("Added enemy: " + enemyType);
    }
    
    // Print the current grid
    private static void printGrid() {
        StringBuilder sb = new StringBuilder();
        for (char c : playerPosition) {
            sb.append(c).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
    
    // Main method to simulate the game
    public static void main(String[] args) {
        initializeGrid(); // Initialize grid
        movePlayer(3); // Move player to position 3
        updateScore(10); // Increase score by 10
        addEnemy("Goblin"); // Add a Goblin enemy
        enemyEncounter("Goblin"); // Encounter a Goblin
    }
}