package com.isep.tp1;

import java.util.Scanner;

//Question :
//        — Sans recopier le programme ci-dessus ni l’exécuter, prévoyez son résultat
//        J’ai recupere un entier: le nombre entier entrée
//        J’ai aussi recupere un reel: le nombre flottant entrée (si entier alors .0)
//
//        — Selon vous, et toujours sans exécuter le programme, que font les instructions scanner.nextInt()
//        et scanner.nextFloat() ?
//        Nous utilisons les méthodes scanner.nextInt() pour demander un entier et scanner.nextFloat() pour demander un réel
//
//        — Recopiez le contenu de la fonction main() dans votre classe, puis lancez le programme.
//        Que se passe-t-il ?
//        On nous donne la possibilité d’entrer un nombre (entier) puis un nombre (flottant) et on nous les retourne avec une phrase
//        Question :
//        — Sans recopier le programme ci-dessus ni l’exécuter, prévoyez son résultat
//        J’ai recupere un entier: le nombre entier entrée
//        J’ai aussi recupere un reel: le nombre flottant entrée (si entier alors .0)
//
//        — Selon vous, et toujours sans exécuter le programme, que font les instructions scanner.nextInt()
//        et scanner.nextFloat() ?
//        Nous utilisons les méthodes scanner.nextInt() pour demander un entier et scanner.nextFloat() pour demander un réel
//
//        — Recopiez le contenu de la fonction main() dans votre classe, puis lancez le programme.
//        Que se passe-t-il ?
//        On nous donne la possibilité d’entrer un nombre (entier) puis un nombre (flottant) et on nous les retourne avec une phrase

public class Main {
    public static void main(String[] args) {
//        On déclare une classe nommée Main avec une méthode main.
//        Scanner scanner = new Scanner(System.in);
//        int unEntier = scanner.nextInt();
//        float unReel = scanner.nextFloat();
////        On instancie la classe Scanner nommée scanner, on permet à l'utilisateur d'entrée des valeurs.
////        Nous utilisons les méthodes nextInt pour demander un entier et nextFloat pour demander un réel, on stocke ces valeurs.
//
//        System.out.println("J’ai récupéré un entier: " + unEntier);
//        System.out.println("J’ai aussi récupéré un réel : " + unReel);
//        Avec la méthode println on affiche les deux nombres (à l'aide d'une concaténation) entré par l'utilisateur.
    prenom();
    somme(); // La somme de 2 avec 2 est égale à 4
    division(); // La division de 5.0 par 3.0 est égale à 1.6666666
    volume(); // Le volume de votre pavé droit de premier coté : 2.0, deuxième coté : 3.0, troisième coté : 4.0, est égale à 24.0
    test();
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
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();
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
        float premierCote = scanner.nextFloat();
        System.out.println("Veuillez saisir la longueur du deuxième coté");
        float deuxiemeCote = scanner.nextFloat();
        System.out.println("Veuillez saisir la longueur du troisième coté");
        float troisiemeCote = scanner.nextFloat();
        float volume = (premierCote * deuxiemeCote) * troisiemeCote;
        System.out.println("Le volume de votre pavé droit de premier coté : " + premierCote + ", deuxième coté : " + deuxiemeCote +
                ", troisième coté : " + troisiemeCote +", est égale à " + volume);
    }
    //L'utilisateur se doit de saisir un flottant ou un entier, car sinon le programme ne fonctionnera pas,
    // il n'y a aucune sécurité pour cela, de plus celui-ci ne doit pas être trop grand ou trop petit, parce qu'il pourrait
    // dépasser la taille memoire.


    public static void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        // On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
        // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
        // retrouver dans la variable operation
        // Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();

    }
}


