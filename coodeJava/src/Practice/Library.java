/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */
import java.util.*;

public class Library {
    public static void main(String[] args) {
        Book book1=new Book("Dead Man", "Durjay","1234567891");
        Book book2=new Book("Alive Man", "Joydeb","9876543219");
        Book book3=new Book("Confused Man", "Durjay", "6572845918");
        
        ArrayList<Book> bookCollection = Book.getBookCollection();
                
        //System.out.println(book1);
        
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);
        System.out.println("After Adding all Books: ");
        for(Book it:bookCollection){
            System.out.println(it);
        }
        
        Book.removeBook(book2);
        Book.removeBook(book3);
        System.out.println("\nAfter Removing 2nd and 3rd Books: ");
        for(Book it:bookCollection){
            System.out.println(it);
        }
        
    }
}
