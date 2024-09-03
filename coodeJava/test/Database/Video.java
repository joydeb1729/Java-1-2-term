/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Durjay
 */
public class Video extends Item{
    private int playTime;
    public Video(String songName, String director, int playTime){
        super(songName,director);
        this.playTime=playTime;
    }
    
    public String toString(){
        String result="Video: \n" + super.toString();
        result+="\nPlay Time: "+playTime+"\n--------------\n";
        return result;
    }
}
