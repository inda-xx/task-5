import java.util.List;
import java.util.ArrayList;

public class Player {
    private ArrayList<Integer> position;
    public static final int[] DIRECTION = {0, 1, 2, 3}; // UP, DOWN, LEFT, RIGHT
    
    public Player() {
        // Initialize the player at the starting position (0,0)
        position = new ArrayList<>();
        position.add(0); // x-coordinate
        position.add(0); // y-coordinate
    }

    public void move(int direction) {
        // Move the player based on the direction
        switch (direction) {
            case 0: // UP
                position.set(1, position.get(1) + 1);
                break;
            case 1: // DOWN
                position.set(1, position.get(1) - 1);
                break;
            case 2: // LEFT
                position.set(0, position.get(0) - 1);
                break;
            case 3: // RIGHT
                position.set(0, position.get(0) + 1);
                break;
            default:
                System.out.println("Invalid Direction");
        }
    }
    
    public ArrayList<Integer> getPosition() {
        return position;
    }
}