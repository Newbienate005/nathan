public class Ball {
    float x;
    float y;
    int radius;
    float xdelta;
    float ydelta;

    public Ball(float x, float y, int radius, float xdelta, float ydelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xdelta = xdelta;
        this.ydelta = ydelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float newx) {
        this.x = newx;
    }

    public void setY(float newy) {
        this.y = newy;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newradius) {
        this.radius = newradius;
    }

    public float getXDelta() {
        return xdelta;
    }

    public void setXDelta(float newxdelta) {
        this.xdelta = newxdelta;
    }

    public float getYDelta() {
        return ydelta;
    }

    public void setYDelta(float newydelta) {
        this.ydelta = newydelta;
    }

    public void move() {
        x += xdelta;
        y += ydelta;
    }

    public void reflectHorizontal() {
        xdelta = -xdelta;
    }

    public void reflectiveVertical() {
        ydelta = -ydelta;
    }

    @Override
    public String toString() {
        return "ball[()" + x + "," + y + ",speed=(" + xdelta + "," + ydelta + ")]";
    }
}
