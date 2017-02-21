package FigurePolym;

/**
 * Построить иерархию классов «Фигуры» с учетом знаний о
 полиморфизме. У каждого класса фигуры должен быть
 метод подсчета площади. Создать список фигур. Вывести
 площади всех фигур на экран.
 */

public class RectanglePolym extends FigurePolym {
    public RectanglePolym(int a, int b) {
        super(a, b);
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
