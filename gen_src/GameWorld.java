import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Random;

public class GameWorld {
    private static final int SIZE = 10;
    private static final int PLAYER = 1;
    private static final int ENEMY = 2;
    private static final int EMPTY = 0;
    private static int score = 0;

    private int[][] gameGrid = new int[SIZE][SIZE];
    private ArrayList<int[]> enemies = new ArrayList<>();
    private int playerX = 0;
    private int playerY = 0;

    public GameWorld() {
        initializeGameWorld();
    }

    private void initializeGameWorld() {
        // TODO: Implement this method.
    }

    public void movePlayer(char direction) {
        // TODO: Implement this method.
    }

    private boolean isValidMove(int x, int y) {
        // TODO: Implement this method.
        return false;
    }

    private void makeMove(int newX, int newY) {
        // TODO: Implement this method.
    }

    private void removeEnemy(int x, int y) {
        // TODO: Implement this method.
    }

    public static void increaseScore() {
        // TODO: Implement this method.
    }

    public void moveEnemies() {
        // TODO: Implement this method.
    }

    public boolean checkVictory() {
        // TODO: Implement this method.
        return false;
    }

    public static int getScore() {
        // TODO: Implement this method.
        return 0;
    }

    public static void main(String[] args) {
        // TODO: Implement this method.
    }
}