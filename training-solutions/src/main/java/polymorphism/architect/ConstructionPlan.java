package polymorphism.architect;

public class ConstructionPlan extends PermitPlan{
    private int sheetsOfConstructionDrawings;

    public ConstructionPlan(int pagesOfDocumentation, String tile, String nameOfClient, String addressOfBuilding, int sheetsOfConstructionDrawings) {
        super(pagesOfDocumentation, tile, nameOfClient, addressOfBuilding);
        this.sheetsOfConstructionDrawings = sheetsOfConstructionDrawings;
    }

    public int getSheetsOfConstructionDrawings() {
        return sheetsOfConstructionDrawings;
    }
}
