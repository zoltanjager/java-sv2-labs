package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("Red");
        capsules.addFirst("Blue");
        capsules.addFirst("Green");
        capsules.addFirst("Pink");
        capsules.addLast("Yellow");

        System.out.println(capsules.getColors().toString());

        capsules.removeFirst();

        System.out.println(capsules.getColors().toString());

        capsules.removeLast();

        System.out.println(capsules.getColors().toString());
    }
}
