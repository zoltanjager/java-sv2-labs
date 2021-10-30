package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Kovács", "P",
                "József", Title.MR).concatNameHungarianStyle());

        System.out.println(new Name("Doe", null,
                "Jane", Title.MS).concatNameWesternStyle());

    }
}
