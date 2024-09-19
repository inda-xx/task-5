import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private static int[] scores; // Array to track scores per level

    public Game() {
        this.player = new Player();
        this.enemies = new ArrayList<>();
        scores = new int[10]; // Assume 10 levels
        createEnemies();
    }

    public static void setScore(int level, int score) {
        if (level >= 0 && level < scores.length) {
            scores[level] = score;
        }
    }

    private void createEnemies() {
        // Adding enemies at different positions for demonstration
        enemies.add(new Enemy(2, 2));
        enemies.add(new Enemy(5, 5));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;
        System.out.println("Welcome to the Game!");
        
        while (playing) {
            System.out.print("Enter direction (WASD): ");
            char direction = scanner.nextLine().toUpperCase().charAt(0);
            player.move(direction);

            for (Enemy enemy : enemies) {
                enemy.moveTowardsPlayer(player);
            }
            
            checkEnemyInteractions();
            // For simplicity, we just display positions and exit after one loop
            displayPositions();
            playing = false;
        }
        scanner.close();
    }

    private void checkEnemyInteractions() {
        for (Enemy enemy : enemies) {
            if (enemy.getX() == player.getX() && enemy.getY() == player.getY()) {
                System.out.println("Player touched an enemy! Game over!");
                System.exit(0);
            }
        }
    }

    private void displayPositions() {
        System.out.println("Player position: (" + player.getX() + ", " + player.getY() + ")");
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            System.out.println("Enemy " + i + " position: (" + enemy.getX() + ", " + enemy.getY() + ")");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}