class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp, float zDisp) {
        x += xDisp;
        y += yDisp;
        z += zDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        float dx = x - ball.getX();
        float dy = y - ball.getY();
        float dz = z - ball.getZ();
        float distance = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance < 8;
    }

    public void kick(Ball ball) {
        // Implement kick logic here
    }
}