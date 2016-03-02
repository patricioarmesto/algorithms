/* 
 * The MIT License
 *
 * Copyright 2016 Patricio Armesto <patricio.armesto at gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.parmesto.algorithms.dp;

public class MinCoins {

    // Recursive Solution to find minimum number of coins
    public static int getMinCoins(int[] values, int sum) {
        if (sum == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (sum >= values[i]) {
                min = Math.min(min, getMinCoins(values, sum - values[i]));
            }
        }
        return min + 1;
    }

    // DP Solution to find minimum number of coins
    public static int getMinCoinsDP(int[] values, int sum) {
        int min = 0;
        int[] minCoins = new int[sum + 1];
        minCoins[0] = 0;
        for (int i = 1; i <= sum; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < values.length; j++) {
                if (i >= values[j]) {
                    min = Math.min(min, minCoins[i - values[j]]);
                }
            }
            if (min != Integer.MAX_VALUE) {
                minCoins[i] = min + 1;
            } else {
                minCoins[i] = Integer.MAX_VALUE;
            }
        }
        return minCoins[sum];
    }

    public static void main(String[] args) {
        //int[] values = {2, 5, 3};
        //int sum = 7;
        int[] values = {1, 2, 5, 10, 20, 21, 25, 50};
        int sum = 63;
        System.out.println("Minimum number of coins: " + getMinCoinsDP(values, sum));
    }
}
