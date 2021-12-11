package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header{
    protected String nameOfClient;
    protected String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String tile, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, tile);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    public String getHeader() {
        return title + " - " + nameOfClient + " - " + addressOfBuilding;
    }

    @Override
    public String getNameOfClient() {
        return nameOfClient;
    }

    @Override
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }
}
