package Figure;

/**
 * создание дочернего класса Круга
 */
public class Circle extends Figure{
    private final static double pi = 3.14;
    private int radius;

    @Override
    public double getSquare() {
        return pi * Math.pow(radius, 2);
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
