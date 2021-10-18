package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        int hour;
        int minute;
        int second;

        Scanner scanner = new Scanner(System.in);
        System.out.println("First time:");
        System.out.println("Hour:");
        hour = scanner.nextInt();
        System.out.println("Minute:");
        minute = scanner.nextInt();
        System.out.println("Second:");
        second = scanner.nextInt();

        Time firstTime = new Time (hour, minute, second);

        System.out.println("Second time:");
        System.out.println("Hour:");
        hour = scanner.nextInt();
        System.out.println("Minute:");
        minute = scanner.nextInt();
        System.out.println("Second:");
        second = scanner.nextInt();

        Time secondTime = new Time(hour, minute, second);

        System.out.println("First time: " + firstTime.toString() + " = " + firstTime.getInMinutes() + " minutes" );
        System.out.println("Second time: " + secondTime.toString() + " = " + secondTime.getInSeconds() + " seconds");
        System.out.println("First time is earlier then second: " + firstTime.earlierThan(secondTime));

    }
}
