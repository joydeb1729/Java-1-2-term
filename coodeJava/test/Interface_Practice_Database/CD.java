/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Practice_Database;

/**
 *
 * @author Durjay
 */
public class CD extends Item{
    
    private int totalSong;
    private String artist;
    
    public CD (String name, String artist, int totalSong, double playingTime){
        super(name,playingTime);
        this.totalSong=totalSong;
        this.artist=artist;
        this.totalPlayTime=playingTime*totalSong;
    }
   
    public String toString(){
        String result= "CD: " + this.name +" (" +playingTime +") \n";
        result+="Artist: "+this.artist+ "\n";
        result+="Number of tracks: "+ this.totalSong+"\n";
        return result;
    }
}
