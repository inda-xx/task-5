public class Player {
    private int[] position = {0, 0}; // X and Y coordinates

    public void move(int x, int y) {
        position[0] += x;
        position[1] += y;
    }

    public int[] getPosition() {
        return position;
    }
}