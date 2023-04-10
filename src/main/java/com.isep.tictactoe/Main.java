package com.isep.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char player = 'X';
        boolean end = true;

        while (end) {
            GameBoard.gameBoard(board);

            double[] coord = CheckCase.chooseCase(board, player);

            boolean out = CheckCase.checkCase(board, (int) coord[0], (int) coord[1]);
            if (!out) {
                continue;
            } else {
                // on palce le symbole du joueur sur la case choisie
                board[(int) coord[0]][(int) coord[1]] = player;

                boolean end1 = CheckWin.victory(board, (int) coord[0], (int) coord[1], player);

                boolean end2 = CheckWin.draw(board, (int) coord[0], (int) coord[1], player);

                if (!end1 || !end2) {
                    end = false;
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            }


        }


    }
}


