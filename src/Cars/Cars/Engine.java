package Cars.Cars;

public class Engine {
    private double mileage;
    private boolean started;
    private double engineVolume;
    private double fuelConsumption;
    
    public Engine(double mileage, double engineVolume) {
        this.mileage = mileage;
        this.engineVolume = engineVolume;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }

    //Добавить свойство «объем двигателя» в класс Engine
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getTotalFuelBurned() {
        fuelConsumption = engineVolume * 10; // потребление топлива на 1 км
        return fuelConsumption * mileage;
    }
}
