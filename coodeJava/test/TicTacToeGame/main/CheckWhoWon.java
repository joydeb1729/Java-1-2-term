/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeGame.main;

/**
 *
 * @author Durjay
 */
public class CheckWhoWon {

    private char gameBoard[][] = new char[3][3];
    private char decision = ' ';
    private int count = 0;

    public CheckWhoWon(char gameBoard[][]) {
        this.gameBoard = gameBoard;
        diagonalCheck();
        rowCheck();
        columnCheck();
        checkAll();
    }

    private void diagonalCheck() {
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[2][2] == gameBoard[1][1] && gameBoard[0][0] != ' ') {
            decision = gameBoard[0][0];
        } else if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[1][1] && gameBoard[0][2] != ' ') {
            decision = gameBoard[0][2];
        }

    }

    private void rowCheck() {
        if (gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][2] == gameBoard[0][1] && gameBoard[0][1] != ' ') {
            decision = gameBoard[0][0];
        } else if (gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2] && gameBoard[1][0] != ' ') {
            decision = gameBoard[1][0];
        } else if (gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2] && gameBoard[2][0] != ' ') {
            decision = gameBoard[2][0];
        }
    }

    private void columnCheck() {
        if (gameBoard[0][0] == gameBoard[1][0] && gameBoard[2][0] == gameBoard[1][0] && gameBoard[0][0] != ' ') {
            decision = gameBoard[0][0];
        } else if (gameBoard[0][1] == gameBoard[1][1] && gameBoard[2][1] == gameBoard[1][1] && gameBoard[0][1] != ' ') {
            decision = gameBoard[0][1];
        } else if (gameBoard[0][2] == gameBoard[1][2] && gameBoard[2][2] == gameBoard[1][2] && gameBoard[0][2] != ' ') {
            decision = gameBoard[0][2];
        }
    }

    private void checkAll() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == '0' || gameBoard[i][j] == 'X') {
                    count++;
                }
            }
        }
    }

    public char getResult() {

        if (count == 9) {
            decision = 'N';
        }

        return decision;
    }

}
