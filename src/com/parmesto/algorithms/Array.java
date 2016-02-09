/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

import java.util.ArrayList;

/**
 *
 * @author Patricio
 */
public class Array {

    public static void reverseArrayInPlace(int[] data) {

        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }

    }

    public static String reverseStringInPlace(String data) {
        char[] charData = data.toCharArray();
        for (int i = 0; i < charData.length / 2; i++) {
            char temp = charData[i];
            charData[i] = charData[charData.length - 1 - i];
            charData[charData.length - 1 - i] = temp;
        }

        return new StringBuilder().append(charData).toString();
    }

    public static ArrayList<String> merge (String[] a, String[] b) {
        ArrayList<String> result = new ArrayList<>();
        for (String w : a) result.add(w);
        for (String w : b) result.add(w);
        return result;
               
    }

}
