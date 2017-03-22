package ConvertStringInList;

import java.util.ArrayList;

/**
 * Написать метод для конвертации массива строк/чисел в
 * список
 */
public class ConvertStringInList {
    public static String[] s = {"a", "b", "c", "d"};

    public static void main(String[] args) {
        ArrayList<String> ars = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            ars.add(s[i]);
            System.out.println(ars.get(i));
        }
    }
}
