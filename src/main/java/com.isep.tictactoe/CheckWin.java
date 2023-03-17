package com.isep.tictactoe;

public class CheckWin {
    public static boolean victory(char[][] board, int row, int col, char player) {
        board[row][col] = player;
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
            System.out.println("Le joueur " + player + " a gagné !");
            return false;
        } else if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
            System.out.println("Le joueur " + player + " a gagné !");
            return false;
        } else if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            System.out.println("Le joueur " + player + " a gagné !");
            return false;
        } else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            System.out.println("Le joueur " + player + " a gagné !");
            return false;
        }
        return true;
    }

    public static boolean draw(char[][] board, int row, int col, char player) {
        boolean fullBoard = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return true;
                }
            }
        }
        if (fullBoard) {
            System.out.println("Match nul !");
            return false;
        }
        return true;
    }

}
