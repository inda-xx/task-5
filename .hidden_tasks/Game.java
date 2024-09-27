import java.util.List;
import java.util.ArrayList;

public class Game {
    private Player player;
    private Score score;
    private ArrayList<Enemy> enemies;

    public Game() {
        player = new Player();
        score = new Score();
        enemies = new ArrayList<>();
        // Add some enemies to the game
        Enemy enemy1 = new Enemy();
        enemies.add(enemy1);
        enemy1.addEnemy(new Enemy());
    }

    public void runGame() {
        // Simple game loop to demonstrate concept
        for (int i = 0; i < 10; i++) {
            // Simulate player moving randomly for demo
            int randomDirection = (int) (Math.random() * Player.DIRECTION.length);
            player.move(randomDirection);

            // Update score for this move
            score.updateScore(10, 0); // Assume action index 0 denotes movement

            // Interact enemies with player
            for (Enemy enemy : enemies) {
                enemy.interact(player);
            }

            System.out.println("End of cycle " + i + ": Player position: " + player.getPosition() + ", Total score: " + score.getTotalScore());
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }
}