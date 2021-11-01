package formatlocaleprintf;

public class RunMain {
    public static void main(String[] args) {
        Run run = new Run("Kiss Béla");
        run.addRun(12.4);
        System.out.println(run.printFormattedRunText());
        run.addRun(10.4);
        System.out.println(run.printFormattedRunText());
    }
}
