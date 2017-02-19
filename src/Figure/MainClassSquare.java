package Figure;

/**
 * Main class
 */
public class MainClassSquare {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 6);
        System.out.println(triangle.getSquare());

        Rectangle rectangle = new Rectangle(5,7);
        System.out.println(rectangle.getSquare());

        Circle circle = new Circle(8);
        System.out.println(circle.getSquare());
    }
}
