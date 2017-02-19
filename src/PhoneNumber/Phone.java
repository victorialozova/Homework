package PhoneNumber;

import java.util.ArrayList;

/**
 * Написать код для связи телефонов между собой. У
 каждого телефона будет свой номер. При вызове
 call(x) телефон должен найти собеседника по
 номеру x из всех доступных в данный момент
 телефонов )из всех созданных объектов типа
 Phone) и вызвать его метод answer().
 */

public class Phone {
    private int number;
    private String namePhone;
    static ArrayList<Phone> list = new ArrayList<Phone>();

    public Phone(int number, String namePhone) {
        this.number = number;
        this.namePhone = namePhone;
        list.add(this);
    }

    public void call(int number) {
        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i).number) {
                list.get(i).answer();
            }
        }
    }

    public void answer() {
        System.out.println("Phone: " + namePhone + " answered");
    }


    public static void main(String[] args) {
        Phone phone1 = new Phone(1, "HomePhone");
        Phone phone2 = new Phone(2, "WorkPhone");
        phone1.call(2);
    }
}
