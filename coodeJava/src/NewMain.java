/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Test1_2024;

/**
 *
 * @author CSE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat tom = new Cat("Donald Trump");
        Mouse jerry = new Mouse("Biden");
        System.out.println(tom);
        System.out.println(jerry);
        tom.Catch(jerry);
    }
    
}
