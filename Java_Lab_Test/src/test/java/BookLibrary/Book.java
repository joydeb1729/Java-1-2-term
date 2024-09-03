/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookLibrary;

/**
 *
 * @author Durjay
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    
    Book(String title, String author, String isbn){
        
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.isbn;
    }
    
    
}
