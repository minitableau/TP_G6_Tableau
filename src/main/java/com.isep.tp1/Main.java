package main.java.com.isep.tp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        On déclare une classe nommée Main avec une méthode main.
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
//        On instancie la classe Scanner nommée scanner, on permet à l'utilisateur d'entrée des valeurs.
//        Nous utilisons les méthodes nextInt pour demander un entier et nextFloat pour demander un réel, on stocke ces valeurs.
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
//        Avec la méthode println on affiche les deux nombres (à l'aide d'une concaténation) entré par l'utilisateur.
    }
}
