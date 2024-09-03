/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Durjay
 */
public class Item {
    protected String songName;
    protected String director;
    public Item(String songName, String director){
        this.songName=songName;
        this.director=director;
    }
    
    
    public String toString(){
        return "Song Name: "+songName+"\nDirector: "+director;
    }
}
