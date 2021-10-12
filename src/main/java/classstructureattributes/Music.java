package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite band?");
        song.band = scanner.nextLine();
        System.out.println("What is the title of the song?");
        song.title= scanner.nextLine();
        System.out.println("How long is the song?(min)");
        song.length= scanner.nextInt();

        System.out.println("Your favorite track:");
        System.out.print(song.band + " - " + song.title + " - " + song.length);

    }
}
