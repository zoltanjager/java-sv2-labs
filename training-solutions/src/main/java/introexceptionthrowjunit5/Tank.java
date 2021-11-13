package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        if (angle < -80 || angle > 80){
            throw new IllegalArgumentException("Elérted a maximális fordulási értéket!");
        }
    }

    public int getAngle() {
        return angle;
    }
}
