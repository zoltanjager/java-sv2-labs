package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public String printNames() {
        String namesOfMeetingRooms;
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            sb.append(meetingRoom.getName());
            sb.append("\n");
        }
        return namesOfMeetingRooms = sb.toString();
    }

    public String printNamesReverse() {
        String namesOfMeetingRooms;
        StringBuilder sb = new StringBuilder();
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            sb.append(meetingRooms.get(i).getName());
            sb.append("\n");
        }
        return namesOfMeetingRooms = sb.toString();
    }

    public String printEvenNames() {
        String namesOfMeetingRooms;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < meetingRooms.size(); i = i + 2) {
            sb.append(meetingRooms.get(i).getName());
            sb.append("\n");
        }
        return namesOfMeetingRooms = sb.toString();
    }

    public String printAreas() {
        String allInfoAboutMeetingRooms;
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            sb.append(meetingRoom.getName() + " - ");
            sb.append(meetingRoom.getWidth() + " - ");
            sb.append(meetingRoom.getLength() + " - ");
            sb.append(meetingRoom.getArea());
            sb.append("\n");
        }
        return allInfoAboutMeetingRooms = sb.toString();
    }

    public String printMeetingRoomsWithName(String name){
        String infoAboutFoundMeetingRoom = null;

        for (int i = 0; i < meetingRooms.size(); i++) {
            int indexOfFoundMeetingRoom = meetingRooms.get(i).getName().indexOf(name);
            if (indexOfFoundMeetingRoom > -1) {
                infoAboutFoundMeetingRoom = meetingRooms.get(indexOfFoundMeetingRoom).getName() + " - ";
                infoAboutFoundMeetingRoom += meetingRooms.get(indexOfFoundMeetingRoom).getWidth() + " - ";
                infoAboutFoundMeetingRoom += meetingRooms.get(indexOfFoundMeetingRoom).getLength() + " - ";
                infoAboutFoundMeetingRoom += meetingRooms.get(indexOfFoundMeetingRoom).getArea();
            }
        }
        return infoAboutFoundMeetingRoom;
    }

    public String printMeetingRoomsContains(String part) {
        String infoAboutMeetingRooms;
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())){
                sb.append(meetingRoom.getName() + " - ");
                sb.append(meetingRoom.getWidth() + " - ");
                sb.append(meetingRoom.getLength() + " - ");
                sb.append(meetingRoom.getArea());
                sb.append("\n");
            }
        }
        return infoAboutMeetingRooms = sb.toString();
    }


}
