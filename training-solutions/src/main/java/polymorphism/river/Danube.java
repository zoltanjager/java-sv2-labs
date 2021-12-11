package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals;

    public static void main(String[] args) {
        List<String> capitals = Arrays.asList("Bécs" , "Budapest", " Belgrád");
        Water water = new Danube("Duna", 3000, capitals);

        River river = new Danube("Duna", 3000, capitals);

        Danube danube = new Danube("Duna", 3000, capitals);
        System.out.println(river.getLength());
        System.out.println(river.getName());
        System.out.println(danube.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getCapitals());

    }


    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }


}
