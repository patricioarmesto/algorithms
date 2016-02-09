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
public class Search {

    public static boolean binarySearch(int[] data, int target, int low, int high) {

        boolean result = false;

        if (low > high) {
            result = false;
        } else {
            int mid = (low + high) / 2;

            if (data[mid] == target) {
                result = true;
            } else if (data[mid] > target) {
                result = binarySearch(data, target, low, mid - 1);
            } else if (data[mid] < target) {
                result = binarySearch(data, target, mid + 1, high);
            }
        }
        return result;
    }
}
