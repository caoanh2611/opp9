
package Bai9;
import java.util.Scanner;
public class MeetingRoom extends Room{
private int capacity ;

    public MeetingRoom() {
    }

    public MeetingRoom(String id, String name, int baseCost) {
        super(id, name, baseCost);
           this.capacity = capacity;
    }
@Override
      public void enInformation(){
            super.enInformation();
            Scanner s = new Scanner(System.in);
            System.out.print("capacity: ");
            this.capacity= s.nextInt();
         }
    @Override
    public double calculateCost() {
       if(capacity > 50){
        return this.getBaseCost() * 1.2 ;
       }
    return this.getBaseCost();
    }
@Override
public void displayDetails(){
    super.displayDetails();
    System.out.println("capacity : "+ capacity);
}
}
