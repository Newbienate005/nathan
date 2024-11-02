public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has a radius of" + c1.getRadius() + "and the Area is" + c1.getArea());

        Circle c2 = new Circle(2, "blue");
        System.out.println("The circle has the radius of" + c2.getRadius() + "and the Area is" + c2.getArea());
    }
}
