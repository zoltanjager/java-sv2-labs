package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introcontrol = new IntroControl();

        System.out.println(introcontrol.subtractTenIfGreaterThanTen(345));

        System.out.println(introcontrol.describeNumber(5));

        System.out.println(introcontrol.greetingToJoe("Joe"));

        System.out.println(introcontrol.calculateBonus(3456660));

        System.out.println(introcontrol.calculateConsumption(5000,1600));

        introcontrol.printNumbers(5);
        introcontrol.printNumbersBetween(6,12);
        System.out.println("?");
        introcontrol.printNumbersBetweenAnyDirection(3,5);

        introcontrol.printOddNumbers(9);

    }

}
