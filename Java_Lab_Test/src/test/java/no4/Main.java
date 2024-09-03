/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args) {
        A a1 = new A(); 
        A a2 = new A(); 
        B b = new B(); 
        a1.m1(); 
        a1 = b; 
        a1.m1(); 
        a1 = a2; 
        a1.m1(); 
    }
}

class A { 
    void m1() {
        System.out.println("A");
    }
}

class B extends A { 
    void m1() {
        System.out.println("B");
    }
}
