package FigurePolym;

/**
 * Построить иерархию классов «Фигуры» с учетом знаний о
 полиморфизме. У каждого класса фигуры должен быть
 метод подсчета площади. Создать список фигур. Вывести
 площади всех фигур на экран.
 */
public class Circlepolym extends FigurePolym{
    private static double pi = 3.14;

//стороны a и b в случае нахождения площали круга будут равны между собой и равны радиусу, т.е.: square = pi*r*r = pi*a*b
    public Circlepolym(int a, int b) {
        super(a, b);
    }

    public double getSquare() {
        return pi * a * b;
    }
}
