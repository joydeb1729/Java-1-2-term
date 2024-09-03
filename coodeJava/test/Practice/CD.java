/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */
public class CD extends Item{
    private int totalSong;
    public CD(String name, String artist,int totalSong, double playTime){
        super(name,artist,playTime);
        this.totalSong=totalSong;
        this.totalPlayTime=playTime*totalSong;
    }
    public String toString(){
        String result="CD: "+super.toString()+"\nArtist: "+this.artist+"\nNumber of tracks: "+totalSong;
        return result;
    }
}
