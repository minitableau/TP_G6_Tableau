//package com.isep.piece;
//

//CORRECTION

//import java.util.ArrayList;
//import java.util.List;
//
//public class Coin {
//    public int combinationsCount(float[] coins, float amount, int index, int[][] memo) {
//        if (index == coins.length - 1) {
//            if (amount % coins[index] == 0) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        if (memo[index][(int) amount] >= 0) {
//            return memo[index][(int) amount];
//
//        }
//        int nb0fCombinations = 0;
//        for (int i = 0; i * coins[index] <= amount; i++) {
//            nb0fCombinations += combinationsCount(coins, amount - i * coins[index], index + 1);
//        }
//        memo[index][(int) amount] = nb0fCombinations;
//        return nb0fCombinations;
//
//    }
//
//    public static void main(String[] args) {
//        Coin coin = new Coin();
//        int[] coins = {2, 1, (int) 0.5, (int) 0.2, (int) 0.1, (int) 0.05, (int) 0.02(int) 0.01};
//        int amount = 1000;
//        Coin coin = new Coin(coins.length, amount);
//        int nb0Combinations = coin.combinationsCount(coins, amount, 0);
//        System.out.println("The number of combianyions is :%d%n", nb0fCombinations);
//    }
//}