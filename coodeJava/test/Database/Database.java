/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Database {
    ArrayList<CD>cdList=new ArrayList<>();
    ArrayList<Video>videoList=new ArrayList<>();
    public void addCD(CD c){
        cdList.add(c);
    }
    public void addVideo(Video v){
        videoList.add(v);
    }
    public void list(){
        for(CD c:cdList){
            System.out.println(c);
        }
        for(Video v:videoList){
            System.out.println(v);
        }
    }
    
    //By using polymorphism
    ArrayList<Item>allItem=new ArrayList<>();
    public void addItem(Item newItem){
        allItem.add(newItem);
    }
    public void itemList(){
        for(Item i:allItem){
            System.out.println(i);
        }
    }
}
