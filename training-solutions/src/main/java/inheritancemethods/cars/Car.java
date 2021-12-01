package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean isFuelAvailable(int km) {
        return fuel - (fuelRate * (km / 100.0)) > 0.0;
    }

    public void drive(int km) {
        if (isFuelAvailable(km)) {
            modifyFuelAmount(fuelRate * (km / 100.0) * -1.0);
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }
}
