package com.isep.tp2;

import java.util.Scanner;


//sout = System.out.println()
public class Main {
    public static void main(String[] args) {
        isBinarySumInArray(new int[]{1, 2, 3, 4, 15});
        discriminant();
        partie();
        max();
        min();
        egaliteStr();
        factorielle();
        countdown();
        carres();
        tableMultiplication();
        division();
    }

//    public static boolean isBinarySumInArray(int[] tableau) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quelle est la valeur de val ?");
//        int val = scanner.nextInt();
//        for (int b : tableau) {
//            for (int j = 1; j < tableau.length - 1; j++) {
//                int somme = b + tableau[j];
//                if (val == somme) {
//                    System.out.println(true);
//                    return true;
//                }
//            }
//        }
//        System.out.println(false);
//        return false;
//    }

// La complexité de la méthode est n^2 car il y a deux boucles.

    public static boolean isBinarySumInArray(int[] tableau) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de val ?");
        int val = scanner.nextInt();
        for (int i = 0; i < tableau.length; i++) {
            int j = i;
            while (j < tableau.length - 1) {
                j++;
                int somme = tableau[i] + tableau[j];
                if (val == somme) {
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }


//mieux

//    public static boolean isBinarySumInArray(int[] tableau) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quelle est la valeur de val ?");
//        int val = scanner.nextInt();
//        for (int i = 0, j = 1; j < tableau.length; i++, j++ ) {
//            int somme = tableau[i] + tableau[j];
//            if (val == somme) {
//                System.out.println(true);
//                return true;
//            }
//            if (j == tableau.length - 1) {
//                i++;
//                j = i + 1;
//            } else {
//                j++;
//            }
//        }
//        System.out.println(false);
//        return false;
//    }


//pour mieux faire une soustraction et verifier si dans le tableau


    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
            double racineDelta = Math.sqrt(-delta);
            String x_0 = "(" + -b + " + " + racineDelta + "i) / " + 2 * a;
            String x_1 = "(" + -b + " - " + racineDelta + "i) / " + 2 * a;
            System.out.println("Ce polynome admet deux racines complexes :\n\t x_0 = " + x_0 + "\n\t x_1 = " + x_1);
        } else if (delta == 0) {
            double x_0 = -b / (2 * a);
            System.out.println("Ce polynome admet une racine double :\n\t x_0 = " + x_0);
        } else {
            double racineDelta = Math.sqrt(delta);
            double x_0 = (-b + racineDelta) / (2 * a);
            double x_1 = (-b - racineDelta) / (2 * a);
            System.out.println("Ce polynome admet deux racines :\n\t x_0 = " + x_0 + "\n\t x_1 = " + x_1);
        }
    }

    public static void partie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("L'entier " + a + " est pair");
        } else {
            System.out.println("L'entier " + a + " est impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux entier");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("L'entier " + a + " est le maximum");
//        } else if (a == b) {
//            System.out.println("L'entier " + a + " est égal à l'entier " + b);
        } else {
            System.out.println("L'entier " + b + " est le maximum");
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux entier");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("L'entier " + b + " est le minimum");
        } else {
            System.out.println("L'entier " + a + " est le minimum");
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux chaines de caractères");
        String chaine1 = scanner.nextLine();
        String chaine2 = scanner.nextLine();
        if (chaine1.equals(chaine2)) {
            System.out.println("Les chaines de caractères sont égales");
        } else {
            System.out.println("Les chaines de caractères ne sont pas égales");
        }
    }

//salut
//Bonjour
//Les chaines de caractères ne sont pas égales

//Bonjour
//Bonjour
//Les chaines de caractères sont égales

//bonjour
//Bonjour
//Les chaines de caractères ne sont pas égales

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);

    }

//Ne permet pas de faire 32!

//    public static void factorielle() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Saisir un entier positif ou nul");
//        int n = scanner.nextInt();
//        long factorielle = 1;
//        for (int i = 1; i <= n; i++) {
//            factorielle *= i;
//        }
//        System.out.println(n + "! = " + factorielle);
//    }

// Ne permet toujours pas de faire 32!


//    Question 2 - Il y a un problème avec la boucle sachant qu'elle commence à 0 la factorielle est donc forcément nulle
//    Question 3 - Le programme est correct ex : 0! = 1 ; 3! = 6 ; 5! = 120

    public static void countdown() {
        int i = 11;
        while (i != 0) {
            i--;
            System.out.println(i);
        }
        System.out.println("BOOM!");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int x = scanner.nextInt();
        System.out.println(x + "\t" + x * x);
//        System.out.println("x = " + x + "\tx^2 = " + x * x);
    }

    //Une boucle for
    public static void tableMultiplication() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 2; j <= n; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }

    }
//Les bornes de la seconde boucle for sont de 2 à n.
//Un élément de la table de multiplication est le produit des indices (attention indice +1 si on utilise les tableaux)
// de sa ligne et de sa colonne.


    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier (numérateur)");
        float premierEntier = scanner.nextFloat();
        float deuxiemeEntier;
        do {
            System.out.println("Veuillez saisir le deuxième entier (dénominateur)");
            deuxiemeEntier = scanner.nextFloat();
        } while (deuxiemeEntier == 0);
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier +
                " est égale à " + division);
    }



}




