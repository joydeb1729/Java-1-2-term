/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeGame.main;

import java.util.*;

/**
 *
 * @author Durjay
 */
public class Main {

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        TicTocToe game = new TicTocToe("Durjay", "Joydeb");

        for (i = 0;; i++) {

            if (i % 2 == 0) {

                System.out.println(game.getplayer1Name() + "'s Turn. Please Enter Row and Column Number: ");
                int row = sc.nextInt();
                int column = sc.nextInt();
                game.move(row, column, 1);
            } else {

                System.out.println(game.getplayer2Name() + "'s Turn. Please Enter Row and Column Number: ");
                int row = sc.nextInt();
                int column = sc.nextInt();
                game.move(row, column, 2);

            }

            game.printCurrentBoard();

            if (game.isFinished()) {
                break;
            }
        }
    }
}
