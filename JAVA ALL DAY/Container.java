class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        float ballX = ball.getX();
        float ballY = ball.getY();
        float ballRadius = ball.getRadius();

        return ballX - ballRadius >= x1 && ballX + ballRadius <= x2 &&
                ballY - ballRadius >= y1 && ballY + ballRadius <= y2;
    }

    @Override
    public String toString() {
        return String.format("Container[(%d,%d),(%d,%d)]", x1, y1, x2, y2);
    }
}