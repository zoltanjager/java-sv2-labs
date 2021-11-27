package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("A Név nem lehet üres!");
        }
        this.name = name;
        this.position = new Position(0,0);
    }

    public Position getPosition (){
       return position;
    }

    public void changePosition(Position target){
        if (target == null) {
            throw new IllegalArgumentException("A pozició nem lehet üres!");
        }
        this.position = target;
    }

    public double distanceFrom(Position target) {
        return this.position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty(String name) {
        return name == null || name.isEmpty();
    }
}
