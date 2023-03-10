package com.isep.piece;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        piece();
    }


    public static void piece() {
//        List<Integer> tableau = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200);
        List<Integer> tableau = Arrays.asList(1, 2, 3);
        int prix = 2;


        int[] count = new int[prix + 1];
        count[0] = 1; // si 0 prix 0 alors 1 possiblité pb !

        for (int i = 0; i < tableau.size(); i++) {
            for (int j = tableau.get(i); j <= prix; j++) {
                count[j] += count[j - tableau.get(i)];
            }
        }

        System.out.println("Il y'a " + count[prix] + " possibilité d'obtenir " + prix + " avec la liste suivante " + tableau);
    }


}

