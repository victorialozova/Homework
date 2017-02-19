package Figure;

/**
 * создание дочернего класса Прямоугольник
 */
public class Rectangle extends Figure{
    private int a;
    private int b;

    @Override
    public double getSquare() {
        return a * b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
