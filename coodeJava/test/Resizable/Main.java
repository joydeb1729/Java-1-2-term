/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resizable;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Original Circle Radius: " + circle.getRadius());
        circle.resize(1.5);
        System.out.println("Resized Circle Radius: " + circle.getRadius());

        System.out.println("\nOriginal Rectangle Length: " + rectangle.getLength() + ", Width: " + rectangle.getWidth());
        rectangle.resize(2);
        System.out.println("Resized Rectangle Length: " + rectangle.getLength() + ", Width: " + rectangle.getWidth());
    }
}
