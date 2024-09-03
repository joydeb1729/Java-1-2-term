/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparing;

import java.util.*;
/**
 *
 * @author Durjay
 */
public class Main {
    
    public static void main(String[] args){
        
        ArrayList<Pipe> list= new ArrayList<>();
        
        list.add(new Pipe(2,11));
        list.add(new Pipe(4,80));
        list.add(new Pipe(1, 78));
        list.add(new Pipe(5, 68));
        list.add(new Pipe(3, 79));
        
        
        Collections.sort(list);
        
        for(Pipe p:list){
            System.out.println(p);
        }
        
        
    }
}
