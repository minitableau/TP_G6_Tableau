package com.isep.tp3;

import java.util.Scanner;

public class Chess {
    private Cell[][] board = new Cell[8][8];
    private final int x = 8;
    private final int y = 8;
    Player[] players;
    Player currentPlayer;

    Scanner scanner = new Scanner(System.in);

    public void createPlayers() {
        System.out.println("nom du joueur 1 :");
        String J1 = scanner.nextLine();
        System.out.println("nom du joueur 2 :");
        String J2 = scanner.nextLine();

        Player joueur1;
        joueur1 = new Player(J1, 0);
        Player joueur2 = new Player(J2, 1);
    }

    public void intitialiseBoard() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = new Cell();
            }
        }
    }
}
