package CopyThreadBlocks;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Копирование файла блоками (1 поток на блок).
 */
public class CopyThreadBlocks {

    public static class CopyFileThr extends Thread {
        String src, dest;

        public CopyFileThr(String src, String dest) {
            this.src = src;
            this.dest = dest;
        }

        public void run() {
            try {
                copyFile();
            } catch (IOException e) {
                return;
            }
        }

        private void copyFile() throws IOException {
                try(RandomAccessFile in = new RandomAccessFile(src, "r");
                    RandomAccessFile out = new RandomAccessFile(dest, "rw");) {
                    byte[] buf = new byte[1024];
                    int r;
                    do {
                        r = in.read(buf, 0, buf.length);
                        if (r > 0) {
                            out.write(buf, 0, r);
                        }
                    } while (r > 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        public static void main(String[] args) {
            CopyFileThr c = new CopyFileThr("d:\\copyfile_1.txt", "d:\\copyfile_2.txt");
            c.start();
        }
    }
}
