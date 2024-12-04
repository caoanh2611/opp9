
package Bai9;
import java.util.Scanner;
public class BedRoom extends Room{
private int numberOfBeds ;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

   
@Override
      public void enInformation(){
            super.enInformation();
            Scanner s = new Scanner(System.in);
            System.out.print("NumberOfBeds: ");
            this.numberOfBeds= s.nextInt();
         }
    @Override
    public double calculateCost() {
       if(numberOfBeds >= 3){
        return this.getBaseCost() * 1.1 ;
       }
    return this.getBaseCost();
    }
@Override
public void displayDetails(){
    super.displayDetails();
    System.out.println("NumberOfBeds : "+ numberOfBeds);
}
}
