/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Durjay
 */
public class CD extends Item {
    private int totalSong;
    private int playTime;
    public CD(String songName, String director, int totalSong, int playTime){
        super(songName,director);
        this.totalSong=totalSong;
        this.playTime=playTime;
    }
    
    public String toString(){
        String result="CD: \n" +super.toString();
        result+="\nTotal Songs: "+totalSong+"\nPlay Time: "+playTime+"\n-------------------\n";
        return result;
    }
}
