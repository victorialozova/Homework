package ThreadsInTxt;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Написать класс, который позволит записывать
 * текстовые данные в один файл из разных потоков.
 */
public class ThreadsInTxt extends Thread {
    private String path, txt;

    public ThreadsInTxt(String path, String txt) {
        this.path = path;
        this.txt = txt;
    }

    public void run() {
            try (RandomAccessFile r = new RandomAccessFile(path, "rw")) {
                synchronized (path){
                byte[] text = txt.getBytes();
                r.seek(r.length());
                r.write(text);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<ThreadsInTxt> th = new ArrayList<ThreadsInTxt>();
        for (int i = 0; i < 5; i++) {
            th.add(new ThreadsInTxt("D:\\threadTxt.txt", "number " + i + System.lineSeparator()));
        }
        for (ThreadsInTxt thr : th) {
            thr.start();
        }
    }
}
