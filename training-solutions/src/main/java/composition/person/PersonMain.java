package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "AB1234");

        person.moveTo(new Address("Hungary", "Budapest", "Bartok 10", "1119"));

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jack Doe", "CB4321");

        person.getAddress().correctData("Hungary", "Pécs", "Fő utca 10", "7600");

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());


    }
}
