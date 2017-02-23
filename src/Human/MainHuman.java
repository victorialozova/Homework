package Human;

import java.util.Arrays;

/**
 * Модифицировать код для сортировки Human чтобы
 * элементы упорядочивались по убыванию.
 */
public class MainHuman {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40),
                new Human(20),
                new Human(3),
                new Human(7)
        };
        Arrays.sort(list, new HumanComparator());
        for (Human h : list)
            System.out.println(h.getAge());
    }
}