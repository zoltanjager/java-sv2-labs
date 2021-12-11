package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan plan1 = new SketchPlan(222, "Nyaraló");
        System.out.println(plan1.getPagesOfDocumentation());

        Plan plan2 = new PermitPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5");
        System.out.println(plan2.getPagesOfDocumentation());

        Plan plan3 = new ConstructionPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5", 50);
        System.out.println(plan3.getPagesOfDocumentation());

        SketchPlan sketchPlan1 = new SketchPlan(222, "Nyaraló");
        System.out.println(sketchPlan1.getTitle());
        System.out.println(sketchPlan1.getPagesOfDocumentation());

        SketchPlan sketchPlan2 = new PermitPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5");
        System.out.println(sketchPlan2.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation());

        SketchPlan sketchPlan3 = new ConstructionPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5", 50);
        System.out.println(sketchPlan3.getTitle());
        System.out.println(sketchPlan3.getPagesOfDocumentation());

        Header header1 = new PermitPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5");
        System.out.println(header1.getNameOfClient());
        System.out.println(header1.getAddressOfBuilding());

        Header header2 = new ConstructionPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5", 50);
        System.out.println(header2.getNameOfClient());
        System.out.println(header2.getAddressOfBuilding());

        PermitPlan permitPlan1 = new PermitPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5");
        System.out.println(permitPlan1.getTitle());
        System.out.println(permitPlan1.getHeader());
        System.out.println(permitPlan1.getPagesOfDocumentation());
        System.out.println(permitPlan1.getNameOfClient());
        System.out.println(permitPlan1.getAddressOfBuilding());

        PermitPlan permitPlan2 = new ConstructionPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5", 50);
        System.out.println(permitPlan2.getTitle());
        System.out.println(permitPlan2.getHeader());
        System.out.println(permitPlan2.getPagesOfDocumentation());
        System.out.println(permitPlan2.getNameOfClient());
        System.out.println(permitPlan2.getAddressOfBuilding());

        ConstructionPlan constructionPlan = new ConstructionPlan(222, "Nyaraló", "John Doe", "Siófok Part u 5", 50);
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());



    }
}
