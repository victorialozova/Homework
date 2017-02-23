package SortFigureSquare;

import java.util.Arrays;

/**
 * Создать список фигур. Реализовать сортировку списка по
 возрастанию площади фигуры.
 */
public class SortFigureSquare {
    public static void main(String[] args) {
        Figure[] list = {
                new Circle(45.5),
                new Rectangle(78),
                new Triangle(34)
        };
        Arrays.sort(list, new FigureComparator());
        for (Figure f: list) {
            System.out.println(f.getSquare());
        }
    }
}
