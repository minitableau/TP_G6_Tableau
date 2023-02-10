package com.isep.tp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        On déclare une classe nommée Main avec une méthode main.
//        Scanner scanner = new Scanner(System.in);
//        int unEntier = scanner.nextInt();
//        float unReel = scanner.nextFloat();
////        On instancie la classe Scanner nommée scanner, on permet à l'utilisateur d'entrée des valeurs.
////        Nous utilisons les méthodes nextInt pour demander un entier et nextFloat pour demander un réel, on stocke ces valeurs.
//
//        System.out.println("J’ai recupère un entier: " + unEntier);
//        System.out.println("J’ai aussi recupère un réel: " + unReel);
//        Avec la méthode println on affiche les deux nombres (à l'aide d'une concaténation) entré par l'utilisateur.
    prenom();
    somme(); // La somme de 2 avec 2 est égale à 4
    division(); // La division de 5.0 par 3.0 est égale à 1.6666666
    volume(); // Le volume de votre pavé droit de premier coté : 2.0, deuxième coté : 3.0, troisième coté : 4.0, est égale à 24.0
    }

    public static void prenom() {
        System.out.println("Bonjour quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String prenom = scanner.nextLine();
        System.out.println("Bonjour, " + prenom);
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est égale à " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextInt();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier +
                " est égale à " + division);
    }

//    Calcul du volume d’un pavé droit
//    Question 1 - 3 variables : La formule du volume d'un pavé droit est : V = (a × b) × h. (avec (a × b) = Aire de la base)
//    Question 2 - a, b, h sont des flottants
//    Question 3 - En demandant à l'utilisateur de les entrer
//    Question 4 - La formule du volume d'un pavé droit est : V = (a × b) × h. (avec (a × b) = Aire de la base)
//    Question 5 - Le stocker puis l'afficher

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur du premier coté");
        float premierCote = scanner.nextInt();
        System.out.println("Veuillez saisir la longueur du deuxième coté");
        float deuxiemeCote = scanner.nextInt();
        System.out.println("Veuillez saisir la longueur du troisième coté");
        float troisiemeCote = scanner.nextInt();
        float volume = (premierCote * deuxiemeCote) * troisiemeCote;
        System.out.println("Le volume de votre pavé droit de premier coté : " + premierCote + ", deuxième coté : " + deuxiemeCote +
                ", troisième coté : " + troisiemeCote +", est égale à " + volume);
    }
}


