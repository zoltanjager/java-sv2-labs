package enumtype.firstenum.enumtype.solarsystem;

public enum SolarSystem {
    MARS(2), EARTH(1), VENUS(3);
    private final int numberOfMoons;

    SolarSystem(int numberOfMoons){
        this.numberOfMoons=numberOfMoons;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
}
