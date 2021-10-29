package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int NumberOfNewDirections = 2;

        for (int i = 30; i <360 ; i+=10) {
            NumberOfNewDirections++;
        }
        return NumberOfNewDirections;
    }
}
