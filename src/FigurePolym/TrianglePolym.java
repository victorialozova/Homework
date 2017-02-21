package FigurePolym;

/**
 * Построить иерархию классов «Фигуры» с учетом знаний о
 полиморфизме. У каждого класса фигуры должен быть
 метод подсчета площади. Создать список фигур. Вывести
 площади всех фигур на экран.
 */

public class TrianglePolym extends FigurePolym{

    public TrianglePolym(int a, int b) {
        super(a, b);
    }

    @Override
    public double getSquare() {
        return 0.5 * a * b;
    }
}
