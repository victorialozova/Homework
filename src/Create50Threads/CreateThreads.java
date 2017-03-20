package Create50Threads;

/**
 * Создать поток, который создаст 50 потоков, каждый их которых
 * выведет на экран свой номер и дождется, пока его прервут.
 * Прерывание дочерних потоков должно выполнятся из потока их
 * порождающего.
 */
public class CreateThreads {

    public static void main(String[] args) {
        Runner mainThread = new Runner();
        mainThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainThread.interrupt();
    }
}
