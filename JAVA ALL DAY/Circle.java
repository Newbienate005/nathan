public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.124;
    }
}