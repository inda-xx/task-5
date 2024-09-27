package src;

import java.util.ArrayList;

public class Game {
    private static int score = 0;
    private static ArrayList<Enemy> enemies = new ArrayList<>();

    public static void movePlayer(int[] position, String direction) {
        switch (direction.toLowerCase().trim()) {
            case "up":
                position[1]++;
                break;
            case "down":
                position[1]--;
                break;
            case "left":
                position[0]--;
                break;
            case "right":
                position[0]++;
                break;
            default:
                System.out.println("Invalid direction!");
                break;
        }
    }

    public static void initializeEnemies() {
        enemies.clear();
        enemies.add(new Enemy(2, 2));
        enemies.add(new Enemy(3, 3));
    }

    public static void checkCollisionsWithEnemies() {
        // Example collision logic
        // This method should update score and remove enemies as needed
        // Implementation goes here...
    }

    // Accessors and Mutators
    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Game.score = score;
    }

    public static ArrayList<Enemy> getEnemies() {
        return enemies;
    }
}
