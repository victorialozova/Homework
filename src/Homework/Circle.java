package Homework;

/**
 Написать класс Homework.Circle (круг) по аналогии с
 Rectangle и метод, который будет возвращать его
 площадь
 */

public class Circle {
    public static final double pi = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 40;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double square() {
        return pi * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(250);
        System.out.println(circle.square());
    }
}
