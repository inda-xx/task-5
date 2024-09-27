import java.util.Scanner;

public class Game {
    private static int[] scores;
    private static Player player;
    private static Enemy enemyManager;

    public static void main(String[] args) {
        // TODO: Implement this method.
    }

    public static int calculateTotalScore(int[] playerScores) {
        // TODO: Implement this method.
        return 0;
    }
}

class Player {
    private int x;
    private int y;

    public Player(int startX, int startY) {
        // TODO: Implement this constructor.
    }

    public void move(String direction) {
        // TODO: Implement this method.
    }

    public int getX() {
        // TODO: Implement this method.
        return 0;
    }

    public int getY() {
        // TODO: Implement this method.
        return 0;
    }
}

class Enemy {
    public void spawnEnemy(String type) {
        // TODO: Implement this method.
    }

    public boolean isEnemyNear(int x, int y) {
        // TODO: Implement this method.
        return false;
    }

    public void displayEnemies() {
        // TODO: Implement this method.
    }
}