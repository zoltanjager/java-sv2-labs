package abstractclass.gamecharacter;

public class Point {
    final private long x;
    final private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point anotherPoint) {
        return (long) Math.sqrt(  Math.pow(anotherPoint.getX() - getX(),2) +
                                  Math.pow(anotherPoint.getY() - getY(),2));
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }


}
