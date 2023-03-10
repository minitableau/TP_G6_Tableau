package com.isep.tp3bis;

import java.util.Scanner;

public class SafeScanner {
    Scanner sc;
    static Scanner scanner = new Scanner(System.in);
    public SafeScanner() {
        this.sc = new Scanner(System.in);
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public void closeScanner() {
        sc.close();
    }

}
