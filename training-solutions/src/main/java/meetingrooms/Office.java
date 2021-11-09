package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public String printNames() {
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            sb.append(meetingRoom.getName());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printNamesReverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            sb.append(meetingRooms.get(i).getName());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printEvenNames() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < meetingRooms.size(); i = i + 2) {
            sb.append(meetingRooms.get(i).getName());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printAreas() {
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            sb.append(getMeetingRoomDatas(meetingRoom));
        }
        return sb.toString();
    }

    public String printMeetingRoomsWithName(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().equalsIgnoreCase(name)) {
                sb.append(getMeetingRoomDatas(meetingRooms.get(i)));
            }
        }
        return sb.toString();
    }

    public String printMeetingRoomsContains(String part) {
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())){
                sb.append(getMeetingRoomDatas(meetingRoom));
            }
        }
        return sb.toString();
    }

    public String printAreasLargerThan(int area) {
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getArea() >= area) {
                sb.append(getMeetingRoomDatas(meetingRoom));
            }
        }
        return sb.toString();
    }

    private String getMeetingRoomDatas(MeetingRoom meetingRoom) {
        StringBuilder sb = new StringBuilder();
        sb.append(meetingRoom.getName() + " - ");
        sb.append(meetingRoom.getWidth() + " - ");
        sb.append(meetingRoom.getLength() + " - ");
        sb.append(meetingRoom.getArea());
        sb.append("\n");
        return sb.toString();
    }
}
