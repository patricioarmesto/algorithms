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
package com.parmesto.algorithms;

/**
 *
 * @author Patricio
 */
public class Fibonacci {

    /**
     * Computes and prints the first N Fibonacci numbers. Recursive
     *
     * @param n
     * @return
     */
    public static int fibonacciRecusion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacciRecusion(n - 1) + fibonacciRecusion(n - 2); //tail recursion
    }

    /**
     * Computes and prints the first N Fibonacci numbers. Iterative
     *
     * @param n
     * @return
     */
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number
    }

    /**
     * Fibbonacci using Dynamic Programming
     *
     * @param N
     * @return
     */
    public static int fibonacciDynamic(int N) {
        if (N == 0) {
            return 0;
        }
        int[] fib = new int[N + 1];

        // base cases
        fib[0] = 0;
        fib[1] = 1;

        // bottom-up dynamic programming
        for (int n = 2; n <= N; n++) {
            fib[n] = fib[n - 1] + fib[n - 2];
        }

        // print results
        return fib[N];

    }
}
