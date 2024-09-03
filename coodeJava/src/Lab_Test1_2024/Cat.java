/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test1_2024;

/**
 *
 * @author Jaydeb Gan Prokas 230234
 */
    class Cat {
    private String name;
    
    Cat(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void Catch(Mouse Jerry){
        System.out.println(name+" cought "+Jerry.getName()+".");
    }
    public String toString(){
        return "There is a cat named " + name + ".";
    }
    
}
    
