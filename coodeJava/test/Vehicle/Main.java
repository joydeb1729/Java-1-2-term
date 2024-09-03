package Vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args){
        Vehicle v=new Vehicle("My Vehicles", 100);
        Car supra= new Car("Supra", 101);
        Car toyto = new Car("Toyto", 102);
        Car honda = new Car("Honda", 103);
        
        ArrayList<Car>mycars=new ArrayList<Car>();
        
        v.addCar(supra);
        v.addCar(toyto);
        v.addCar(honda);
        
        v.removeCar(honda);
        mycars=v.getCarList();
        
        for(Car c:mycars){
            System.out.println(c.getName());
        }
        
    }
}
