package cmdarguments.flowers;

public class CmdMain {
    public static void main(String[] args) {
        int serialNumber = 1;
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(serialNumber + ". elem: " + args[i] );
            serialNumber++;
        }
    }
}
