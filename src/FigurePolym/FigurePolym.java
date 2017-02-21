package FigurePolym;

/**
 * Построить иерархию классов «Фигуры» с учетом знаний о
 полиморфизме. У каждого класса фигуры должен быть
 метод подсчета площади. Создать список фигур. Вывести
 площади всех фигур на экран.
 */
public abstract class FigurePolym {
    protected int a;
    protected int b;

    public FigurePolym(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getSquare();
}
