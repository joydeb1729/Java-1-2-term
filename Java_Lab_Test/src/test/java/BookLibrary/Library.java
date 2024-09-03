/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookLibrary;

import java.util.*;


/**
 *
 * @author Durjay
 */
public class Library {
    
    private ArrayList<Book> list= new ArrayList<Book>();
    
    public void addBook(Book b){
        list.add(b);
    }
    public void removeBook(Book b){
        list.remove(b);
    }
    
    public boolean compareBytitle(Book b){
        for(Book book: list){
            if(book.getTitle().equals(b.getTitle())){
                return true;
            }
        }
        return false;
    }
 
    public boolean compareByAuthor(Book b){
        for(Book book: list){
            if(book.getAuthor().equals(b.getAuthor())){
                return true;
            }
        }
        return false;
    }
    
    public boolean compareByIsbn(Book b){
        for(Book book: list){
            if(book.getIsbn().equals(b.getIsbn())){
                return true;
            }
        }
        return false;
    }
    
}
