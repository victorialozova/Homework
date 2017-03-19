package ReplaceFile;

import java.io.*;

/**
 * Написать программу, которая считает текстовый файл, заменит в нем все
 слова “Hello” на “1234” и запишет изменения в тот-же файл.

 Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream.
 Подумать как улучшить программу №3 с помощью этих классов.
 */

public class ReadFile {

    static String readText(String fileName) {
        File file = new File(fileName);
        FileInputStream fis;
        BufferedReader br = null;
        String result = "";
        try {
            fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                result += line + System.lineSeparator();
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static void writeText(String fileName, String str) {
        System.out.println(str);
        byte byteData[] = str.getBytes();
        try {
            FileOutputStream fis = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fis);
            bos.write(byteData);
            bos.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        final String file = "D:\\1.txt";
        String text = readText(file);
        text = text.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)", "1234");
        writeText(file, text);
    }
}
