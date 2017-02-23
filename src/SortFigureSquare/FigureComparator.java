package SortFigureSquare;

import java.util.Comparator;

/**
 * Создать список фигур. Реализовать сортировку списка по
 возрастанию площади фигуры.
 */
public class FigureComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;
        if (f1.getSquare() < f2.getSquare())
            return -1;
        else if (f1.getSquare() == f2.getSquare())
            return 0;
        else if (f1.getSquare() > f2.getSquare())
            return 1;
        return 0;
    }
}
