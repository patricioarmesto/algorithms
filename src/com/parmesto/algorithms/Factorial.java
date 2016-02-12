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
public class Factorial {

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static long factorialIterative(long number) {

        int product = 1;
        for (long i = 2; i <= number; i++) {
            product *= i;
        }
        return product;
    }
}
