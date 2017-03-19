package TxtFileCreate;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Написать программу, которая создаст текстовый файл и запишет в него
 * список файлов (путь, имя, дата создания) из заданного каталога.
 */
public class TxtFileCreate {
    public static void main(String[] args) throws IOException {
        new File("D:\\folderNew\\newFile.txt").createNewFile();
        ArrayList<String> list = new ArrayList<String>();
        findFiles("D:\\folderPath", list);
        try (FileWriter writer = new FileWriter("D:\\folderNew\\newFile.txt")) {
            for (String s : list)
                writer.write(s + System.lineSeparator());
                writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void findFiles(String srcPath, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            Long lastModified = files[i].lastModified();
            Date date = new Date(lastModified);
            list.add(files[i].getName() + " " + files[i].getCanonicalPath() + " " + String.valueOf(date));
        }
    }
}