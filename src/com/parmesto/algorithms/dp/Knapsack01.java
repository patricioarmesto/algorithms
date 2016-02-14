package com.parmesto.algorithms.dp;

public class Knapsack01 {

    public static void dynamic(int[] profit, int[] weight, int W) {

        int N = profit.length;

        // opt[n][w] = max profit of packing items 1..n with weight limit w
        // sol[n][w] = does opt solution to pack items 1..n with weight limit w include item n?
        int[][] opt = new int[N + 1][W + 1];
        boolean[][] sol = new boolean[N + 1][W + 1];

        for (int n = 1; n <= N; n++) {
            for (int w = 1; w <= W; w++) {

                // don't take item n
                int option1 = opt[n - 1][w];

                // take item n
                int option2 = Integer.MIN_VALUE;
                if (weight[n - 1] <= w) {
                    option2 = profit[n - 1] + opt[n - 1][w - weight[n - 1]];
                }

                // select better of two options
                opt[n][w] = Math.max(option1, option2);
                sol[n][w] = (option2 > option1);
            }
        }

        // determine which items to take
        boolean[] take = new boolean[N + 1];
        for (int n = N, w = W; n > 0; n--) {
            if (sol[n][w]) {
                take[n] = true;
                w = w - weight[n - 1];
            } else {
                take[n] = false;
            }
        }

        // print results
        System.out.println("item" + "\t" + "profit" + "\t" + "weight" + "\t" + "take");
        for (int n = 1; n <= N; n++) {
            System.out.println(n + "\t" + profit[n - 1] + "\t" + weight[n - 1] + "\t" + take[n - 1]);
        }
    }
}
