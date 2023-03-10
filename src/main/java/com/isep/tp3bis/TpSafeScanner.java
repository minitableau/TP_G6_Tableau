package com.isep.tp3bis;

public class TpSafeScanner {
    public static void main(String[] args) {
        SafeScanner safeScanner = new SafeScanner();
        System.out.println("quel est ton age ?");
        int answer = SafeScanner.getInt();
        System.out.printf("Your age is %d.%n", answer);
        safeScanner.closeScanner();
    }
}

