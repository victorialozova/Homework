package Cars.Cars;

public class MyClass {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car ferrari = new Car("Ferrari", 20000, 1.6);
            
        bmw.turnOn();
        ferrari.turnOn();
            
        final int[] speeds = new int[] {20, 60, 100};
            
        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);
            
        bmw.turnOff();
        ferrari.turnOff();
            
        System.out.println(bmw.getName() + " distance: " + bmw.getMileage() + "; total fuel: " + bmw.getTotalFuelBurned());
        System.out.println(ferrari.getName() + " distance: " + ferrari.getMileage() + "; total fuel: " + ferrari.getTotalFuelBurned());
    }
}
