
package luyenoppdenkhithi;


import java.util.*;
public class ReferenceBook extends Book{

private String tax ;

    public ReferenceBook() {
    }

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity ,String tax) {
        super(bookId , publisher , entryDate , unitPrice,quantity );
        this.tax = tax;
    }
   
    @Override
    public void addBook() {
    Scanner s = new Scanner(System.in);
        super.eninformation();
        System.out.print("Enter Tax : ");
        this.tax = s.nextLine();
    }

    @Override
    public void updateBook(String id) {
        Scanner s = new Scanner(System.in);
        System.out.println("Updating Book with Id : " + id);
        System.out.println("Book New !");
        super.updata();
        System.out.print("Enter Tax New : ");
        this.tax = s.nextLine();
        
    }
    @Override
    public void displayBook() {
       super.display();
        System.out.println("Tax: "+tax);
    }
  
}

