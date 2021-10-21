package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;
        System.out.println(message);

        boolean b = "Hello John Doe".equals(message);
        System.out.println(b);

        boolean c = "Hello John Doe444".equals(message);
        System.out.println(c);

        String s1 = "";
        String s2 = "";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s3.length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0,1) + "," + "Abcde".substring(2,3));
        System.out.println("Abcde".substring(0,3));
    }
}
