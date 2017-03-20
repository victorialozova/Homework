package Create50Threads;

import java.util.ArrayList;

/**
 * Создать поток, который создаст 50 потоков, каждый их которых
 * выведет на экран свой номер и дождется, пока его прервут.
 * Прерывание дочерних потоков должно выполнятся из потока их
 * порождающего.
 */
public class Runner extends Thread {
    public ArrayList<NumberThread> list = new ArrayList<>();

    public void run() {
        for (int i = 0; i < 50; i++) {
            NumberThread n = new NumberThread(i);
            list.add(n);
            n.start();
        }
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt();
            }
        }
        for (NumberThread n : list) {
            n.interrupt();
        }
    }
}
