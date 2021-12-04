package abstractclass.exercise;

public class Subtracter extends MathExercise{

    @Override
    public int getSolution(int a, int b) {
        return Math.abs(a - b);
    }
}
