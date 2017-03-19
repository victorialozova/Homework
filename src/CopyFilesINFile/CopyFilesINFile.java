package CopyFilesINFile;

import java.io.*;
import java.util.*;

/**
 * Написать программу, которая скопирует несколько файлов в один.
 * Подумать как для этого использовать java.io.SequenceInputStream
 */

public class CopyFilesINFile {
    public static class SequenceInputStreamTest {

        public static ArrayList<InputStream> findFiles(String path) throws FileNotFoundException {
            File dir = new File(path);
            ArrayList<InputStream> listFile = new ArrayList<>();
            for (File file : dir.listFiles()) {
                listFile.add(new FileInputStream(file));
            }
            return listFile;
        }

        public static void main(String[] args) throws Exception {
            File file = new File("D:\\FolderSequence\\file4.txt");
            file.delete();
            ArrayList<InputStream> list = findFiles("D:\\FolderSequence");

            file.createNewFile();
            FileOutputStream fout = new FileOutputStream(file);

            Enumeration<InputStream> enumeration = Collections.enumeration(list);

            SequenceInputStream sis = new SequenceInputStream(enumeration);
            byte[] buf = new byte[2048];
            int result;
            while ((result = sis.read(buf)) != -1) {
                fout.write(buf, 0, result);
            }
            for (InputStream l : list) {
                l.close();
            }
            fout.close();
        }
    }
}