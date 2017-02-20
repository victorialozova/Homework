package Phones.Phone;

/**
 *
 */
public class SamsungS4 extends Phone {
        public SamsungS4() {
            System.out.println("SamsungS4 constructor");

            hasWifi = true;
            screenSize = 5;
        }

        @Override
        public void call(String number) {
            super.call(number);
            System.out.println("SamsungS4 class is calling " + number);
        }

        @Override
        public void sendSMS(String number, String message) {
            increaseSmsCount();
            System.out.println("SamsungS4 class is sending sms " + message + " to " + number + " Hello");
        }
}
