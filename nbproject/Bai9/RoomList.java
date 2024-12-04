package Bai9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class RoomList {

    ArrayList<Room> list;
    Scanner s = new Scanner(System.in);

    public RoomList() {
        this.list = new ArrayList<>();
    }

    public RoomList(ArrayList<Room> list) {
        this.list = list;
    }

    public void addRoom(Room room) {
        list.add(room);
    }

    public void inputAndAddRooms() {
        System.out.println("Danh sach Phong !");
        System.out.print("Entet Number Room : ");
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Room number " + (i + 1) + " : ");
            System.out.println("Type Room (1.MeetingRoom / 2.BedRoom) : ");
            int TypeRoom = s.nextInt();
            if (TypeRoom == 1) {
                MeetingRoom mr = new MeetingRoom();
                mr.enInformation();
                addRoom(mr);
            } else if (TypeRoom == 2) {
                BedRoom br = new BedRoom();
                br.enInformation();
                addRoom(br);
            } else {
                System.out.println("Not find Room !");
            }
        }

    }

    public void displayAllRooms() {
        System.out.println("List Room !");
        for (Room room : list) {
            System.out.println();
            room.displayDetails();
        }

    }

    public Room FindIdRoom(String id) {
        for (Room room : list) {
            if (room.getId().equals(id)) {
                return room;
            }
        }
        return null;

    }

    public boolean updateRoomById(String id) {
        Room s = FindIdRoom(id);
        if (s != null) {
            System.out.println("Update information Room : ");
            s.enInformation();
            return true;
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        Room s = FindIdRoom(id);
        if (s != null) {
            list.remove(s);
            return true;
        }
        return false;
    }

    public Room findMostExpensiveRoom() {
//        if (list == null || list.isEmpty()) {
//            return null;
//        }
        Room mostExpensiveRoom = list.get(0);
        for (Room room : list) {
            if (Double.compare(room.calculateCost(), mostExpensiveRoom.calculateCost()) > 0) {
                mostExpensiveRoom = room;
            }

        }
        return null;

    }
    public void countRooms(){
        int count = 0 ;
        for(Room room  : list){
            count ++ ;
        }
        System.out.println("Number Room:" +count);
    }
}
