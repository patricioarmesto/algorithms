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
public class Hanoi {

    public static void hanoi(int disk, char source, char dest, char aux) {
        if (disk == 0) {
            System.out.println("Disk 0 from " + source + " to " + dest);
        } else {
            hanoi(disk - 1, source, aux, dest); // Step 1
            System.out.println("Disk " + disk + " from " + source + " to " + dest);  // Step 2
            hanoi(disk - 1, aux, dest, source); // Step 3
        }
    }
}
