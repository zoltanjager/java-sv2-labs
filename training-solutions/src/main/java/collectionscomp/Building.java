package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private Integer levels;

    public Building(String address, int area, Integer levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building o) {
        return levels.compareTo(o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels.equals(building.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();

        buildings.add(new Building("Fő utca 2", 150, 2));
        buildings.add(new Building("Fő utca 1", 50, 1));
        buildings.add(new Building("Fő utca 4", 250, 4));

        System.out.println(buildings);

    }
}
