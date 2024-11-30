package luyenoppdenkhithi;

import java.util.*;
import java.text.*;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    Scanner s = new Scanner(System.in);

    public String getBookId() {
        return bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public abstract void addBook();

    @Override
    public abstract void updateBook(String id);

    @Override
    public abstract void displayBook();

    public void eninformation() {

        System.out.print("Enter ID Book: ");
        this.bookId = s.nextLine();

        System.out.print("Enter Publisher :  ");
        this.publisher = s.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter Date(dd/MM/yyyy):");
            String entryDatedf = s.nextLine();
            try {
                this.entryDate = df.parse(entryDatedf);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date. Please enter again.");

            }
        }

        System.out.print("Enter unitPrice : ");
        this.unitPrice = s.nextDouble();
        s.nextLine();
        System.out.print("Enter quantity : ");
        this.quantity = s.nextDouble();
        s.nextLine();
    }

    public void display() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID Book  : " + bookId);
        System.out.println("Publiher :" + publisher);
        System.out.println("Entry Date: " + df.format(entryDate));
        System.out.println("UntiPrice  : " + unitPrice);
        System.out.println("Quantity : " + quantity);
    }

    public void updata() {

        System.out.print("Enter Publisher :  ");
        this.publisher = s.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter Date(dd/MM/yyyy):");
            String entryDatedf = s.nextLine();
            try {
                this.entryDate = df.parse(entryDatedf);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date. Please enter again.");

            }
        }

        System.out.print("Enter unitPrice : ");
        this.unitPrice = s.nextDouble();
        s.nextLine();
        System.out.print("Enter quantity : ");
        this.quantity = s.nextDouble();
        s.nextLine();
    }
}
