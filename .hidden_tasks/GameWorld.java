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
        // Set player initial position
        playerX = SIZE / 2;
        playerY = SIZE / 2;
        gameGrid[playerX][playerY] = PLAYER;

        // Randomly place enemies
        Random rand = new Random();
        for (int i = 0; i < 5; i++) { // Place 5 enemies
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (gameGrid[x][y] != EMPTY);

            gameGrid[x][y] = ENEMY;
            enemies.add(new int[]{x, y});
        }
    }

    public void movePlayer(char direction) {
        int newX = playerX;
        int newY = playerY;

        switch (direction) {
            case 'W': newX = playerX - 1; break;
            case 'A': newY = playerY - 1; break;
            case 'S': newX = playerX + 1; break;
            case 'D': newY = playerY + 1; break;
        }

        if (isValidMove(newX, newY)) {
            if (gameGrid[newX][newY] == ENEMY) {
                increaseScore();
                removeEnemy(newX, newY);
            }
            makeMove(newX, newY);
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE;
    }

    private void makeMove(int newX, int newY) {
        gameGrid[playerX][playerY] = EMPTY;
        playerX = newX;
        playerY = newY;
        gameGrid[playerX][playerY] = PLAYER;
    }

    private void removeEnemy(int x, int y) {
        gameGrid[x][y] = EMPTY;
        enemies.removeIf(enemy -> enemy[0] == x && enemy[1] == y);
    }

    public static void increaseScore() {
        score++;
    }

    public void moveEnemies() {
        Random rand = new Random();
        for (int[] enemy : enemies) {
            int originalX = enemy[0];
            int originalY = enemy[1];
            int newX, newY;
            do {
                newX = originalX + rand.nextInt(3) - 1;
                newY = originalY + rand.nextInt(3) - 1;
            } while (!isValidMove(newX, newY) || gameGrid[newX][newY] == PLAYER);
            
            gameGrid[originalX][originalY] = EMPTY;
            enemy[0] = newX;
            enemy[1] = newY;
            gameGrid[newX][newY] = ENEMY;
        }
    }

    public boolean checkVictory() {
        return enemies.isEmpty();
    }

    public static int getScore() {
        return score;
    }

    public static void main(String[] args) {
        GameWorld game = new GameWorld();
        
        // Simulating player movements and enemy interactions
        game.movePlayer('W');
        game.movePlayer('D');
        game.moveEnemies();
        
        System.out.println("Current Score: " + GameWorld.getScore());
        System.out.println("Victory: " + game.checkVictory());
    }
}