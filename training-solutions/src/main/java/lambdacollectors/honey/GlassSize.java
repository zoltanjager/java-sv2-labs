package lambdacollectors.honey;

public enum GlassSize {
    BIG(1.0), SMALL(0.5), TASTER_SIZE(0.05);

    private double sizePerKg;

    GlassSize(double sizePerKg) {
        this.sizePerKg = sizePerKg;
    }

    public double getSizePerKg() {
        return sizePerKg;
    }
}
