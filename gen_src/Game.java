import java.util.Scanner;

public class Game {
    private static int[] scores = new int[4]; // Array to store scores for 4 rounds
    private static Player player;
    private static Enemy enemyManager;

    public static void main(String[] args) {

        player = new Player(0, 0);
        enemyManager = new Enemy();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game Started!");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Round " + (i + 1));

            System.out.println("Move the player: ");
            String direction = scanner.nextLine();
            player.move(direction);
            System.out.println("Player moved to position: (" + player.getX() + ", " + player.getY() + ")");

            enemyManager.spawnEnemy("Goblin");

            if (enemyManager.isEnemyNear(player.getX(), player.getY())) {
                System.out.println("You encountered an enemy!");
                scores[i] = 10; // Increment score for encountering an enemy
            } else {
                scores[i] = 5; // Lower score if no enemy encountered
            }

            enemyManager.displayEnemies();
        }

        int totalScore = calculateTotalScore(scores);
        System.out.println("Game Over! Your total score is: " + totalScore);
    }

    public static int calculateTotalScore(int[] playerScores) {
        int total = 0;
        for (int score : playerScores) {
            total += score;
        }
        return total;
    }
}
