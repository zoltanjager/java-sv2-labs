package javabeans;

public class Dog {
    private String name;
    private int age;
    private boolean pedigree;
    private float weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public float getWeight() {
        return weight;
    }
}
