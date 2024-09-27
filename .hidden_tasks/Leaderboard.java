import java.util.List;
import java.util.ArrayList;

public class Leaderboard {
    // Method to update leaderboard with a new score
    public static void updateLeaderboard(ArrayList<Integer> leaderboard, int score) {
        leaderboard.add(score);
        Collections.sort(leaderboard, Collections.reverseOrder()); // Sort in descending order

        // Keep only top 5 scores (for example)
        if (leaderboard.size() > 5) {
            leaderboard.subList(5, leaderboard.size()).clear();
        }
    }

    // Method to print the leaderboard
    public static void printLeaderboard(ArrayList<Integer> leaderboard) {
        System.out.println("=== Leaderboard ===");
        for (int i = 0; i < leaderboard.size(); i++) {
            System.out.println((i + 1) + ": " + leaderboard.get(i));
        }
    }
}