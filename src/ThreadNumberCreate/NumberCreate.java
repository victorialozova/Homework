package ThreadNumberCreate;

/**
 * Создать 100 потоков, каждый их которых выведет на экран свой номер и
 * дождется, пока его прервут.
 */
public class NumberCreate {
    public static class ThreadNumber extends Thread {
        public int num;

        public ThreadNumber(int num) {
            this.num = num;
        }

        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println("Running thread number: " + num);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Stopped thread number: " + num);
            }
        }
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 100; i++) {
                ThreadNumber c = new ThreadNumber(i);
                c.start();
                Thread.sleep(1000);
                c.interrupt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




