package interfacerules.commonproperties;

public class Equator implements Name, Length {

    final static String NAME = "Equator";
    final static double LENGTH = 40_075;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
