package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate("For Sale!!!ASAP", 2000,
                new Details("Big house, 4 bathroom",
                new Address("Budapest","Váci",10,"1138"),
                200, 5000));

        System.out.println(realEstate);


    }
}
