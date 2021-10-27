package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer(new Cpu("i7",2000));

        personalComputer.addHardware(new Hardware("Mainboard", "Asus"));
        personalComputer.addHardware(new Hardware("SSD", "Kingston"));

        personalComputer.addSoftware(new Software("Windows", 10));
        personalComputer.addSoftware(new Software("Excel", 15));

        System.out.println(personalComputer.toString());

    }
}
