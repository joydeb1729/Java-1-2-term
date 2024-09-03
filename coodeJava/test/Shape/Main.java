/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Durjay
 */
public class Main {
  public static void main(String[] args) {
    // create some shapes
    Shape rectangle = new Rectangle(10, 12);
    Shape circle = new Circle(5);
    Shape triangle = new Triangle(7, 8, 6);

    // calculate area and perimeter of each shape
    System.out.println("\nArea and perimeter of various shapes:");
    System.out.println("\nRectangle: Length: 10, Width: 12");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());

    System.out.println("\nCircle: Radius: 5");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());

    System.out.println("\nTriangle: Side1: 7, Side2: 8, Side3: 6");
    System.out.println("Area: " + triangle.getArea());
    System.out.println("Perimeter: " + triangle.getPerimeter());
  }
}
