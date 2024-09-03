/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */
public class Item implements Comparable<Item> {
    
    protected String name;
    protected String artist;
    protected double playTime;
    protected double totalPlayTime=0;
    
    public Item(String name, String artist, double playTime){
        this.name=name;
        this.artist=artist;
        this.playTime=playTime;
    }
    
    public int compareTo(Item i){
        if(this.totalPlayTime<i.totalPlayTime)
            return -1;
        else if(this.totalPlayTime>i.totalPlayTime)
            return 1;
        else
            return 0;      
    }
    
    public String toString(){
        return this.name+" ("+playTime+")";
    }
}
