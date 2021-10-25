package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person;
        Person person2;

        person  = new Person("John Doe", 33);
        person2 = person;

        person2.setName("Jack Doe");

        System.out.println(person.getName());
        System.out.println(person2.getName());

        int x;
        int y;

        x=24;
        y=x;
        y++;
        System.out.println(x);
        System.out.println(y);

        person =new Person("Jane Doe", 23);
        System.out.println(person.getName());


    }
}
