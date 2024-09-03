/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Practice_Database;

/**
 *
 * @author Durjay
 */
public class Video extends Item{
    private String director;
    
    public Video (String name, String director, double playingTime){
        super(name,playingTime);
        this.director=director;
        this.totalPlayTime=playingTime;
    }
   
    public String toString(){
        String result= "Video: " + this.name +" (" + playingTime +") ";
        result+="\nDirector: "+this.director+ "\n";
        return result;
    }
}
