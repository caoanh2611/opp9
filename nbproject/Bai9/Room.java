
package Bai9;

import java.util.Scanner;
public abstract class Room implements IRoom {
    private String id ;
    private  String name ; 
    private double baseCost; 

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }
    
    @Override
    public abstract double calculateCost();
    
    public void enInformation(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id: ");
        this.id =  s.nextLine();
        
        System.out.print("Enter Name : ");
        this.name= s.nextLine();
        
        System.out.print("Enter Base Cost: ");
        this.baseCost= s.nextDouble();
    }
    @Override
    public void displayDetails(){
        System.out.println("Id Room: "+id);
        System.out.println("Name Room :  "+name);
        System.out.println("BaseCost Room: "+baseCost);
    }

   
    }