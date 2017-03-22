package DifferentTypeArray;

/**
 * Написать класс, который умеет хранить в себе массив
 * любых типов данных (int, long etc.). Реализовать метод,
 * который возвращает любой элемент массива по индексу
 */
public class DifferentTypeArray<E> {
    private E[] mas;

    public DifferentTypeArray(int n) {
        mas = (E[]) new Object[n];
    }
    public void setElem(E elem, int index) {
        mas[index] = elem;
    }

    public E getElem(int index) {
        return mas[index];
    }
}
