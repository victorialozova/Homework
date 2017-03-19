package CopyFiles;

import java.io.IOException;

import static CopyFiles.copyDir.copyDir;

/**
 * Написать программу для копирования всех файлов из одного каталога в другой
 */

public class MainCopy {
    public static void main(String[] args) throws Exception {
        try {
            copyDir("D:\\Dir_1", "D:\\Dir_2");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
