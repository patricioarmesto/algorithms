/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Patricio
 */
public class Quizzes {

    public static List<String> fizzBuzz(final int n) {
        final List<String> toReturn = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                toReturn.add("FizzBuzz");
            } else if (i % 3 == 0) {
                toReturn.add("Fizz");
            } else if (i % 5 == 0) {
                toReturn.add("Buzz");
            } else {
                toReturn.add(Integer.toString(i));
            }
        }
        return toReturn;
    }

    public static List<Integer> fibonacci(int n) {
        return null;
    }

    public static int fibN(int n) {
        return 0;
    }

    public static long factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than zero");
        }
        long toReturn = 1;
        for (int i = 1; i <= n; i++) {
            toReturn *= i;
        }
        return toReturn;
    }

}
