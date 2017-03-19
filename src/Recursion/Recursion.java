package Recursion;
/**
 * Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов, имя которых
 * длиннее 5 символов и вторая буква равна ‘A’.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Recursion {

    private static void listAll(String path, ArrayList<String> res) throws IOException {
        File dir = new File(path);
        File[] list = dir.listFiles();

        if (list == null) return;
        for (File f : list) {
            if (f.isFile() && f.getName().length() > 5 && f.getName().charAt(1) == 'A') {
                res.add("File: " + f.getCanonicalPath());
            } else if (f.isDirectory()) {
                if (f.getName().length() > 5 && f.getName().charAt(1) == 'A') {
                    res.add("Directory: " + f.getCanonicalPath());
                }
                listAll(f.getCanonicalPath(), res);
            }
        }
    }

    public static void main(String[] args) {
        final String path = "D:\\";
        ArrayList<String> res = new ArrayList<String>();

        try {
            listAll(path, res);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : res)
            System.out.println(s);
    }
}
