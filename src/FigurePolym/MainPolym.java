package FigurePolym;

/**
 * Построить иерархию классов «Фигуры» с учетом знаний о
 полиморфизме. У каждого класса фигуры должен быть
 метод подсчета площади. Создать список фигур. Вывести
 площади всех фигур на экран.
 */

public class MainPolym {
    public static void main(String[] args) {
        FigurePolym[] listFigure = {
                new TrianglePolym(3, 9),
                new RectanglePolym(3, 9),
                new Circlepolym(7, 7)
        };
        for (FigurePolym l : listFigure) {
            System.out.println(l.getSquare());
        }
    }
}
