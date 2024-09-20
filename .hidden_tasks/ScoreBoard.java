import java.util.List;
import java.util.ArrayList;

public class ScoreBoard {
    private static ArrayList<Integer> scores = new ArrayList<>();

    public static void addScore(int score) {
        scores.add(score);
    }

    public static double getAverageScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / (double) scores.size();
    }
}