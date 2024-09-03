/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaLabDay1;

/**
 *
 * @author Durjay
 */

 import java.util.*;

class Dice {
    private int maxSide;
    private int currentSide;

    public Dice(int maxValue) {
        maxSide = maxValue;
    }

    public Dice(int maxValue, int currentValue) {
        maxSide = maxValue;
        currentSide = currentValue;
    }

    public void setCurrentSide(int currentValue) {
        if (currentValue <= maxSide)
            currentSide = currentValue;
    }

    public int getMaxSide() {
        return maxSide;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public void roll() {
        currentSide = 1 + (int)(Math.random() * maxSide);
    }

    public String toString() {
        return "Maximum Side : " + maxSide + "\nCurrent Side : " + currentSide;
    }
}

public class Ludo {

    static Random rand = new Random();

    public static void main(String[] args) {
        
//        Dice d=new Dice(6, 2);
//        System.out.println(d);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the maximum size of the two Dice : ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        System.out.print("Please Enter How many times you want to throw two dices : ");
        int maxThrow = sc.nextInt();

        System.out.println("Total Number of Snake Eyes : " + SnakeEyesGeneral(side1, side2, maxThrow));
        System.out.println("Total Number of Cow Eyes : " + SnakeEyesUsingDiceClass(side1, side2, maxThrow));
    }

    static int roll(int side) {
        return 1 + rand.nextInt(side);
    }

    static int SnakeEyesGeneral(int side1, int side2, int maxThrow) {
        int count = 0;
        while (maxThrow > 0) {
            int value1 = roll(side1);
            int value2 = roll(side2);

            if (value1 == 1 && value2 == 1)
                count++;

            maxThrow--;
        }
        return count;
    }

    static int SnakeEyesUsingDiceClass(int side1, int side2, int maxThrow) {
        Dice d1 = new Dice(side1);
        Dice d2 = new Dice(side2);

        int count = 0;
        while (maxThrow > 0) {
            d1.roll();
            d2.roll();

            if (d1.getCurrentSide() == 2 && d2.getCurrentSide() == 2)
                count++;

            maxThrow--;
        }

        return count;
    }
}