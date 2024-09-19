public class GameUtils {

    public static int calculateScore(int elapsedTime, int enemiesDefeated) {
        return enemiesDefeated * 10 - elapsedTime;
    }
}