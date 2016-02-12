/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}
