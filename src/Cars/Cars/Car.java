package Cars.Cars;

public class Car {
    private String name;
    private Engine engine; // �����
    private Climate climate = new Climate(); // ������-��������
    
    public Car(String name) {
        this.name = name;
        engine = new Engine(0, 2);
    }
    
    public Car(String name, double mileage, double engineVolume) {
        this.name = name;
        engine = new Engine(mileage, engineVolume);
    }
    
    public String getName() {
        return name;
    }
    
    public double getMileage() {
        return engine.getMileage();
    }
    
    // ������� �����
    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }
    
    // ��������� �����
    public void turnOff() {
        climate.turnOff();
    	engine.turnOff();
    }
    
    // ���������� ��������
    public void start(int speed, double hours) {
        if (engine.isStarted()) { // ��� �� ������� �����
        	// ���������� ���������
        	double distance = hours * speed;
        	engine.addMileage(distance);
        }
    }
    public double getTotalFuelBurned() {
        return engine.getTotalFuelBurned();
    }
}