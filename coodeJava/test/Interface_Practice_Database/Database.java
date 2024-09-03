/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Practice_Database;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Database {
    private ArrayList<Item> list;
    
    public Database()
    {
        list=new ArrayList<>();
    }
    public void addItem(Item i)
    {
        list.add(i);
    }
    public void removeItem(Item i){
        list.remove(i);
    }
    
    public void Sort(){
        Collections.sort(list);
    }
    
    public String toString(){
        String result="";
        for(Item i:list){
            result+= i.toString();
            result+="\n";
        }
        return result;
    }
}