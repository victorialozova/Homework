package FiveClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Найти в стандартной библиотеке 5 классов, методы которых
 кидают исключения и написать пример кода для их обработки
 (пример: Integer.parseInt).
 */
public class FiveExceptions {

    public static void StringToInt(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException ex) {
            System.out.println("There is no numbers");
        }
    }

    public static void ArrayIndexOut(int num) {
        int[] arrayOut = new int[num];
        for (int i = 0; i < arrayOut.length; i++) {
            arrayOut[i] = i;
            System.out.println(arrayOut[i]);
        }
        try {
            arrayOut[4] = num;
        } catch (ArrayIndexOutOfBoundsException er) {
            System.out.println("Going beyond the array");
        }
    }

    public static void CharFromString(int index) {
        String s = "Catch me";
        try {
            char chr = s.charAt(index);
            System.out.println(chr);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Going beyond the string");
        }
    }

    public static void NullPointer() {
        int[] nullArray = new int[4];
        nullArray = null;
        try {
            System.out.println(nullArray.length);
        } catch (NullPointerException ex) {
            System.out.println("Array variable is null");
        }
    }

    public static void ArithmeticError() {
        for (int i = 0; i < 5; i++) {
            try {
                int d = 5 / i;
                System.out.println(d);
            } catch (ArithmeticException ex) {
                System.out.println("Division by zero");
            }
        }
    }

    public static void main(String[] args) {
            StringToInt("No numbers");
            ArrayIndexOut(3);
            CharFromString(-1);
            NullPointer();
            ArithmeticError();
        }

}
