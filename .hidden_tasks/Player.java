public class Player {
    private int x, y;

    public Player() {
        this.x = 0;
        this.y = 0; // Start position
    }

    public void move(char direction) {
        switch (direction) {
            case 'W':
                y--;
                break; // Move up
            case 'S':
                y++;
                break; // Move down
            case 'A':
                x--;
                break; // Move left
            case 'D':
                x++;
                break; // Move right
        }
        System.out.println("Player moved to position: (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}