package CopyFiles;
/**
 * Написать программу для копирования всех файлов из одного каталога в другой
 */

import java.io.File;
import java.io.RandomAccessFile;

public class CopyFiles {
    public static void copyFile(File src, File dest) throws Exception {
        RandomAccessFile in = new RandomAccessFile(src, "r");
        try {
            RandomAccessFile out = new RandomAccessFile(dest, "rw");
            try {
                byte[] buf = new byte[2048];
                int r;
                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0)
                        out.write(buf, 0, r);
                } while (r > 0);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}