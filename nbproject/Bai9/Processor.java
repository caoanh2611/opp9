package Bai9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList rl = new RoomList();
        System.out.println("Menu Function !");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1.Them Room new(meeting room of bedroom) !");
            System.out.println("2.Update Room by id !");
            System.out.println("3.Delete Room by id");
            System.out.println("4.Find Room by id");
            System.out.println("5.Display all Rooms");
            System.out.println("6.Find the most expensive Room");
            System.out.println("7.Count the total number of meeting room and bedroom separately in the  RoomList. !");
            System.out.println("8.Exit.... !");
            System.out.print("Choise Function : ");
            int ft = s.nextInt();
            s.nextLine();
            switch (ft) {
                case 1:
                    rl.inputAndAddRooms();
                    break;
                case 2:
                    System.out.print("Enter room id to update : ");
                    String id = s.nextLine();
                    if (rl.updateRoomById(id)) {
                        System.out.println("Room update successfully !");
                    } else {
                        System.out.println("Room not found !");
                    }
                    break;
                case 3 :
                    System.out.print("Enter room id to delete : ");
                     String id1 = s.nextLine();
                    if (rl.deleteRoomById(id1)) {
                        System.out.println("Room deleted successfully.");
                    } else {
                        System.out.println("Room not found.");
                    }
            
            break;
                case 4:
             
                    System.out.print("Enter Room ID to find : ");
                    String findid = s.nextLine();
                    Room found = rl.FindIdRoom(findid);
                    if(found != null){
                        rl.displayAllRooms();
                    }else{
                        System.out.println("Not find room !");
                    }
                    break;
                     case 5:
                       rl.displayAllRooms();
                    break;
                     case 6:
                    Room mostExpensiveRoom = rl.findMostExpensiveRoom();
                    if(mostExpensiveRoom != null){
                        
                     System.out.println("Most expensive Room:");
                        mostExpensiveRoom.displayDetails();
                    } else {
                        System.out.println("No rooms available.");
                    }
                    break;
                     case 7:
                     rl.countRooms();
                    break;
                     case 8:
                         System.out.println("Exit propgram!");
                         s.close();
                         return ;
                   
                default:
                    System.out.println("vui long nhap lai !");
            }
        }
    }
}

