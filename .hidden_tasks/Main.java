public class Main {
    public static void main(String[] args) {
        // Player Movement
        Player player = new Player();
        player.move(1, 1);

        // Update Score
        ScoreBoard.addScore(10);

        // Enemy Interactions
        Enemy.addEnemy(1, 1);
        if (Enemy.detectCollision(player.getPosition())) {
            System.out.println("Collision occurred!");
        }

        // Display current average score
        System.out.println("Average Score: " + ScoreBoard.getAverageScore());
    }
}