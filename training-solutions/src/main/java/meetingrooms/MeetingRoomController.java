package meetingrooms;

public class MeetingRoomController {
    public static void main(String[] args) {
        Office office = new Office();

        office.addMeetingRoom(new MeetingRoom("aaa",5,4));
        office.addMeetingRoom(new MeetingRoom("bbb",6,4));
        office.addMeetingRoom(new MeetingRoom("ccc",7,4));
        office.addMeetingRoom(new MeetingRoom("ddd",8,4));

        System.out.println(office.printNames());
        System.out.println(office.printNamesReverse());
        System.out.println(office.printEvenNames());
        System.out.println(office.printAreas());
        System.out.println(office.printMeetingRoomsWithName("aaa"));
        System.out.println(office.printMeetingRoomsContains("aa"));
        System.out.println(office.printMeetingRoomsContains("ca"));

    }
}
