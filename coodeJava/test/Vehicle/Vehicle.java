/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Vehicle {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private ArrayList<Cycle> cycles = new ArrayList<Cycle>();
    protected String name;
    protected int model;
    public Vehicle(String name, int model){
        this.name=name;
        this.model=model;
    }
    public void addCar(Car newCar){
        cars.add(newCar);
    }
    public void removeCar(Car oldCar){
        cars.remove(oldCar);
    }
    public ArrayList<Car> getCarList(){
        return cars;
    }
    public String toString(){
        return name;
    }
}
