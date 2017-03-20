package Create50Threads;

/**
 * Создать поток, который создаст 50 потоков, каждый их которых
 * выведет на экран свой номер и дождется, пока его прервут.
 * Прерывание дочерних потоков должно выполнятся из потока их
 * порождающего.
 */
public class NumberThread extends Thread {
    public int number;

    public NumberThread(int number) {
        this.number = number;
    }

    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Running thread number: " + number);
                Thread.sleep(8000);
            }
        } catch (InterruptedException e) {
            return;
        }
    }
}
