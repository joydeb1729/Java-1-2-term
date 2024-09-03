/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Durjay
 */

public class MyException extends Exception {
    

    public MyException(String name) throws Exception{
        if(name.equals("Nigga")){
            throw new Exception("Shut up racist and put a proper name!");
        }  
        else{
            System.out.println("everything is okay with the Name!");
        }
    }
    public MyException(int id) throws Exception{
        if(id==0){
          throw new Exception("Id cant be zero!");  
        }
        else{
            System.out.println("everything is okay with the ID!");
        }
    }
    
}
