package Homework;

/**
 Написать класс, который умеет считать
 количество созданных объектов этого класса
 (static).
 */

public class CountObj {
    public static int count;

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            CountObj mainObj = new CountObj();
        }
        System.out.println(CountObj.count);
    }

    public CountObj() {
        count++;
    }
}
