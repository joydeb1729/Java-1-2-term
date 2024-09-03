/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestSchool;

/**
 *
 * @author Durjay
 */
public class Teacher {
    private String name;
    private String subName;
    
    public Teacher(String name, String subName){
        this.name=name;
        this.subName=subName;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSubName(String name){
        this.name=name;
    }
    public String getSubName(){
        return subName;
    }
}
