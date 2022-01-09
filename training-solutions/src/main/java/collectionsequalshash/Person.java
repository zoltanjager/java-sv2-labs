package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String numberTAJ;

    public Person(String name, int age, String numberTAJ) {
        this.name = name;
        this.age = age;
        this.numberTAJ = numberTAJ;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumberTAJ() {
        return numberTAJ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberTAJ);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ( obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(this.numberTAJ , person.numberTAJ);
    }

    public static void main(String[] args) {
        Person person = new Person("Kiss József", 45, "111111110");
        Person anotherPerson = new Person("Nagy Béla", 32, "111111110");

        System.out.println(person.equals(anotherPerson));
        System.out.println(anotherPerson.equals(person));

        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }

}
