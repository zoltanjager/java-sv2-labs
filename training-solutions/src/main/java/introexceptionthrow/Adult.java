package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
        if (age < 17 ) {
            throw new IllegalArgumentException("Csak 18 év felett!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
