package inheritancemethods.cars;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public boolean isFuelAvailable(int km) {
        return ((super.getFuel() + extraFuel) - (super.getFuelRate() * (km / 100.0))) > 0.0;
    }

    @Override
    public void drive(int km) {
        if (isFuelAvailable(km)) {
            extraFuel -= km * super.getFuelRate() / 100;
            if (extraFuel < 0) {
                modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        }
    }

    @Override
    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }


}
