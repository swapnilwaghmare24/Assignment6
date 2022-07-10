package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    int[] denominations;

    public CoinChange() {
        denominations = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
    }

    public static void main(String[] args) {
        System.out.println("Enter amount to get change");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] ds = new int[amount + 1];
        Arrays.fill(ds, -1);
        CoinChange coinChange = new CoinChange();
        System.out.println("coins required for amount " + amount + " : " + coinChange.minCoin(amount, ds));

        sc.close();
    }

    public int minCoin(int amount, int[] ds) {
        if (amount == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < denominations.length; i++) {
            if (amount - denominations[i] >= 0) {
                int subAnswer;
                if (ds[amount - denominations[i]] == -1) {
                    subAnswer = minCoin(amount - denominations[i], ds);
                } else {
                    subAnswer = ds[amount - denominations[i]];
                }
                if (subAnswer < ans) {
                    ans = subAnswer + 1;
                }
            }
        }
        ds[amount] = ans;
        return ans;
    }
}
