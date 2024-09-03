/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayMusic;

/**
 *
 * @author Durjay
 */
public class Song {
    private String title;
    private String artist;
    
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String toString(){
        return "Playing " + title + " by " + artist + "\n";
    }
}
