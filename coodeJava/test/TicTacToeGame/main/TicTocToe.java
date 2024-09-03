/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToeGame.main;

/**
 *
 * @author Durjay
 */
public class TicTocToe {

    private static final char emptySpace = ' ';
    private static final int player1 = 1;
    private static final int player2 = 2;
    private String player1Name;
    private String player2Name;
    boolean valid = true;

    private static char player1Symbol = '0';
    private static char player2Symbol = 'X';
    private char gameBoard[][] = new char[3][3];

    public TicTocToe(String name1, String name2) {
        this.player1Name = name1;
        this.player2Name = name2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = emptySpace;
            }
        }
    }

    public void setplayer1Name(String name) {
        this.player1Name = name;
    }

    public void setplayer2Name(String name) {
        this.player2Name = name;
    }

    public String getplayer1Name() {
        return player1Name;
    }

    public String getplayer2Name() {
        return player2Name;
    }

    public void move(int row, int column, int playerNumber) {
        
        row--;
        column--;

        if (playerNumber == player1) {
            gameBoard[row][column] = player1Symbol;
        } else {
            gameBoard[row][column] = player2Symbol;
        }

    }

    public boolean isFinished() {
        CheckWhoWon winner = new CheckWhoWon(gameBoard);
        boolean decision = true;
        if (winner.getResult() == emptySpace) {
            decision = false;
        } else if (winner.getResult() == player1Symbol) {
            System.out.println(player1Name + " Has Won The Game!");
            decision = true;
        } else if (winner.getResult() == player2Symbol) {
            System.out.println(player2Name + " Has Won The Game!");
            decision = true;
        } else if (winner.getResult() == 'N') {
            System.out.println(" Tie!");
            decision = true;
        }

        return decision;
    }

    public void printCurrentBoard() {
        System.out.println("|---|---|---|");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c | %c | %c |\n", gameBoard[i][0], gameBoard[i][1], gameBoard[i][2]);
            System.out.println("|---|---|---|");
        }
    }

}
