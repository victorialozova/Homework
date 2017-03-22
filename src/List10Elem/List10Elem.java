package List10Elem;

import java.util.ArrayList;

/**
 * Написать метод, который создаст список, положит в него
 * 10 элементов, затем удалит первые два и последний, а
 * затем выведет результат на экран
 */
public class List10Elem {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void createList() {

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(0);
        list.remove(0);

        list.remove(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void main(String[] args) {
        createList();
    }
}

