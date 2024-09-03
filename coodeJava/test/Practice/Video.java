/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */
public class Video extends Item{
    public Video(String name, String artist, double playTime){
        super(name,artist,playTime);
        this.totalPlayTime=playTime;
    }
    public String toString(){
        String result="Video: "+super.toString()+"\nDirector: "+this.artist;
        return result;
    }
}
