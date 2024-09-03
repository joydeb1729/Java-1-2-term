/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Practice_Database;

/**
 *
 * @author Durjay
 */
public class Item implements Comparable<Item>{
    protected String name;
    protected double playingTime;
    protected double totalPlayTime;
    
    public Item(String name, double playingTime){
        this.name=name;
        this.playingTime=playingTime;
    }
    
    @Override
    public int compareTo(Item i){
        if(this.totalPlayTime>i.totalPlayTime)
         return 1;
        else if(this.totalPlayTime<i.totalPlayTime)
            return -1;
        else
            return this.name.compareTo(i.name);
    }
    
    
}
