
package luyenoppdenkhithi;
import java.util.*;
public class TextBook extends Book{

private String status ;

    public TextBook() {
    }

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity ,String status) {
        super(bookId , publisher , entryDate , unitPrice,quantity );
        this.status = status;
    }
   
    @Override
    public void addBook() {
    Scanner s = new Scanner(System.in);
        super.eninformation();
        System.out.print("Enter Status : ");
        this.status = s.nextLine();
    }

    @Override
    public void updateBook(String id) {
        Scanner s = new Scanner(System.in);
        System.out.println("Updating Book with Id : " + id);
        System.out.println("Book New !");
        super.updata();
        System.out.print("Enter Status(New/Old) : ");
        this.status = s.nextLine();
    }
    @Override
    public void displayBook() {
       super.display();
        System.out.println("Status: "+status);
    }
    
}
