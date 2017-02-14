package Homework;

/**
 Написать класс «автомобиль», который должен
 уметь заводится, глушить мотор, ехать и держать
 необходимую скорость.
 */

public class MyCar {
    private String name;
    private int speed;
    private String state;

    public static void main(String[] args) {
        MyCar car = new MyCar("Honda");
        MyCar car1 = new MyCar("Toyota");
        car1.start();
        car.start();
        System.out.println("State: " + car.getState());
        car.turnOff();
        System.out.println("State: " + car.getState());
        car.riding();
        System.out.println("State: " + car.getState());
        car.setSpeed(180);
    }

    public MyCar(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + " " + "has been started");
        state = "started";
    }

    public void turnOff() {
        System.out.println(name + " " + "has been turned off");
        state = "turned off";
    }

    public void riding() {
        System.out.println(name + " " + "is riding");
        state = "riding";
    }

    public String getState() {
        return state;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
