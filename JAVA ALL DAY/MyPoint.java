public class MyPoint {
    // Attributes with default values
    private int x = 0;
    private int y = 0;

    // Constructors
    public MyPoint() {
        // Default constructor, (x, y) = (0, 0)
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to get both x and y as an array
    public int[] getXY() {
        return new int[] { x, y };
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Method to calculate distance to another point (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate distance to another MyPoint instance
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Method to calculate distance to (0, 0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
