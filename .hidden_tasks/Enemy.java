public class Enemy {
    private int x, y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTowardsPlayer(Player player) {
        if (x < player.getX()) {
            x++;
        } else if (x > player.getX()) {
            x--;
        }

        if (y < player.getY()) {
            y++;
        } else if (y > player.getY()) {
            y--;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}