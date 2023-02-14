package com.isep.tp2;

import java.util.Scanner;


//sout = System.out.println()
public class Main {
    public static void main(String[] args) {
//        discriminant();
//        partie();
//        max();
//        min();
//        egaliteStr();
//        factorielle();
//        countdown();
//        carres();

    }



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

    public static void tableMultiplication(){

    }
}



