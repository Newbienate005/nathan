public class Rectangle {
    float length;
    float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float newlength) {
        this.length = newlength;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float newwidth) {
        this.width = newwidth;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "The length is" + length + "\n" + "The width is" + width;
    }
}
