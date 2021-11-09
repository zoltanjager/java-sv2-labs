package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    Office office = new Office();

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    public void runMenu() {
        int input = 0;
        System.out.println(printMenu());
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt() && (input != 9)) {
            System.out.println(printMenu());
            scanner.nextLine();
        }
        input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                readOffice();
                runMenu();
                break;
            case 2:
                System.out.println(office.printNames());
                runMenu();
                break;
            case 3:
                System.out.println(office.printNamesReverse());
                runMenu();
                break;
            case 4:
                System.out.println(office.printEvenNames());
                runMenu();
                break;
            case 5:
                System.out.println(office.printAreas());
                runMenu();
                break;
            case 6:
                System.out.println("Adja meg a tárgyaló nevét:");
                System.out.println(office.printMeetingRoomsWithName(scanner.nextLine()));
                runMenu();
                break;
            case 7:
                System.out.println("Adjon meg pár karaktert a tárgyaló nevéből:");
                System.out.println(office.printMeetingRoomsContains(scanner.nextLine()));
                runMenu();
                break;
            case 8:
                System.out.println("Adja meg a keresett tárgyaló minimális méretét:");
                System.out.println(office.printAreasLargerThan(scanner.nextInt()));
                scanner.nextLine();
                runMenu();
                break;
            case 9:
                break;
            default:
                runMenu();
        }
    }

    public String printMenu() {
        String mainMenu = """
                
                Tárgyaló nyilvántartás
                 
                1. Tárgyaló rögzítése
                2. Tárgyalók sorrendben
                3. Tárgyalók visszafele sorrendben
                4. Minden második tárgyaló
                5. Területek
                6. Keresés pontos név alapján
                7. Keresés névtöredék alapján
                8. Keresés terület alapján
                9. Kilépés
                
                Válasszon egy menüpontot!
                """;
        return mainMenu;
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a tárgyaló nevét:");
        String name = scanner.nextLine();
        System.out.println("Adja meg a tárgyaló hosszát:");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a tárgyaló szélességét:");
        int width = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }
}
