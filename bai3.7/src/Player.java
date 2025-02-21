public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(ball.getX() - this.x, 2) +
                Math.pow(ball.getY() - this.y, 2) +
                Math.pow(ball.getZ() - this.z, 2));
        return distance < 1.5f;
    }

    public void kick(Ball ball) {
        ball.setXYZ(this.x, this.y, this.z);
    }

    @Override
    public String toString() {
        return "Player[number=" + number + ", position=(" + x + "," + y + "," + z + ")]";
    }
}
