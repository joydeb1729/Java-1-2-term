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

class CoinFlip {

    private int face;
    private final int head = 0;
    private final int tale = 1;

    CoinFlip() {
        flip();
    }

    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHead() {
        if (face == head) {
            return true;
        }

        return false;
    }

    public String toString() {
        if (isHead()) {
            return "Head";
        } else {
            return "Tail";
        }
    }
}

public class CoinGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to play Counting Head Game. Enter 2 to play Three Head Win game : ");
        int choise = sc.nextInt();

        if (choise == 1) {
            countHeadGame();
        } else if (choise == 2) {
            ThreeHeadWinGame();
        } else {
            System.out.println("Invalid Input! Try Again!");
        }
    }

    static void countHeadGame() {
        CoinFlip player1 = new CoinFlip();
        CoinFlip player2 = new CoinFlip();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many time you want to flip the coin : ");
        int totalFlip = sc.nextInt();
        int player1Point = 0;
        int player2Point = 0;

        while (totalFlip-- > 0) {
            player1.flip();
            player2.flip();

            if (player1.isHead()) {
                player1Point++;
            }

            if (player2.isHead()) {
                player2Point++;
            }
        }

        System.out.println("Player1 Total Head : " + player1Point + "\nPlayer2 Total Head : " + player2Point);
        if (player1Point > player2Point) {
            System.out.println("Player1 has Won!");
        } else if (player1Point < player2Point) {
            System.out.println("Player2 has Won!");
        } else {
            System.out.println("Draw!");
        }

    }

    static void ThreeHeadWinGame() {

        CoinFlip player1 = new CoinFlip();
        CoinFlip player2 = new CoinFlip();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many both player will flip the coin : ");
        int totalFlip = sc.nextInt();
        int player1Point = 0;
        int player2Point = 0;
        int count1 = 0;
        int count2 = 0;

        while (totalFlip-- > 0) {
            player1.flip();
            player2.flip();

            if (player1.isHead()) {
                count1++;
            }

            if (player2.isHead()) {
                count2++;
            }

            if (player1.isHead() == false) {
                count1 = 0;
            }
            if (player2.isHead() == false) {
                count2 = 0;
            }

            if (count1 == 3) {
                count1 = 0;
                player1Point++;
            }
            if (count2 == 3) {
                count2 = 0;
                player2Point++;
            }
        }

        System.out.println("Player1 Total Three Head : " + player1Point + "\nPlayer2 Total Three Head : " + player2Point);
        if (player1Point > player2Point) {
            System.out.println("Player1 has Won!");
        } else if (player1Point < player2Point) {
            System.out.println("Player2 has Won!");
        } else {
            System.out.println("Draw!");
        }
    }

}
