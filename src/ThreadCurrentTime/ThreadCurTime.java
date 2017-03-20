package ThreadCurrentTime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Создать поток, который будет каждые 10 секунд выводить текущее
 * время на экран. Сделать возможность прерывания потока с помощью
 * команды с консоли.
 */

public class ThreadCurTime {

    public static class GetCurTime extends Thread {
        public void run() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            while (!isInterrupted()) {
                System.out.println("Current time: " + dateFormat.format(new Date().getTime()));
                System.out.println("Wait 10 sec");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            GetCurTime t = new GetCurTime();
            t.start();
            System.out.println("You should type \"5\" for process stop");
            int n = 0;
            while (n != 5) {
                n = Integer.parseInt(reader.readLine());
            }
            System.out.println("The End.");
            t.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
