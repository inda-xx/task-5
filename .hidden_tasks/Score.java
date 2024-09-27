public class Score {
    private int[] actionScores;
    public static int totalScore;

    public Score() {
        // Initialize actionScores with a size to track multiple actions
        actionScores = new int[5]; // Assume 5 types of actions for simplicity
        totalScore = 0;
    }

    public void updateScore(int points, int actionIndex) {
        if (actionIndex < 0 || actionIndex >= actionScores.length) {
            throw new IllegalArgumentException("Invalid action index");
        }
        actionScores[actionIndex] += points;
        totalScore += points;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getActionScore(int actionIndex) {
        if (actionIndex < 0 || actionIndex >= actionScores.length) {
            throw new IllegalArgumentException("Invalid action index");
        }
        return actionScores[actionIndex];
    }
}