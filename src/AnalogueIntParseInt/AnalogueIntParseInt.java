package AnalogueIntParseInt;

import java.util.IllegalFormatException;

/**
 * Написать аналог Integer.parseInt. Использовать исключения
 */
public class AnalogueIntParseInt {
    public static String parseString(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n should be positive");
        }
        return n + "";
    }

    public static void main(String[] args) {
        try {
            System.out.println(parseString(-1));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
