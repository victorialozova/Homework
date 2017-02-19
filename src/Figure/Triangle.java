package Figure;

/**
 * создание дочернего класса Треугольник
 */
public class Triangle extends Figure {
    private int a;
    private int h;

    @Override
    public double getSquare() {
        return 0.5 * a * h;
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }
}
