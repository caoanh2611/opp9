package luyenoppdenkhithi;

import java.util.*;
import java.lang.*;

public class Processor {

    public static void main(String[] args) {
        BookList bl = new BookList();
        String id = null;
        System.out.println("Menu function Book !");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1.Them cuon sach !");
            System.out.println("2.Update book by id !");
            System.out.println("3.Delete book by id!");
            System.out.println("4.Find book by id !");
            System.out.println("5.Display all books");
            System.out.println("6.Exit...!");
            System.out.print("Choise Function : ");
            int choise = s.nextInt();
            s.nextLine();
            switch (choise) {
                case 1:
                    bl.addBook();
                    break;
                case 2:
                    System.out.println("Enter book ID to update: ");
                    id = s.nextLine();
                    bl.updateBook(id);
                    break;
                case 3:
                    System.out.print("Nhap id cuon sach can xoa: ");
                    id = s.nextLine();
                    bl.deleteBookById(id);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Nhap id sach can tim : ");
                    id = s.nextLine();
                    Book findBook = bl.findBookById(id);
                    if (findBook != null) {
                        System.out.println("Tim thay cuon sach co co :" + id);
                        findBook.displayBook();
                    } else {
                        System.out.println("Sach voi id " + id + " khong tim thấy");
                    }
                    break;
                case 5:
                    bl.displayAllBook();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh !");
                    break;
                default:
                    System.out.println("Khong tim thay chuc nang nay !");
                    break;
            }
        }
    }
}
