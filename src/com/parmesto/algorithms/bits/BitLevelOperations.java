/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.bits;

/**
 *
 * @author Patricio
 */
public class BitLevelOperations {

    /**
     * Swap two numbers without using temporary storage
     *
     * @param a
     * @param b
     * @return
     */
    public static int swap(int a, int b) {
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return a;

    }
}
