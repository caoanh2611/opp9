package luyenoppdenkhithi;

import java.util.*;
import java.lang.*;

public class BookList {
    
    private ArrayList<Book> list;
    Scanner s = new Scanner(System.in);
    
    public BookList() {
        this.list = new ArrayList<>();
    }
    
    public BookList(ArrayList<Book> list) {
        this.list = list;
    }
    
    public void addBook() {
        System.out.println("List Book !");
        System.out.print("Enter number Book information : ");
        int n = s.nextInt();
            s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Book number " + (i + 1) + " : ");
            System.out.print("Book Type (1.TextBook / 2.ReferenceBook ): ");
            int Typebook = s.nextInt();
            if (Typebook == 1) {
                TextBook Tb = new TextBook();
                Tb.addBook();
                list.add(Tb);
            } else if (Typebook == 2) {
                ReferenceBook Rb = new ReferenceBook();
                Rb.addBook();
                list.add(Rb);
            } else {
                System.out.println("Khong tim thay muc sach can nhap ! ");
            }
        }
    }
    public void  displayAllBook(){
          System.out.println();
        for(Book book :list){
            book.displayBook();
            System.out.println();
             
        }
    }

//public void updateBook(String id) {
//        boolean found = false;
//        for (Book book : list) {
//            if (book.getBookId().equalsIgnoreCase(id)) {
//                System.out.println("Updating Book with ID: " + id);
//                book.updateBook(id);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Book with ID " + id + " not found!");
//        }
//    }
    public void updateBook(String id) {
        Book book = findBookById(id);
        if (book != null) {
            System.out.println("Updating book with ID: " + id);
             book.updateBook(id);
        } else {
            System.out.println("Book with ID " + id + " not found!");
        }
    }

 public Book findBookById(String id){
     for(Book book : list){
         if(book.getBookId().equals(id))
         return book ;  
     }
        return null;
     
 }
 public void deleteBookById(String id){
     Book book = findBookById(id);
     if(book != null){
         list.remove(book);
         System.out.println("Delete a book Sussec !");
     }else{
         System.out.println("Khong xoa thanh cong  !");
     }
 }
}