package CounterThreat;

/**
 * Модифицировать класс Counter так, чтобы он циклически выводил
 числа из определенного диапазона
 */
public class NewCounter {
    public static class Counter extends Thread {
        int begin = 0;
        int end = 0;

        public Counter(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        public void run() {
            while (!isInterrupted()) { // условие завершения потока №1
                for (int i = begin; i < end; i++) {
                    System.out.println(getId() + " " + i);
                    try {
                        Thread.sleep(1000); // закомментировать
                    } catch (InterruptedException e) {
                        return; // условие завершения потока №2
                    }
                }
            }
        }

        public static void main(String[] args) {
            try {
                Counter c = new Counter(12, 20);
                c.start(); // запускаем поток
                Thread.sleep(5000); // ждем 5 сек
                c.interrupt(); // прерываем поток
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

