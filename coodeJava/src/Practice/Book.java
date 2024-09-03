/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.*;

/**
 *
 * @author Durjay
 */
   class Book {
    private String title;
    private String author;
    private String ISBN;
    
    private static ArrayList <Book> bookCollection = new ArrayList <Book>();
    
    Book(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    
    public void setTitle(String tile){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    
    public static void addBook(Book book) {
        bookCollection.add(book);
    }
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }
    public static ArrayList<Book> getBookCollection(){
        return bookCollection;
    }
    
    public String toString() {
        return "Book Name: " +title+"\n" + "Author Name: "+ author + "\n" + "ISBN: "+ISBN + "\n";
    }
}
