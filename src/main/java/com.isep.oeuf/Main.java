package com.isep.oeuf;


public class Main {

    public static void main(String[] args) {
        int n = 2;
        int h = 100;
        int essais = nbrEssais(n, h);
        System.out.println("Le nombre minimal d'essais nécessaires pour trouver l'étage de rupture est : " + essais);
    }

    public static int nbrEssais(int n, int h) {
        int[][] tableau = new int[n + 1][h + 1];
        // Initialisation
        for (int i = 1; i <= n; i++) {
            tableau[i][1] = 1; // Si on a qu'un seul étage, on a besoin d'un seul essai
            tableau[i][0] = 0; // Si on a aucun étage, on a besoin d'aucun essai
        }
        for (int j = 1; j <= h; j++) {
            tableau[1][j] = j; // Si on a qu'un seul oeuf, on a besoin de j essais pour h étages
        }
        // Remplissage du tableau tableau
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= h; j++) {

                }
            }


        // Le résultat sera dans la denriere case du tableau
        return tableau[n][h];
    }


}

