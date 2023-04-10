package com.isep.oeuf;

import java.util.LinkedList;
import java.util.List;

public class Egg {
    public static int eggDrop(int H, int n, int[][] memo) {
        //Recursion base case
        if (H == 0 || H == 1)
            return 0;
        if (n == 1)
            return H;
        if (memo[H][n] > 0) {
            return memo[H][n];
        }
        int min = H + 1;
        for (int k = 1; k <= H; k++) {
//            val_break = eggDrop(k - 1, n - 1);
//            val_not_break = eggDrop(H - k, n);
            int val = (int) Math.max(eggDrop(k - 1, n - 1, memo), eggDrop(H - k, n, memo));
            val++;
            if (val < min) {
                min = val;
            }
        }

        memo[H][n] = min;
        return min;
    }

//    public static List<Integer> bestPath(int height, int numberOfEggs, int breakingVal, int[][] memo) {
//        List<Integer> path = new LinkedList<>();
//        if (height == 0 || height == 1) {
//            path.add(height);
//        }
//        int val = eggDrop(height, numberOfEggs, memo);
//        if (path.isEmpty()) {
//            path.add(val);
//        } else {
//            if(val<breakingVal){
//                path.add();
//            }
//        }
//
//
//        return path;
//    }

    public static void main(String[] args) {
        int numberOfFloors = 100;
        int numberOfEggs = 3;
        int min = numberOfFloors;
        System.out.println("The number of floors is " + numberOfFloors);
        int[][] memo = new int[numberOfFloors + 1][numberOfEggs + 1];
        int eggDropRequired = eggDrop(numberOfFloors, numberOfEggs, memo);
        System.out.printf("The minimum number of egg drops required is " + eggDropRequired);


    }
}
