package com.isep.tp2;

import java.util.Scanner;


//sout = System.out.println()
public class Main {
    public static void main(String[] args) {
        discriminant();
        partie();
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
        }
        else{
            System.out.println("L'entier " + a + " est impair");
        }
    }

}
