package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("A katona nem lehet üres!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (target == null) {
            throw new IllegalArgumentException("A pozició nem lehet üres!");
        }
        Trooper trooper = findTrooperByName(name);
        if (trooper != null) {
            moveTrooper(trooper, target);
        }
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("A pozició nem lehet üres!");
        }

        Trooper trooper = findClosestTrooper(target);
        if (trooper != null) {
            moveTrooper(trooper, target);
        }
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper actual : troopers) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
         Trooper closestTrooper = troopers.get(0);
        for (Trooper actual : troopers ) {
            if (actual.distanceFrom(target) < closestTrooper.distanceFrom(target)){
                closestTrooper = actual;
            }
        }
        return closestTrooper;
    }

    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }
}
