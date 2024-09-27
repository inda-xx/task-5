import java.util.List;
import java.util.ArrayList;

public class Game {
    private Player player;
    private Score score;
    private ArrayList<Enemy> enemies;

    public Game() {
        // TODO: Implement this constructor.
    }

    public void runGame() {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Implement this method.
    }
}

class Player {
    public static final String[] DIRECTION = {"NORTH", "EAST", "SOUTH", "WEST"};

    public Player() {
        // TODO: Implement this constructor.
    }

    public void move(int direction) {
        // TODO: Implement this method.
    }

    public String getPosition() {
        // TODO: Implement this method.
        return null;
    }
}

class Score {
    private int totalScore;

    public Score() {
        // TODO: Implement this constructor.
    }

    public void updateScore(int points, int actionIndex) {
        // TODO: Implement this method.
    }

    public int getTotalScore() {
        // TODO: Implement this method.
        return 0;
    }
}

class Enemy {

    public Enemy() {
        // TODO: Implement this constructor.
    }

    public void interact(Player player) {
        // TODO: Implement this method.
    }

    public void addEnemy(Enemy enemy) {
        // TODO: Implement this method.
    }
}