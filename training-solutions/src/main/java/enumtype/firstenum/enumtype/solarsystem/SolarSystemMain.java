package enumtype.firstenum.enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {

        System.out.println(SolarSystem.VENUS);
        System.out.println(SolarSystem.VENUS.getNumberOfMoons());

        System.out.println(SolarSystem.EARTH);
        System.out.println(SolarSystem.EARTH.getNumberOfMoons());

        System.out.println(SolarSystem.MARS);
        System.out.println(SolarSystem.MARS.getNumberOfMoons());
    }
}
