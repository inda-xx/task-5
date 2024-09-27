public class Player {
    private int x, y;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                y -= 1;
                break;
            case "down":
                y += 1;
                break;
            case "left":
                x -= 1;
                break;
            case "right":
                x += 1;
                break;
            default:
                System.out.println("Unknown direction!");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
