package com.isep.piece;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        piece();
    }


    public static void piece() {
        List<Integer> tableau = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200);
//        List<Integer> tableau = Arrays.asList(1,2);
        int prix = 10000;


        int[] count = new int[prix + 1]; // initalisation d'un tableau pour garder en memoire toutes
        // les facons possibles de payer chaque prix de 0 à prix.

        count[0] = 1; // si 0 prix 0 alors 1 possiblité pb !

        for (int i = 0; i < tableau.size(); i++) {
            for (int j = tableau.get(i); j <= prix; j++) {
                count[j] += count[j - tableau.get(i)];
            }
        }

        //Pour toutes les pièces, on regarde tous les valeurs de j à prix (réduction des possiblités en diagonal)
        //et pour chaque valeur j, on ajoute alors le nombre de façons différentes de payer j - tableau.get(i)
        //avec la pièce actuelle à celui de j, ont stock ensuite le résultat dans le tableau à count[j].

        // Pour obtenir le résultat final, il faut donc regarder la dernière case de notre tableau qui compte les possiblités.

        System.out.println("Il y'a " + count[prix] + " possibilité d'obtenir " + prix + " avec la liste suivante " + tableau);
    }


}


