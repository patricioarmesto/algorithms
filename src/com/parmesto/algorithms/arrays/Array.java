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
package com.parmesto.algorithms.arrays;

import java.util.ArrayList;

/**
 *
 * @author Patricio
 */
public class Array {

    /**
     * Reverse Array in place
     *
     * @param data
     */
    public static void reverseArrayInPlace(int[] data) {

        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }

    }

    /**
     * Reverse String in place
     *
     * @param data
     * @return
     */
    public static String reverseStringInPlace(String data) {
        char[] charData = data.toCharArray();
        for (int i = 0; i < charData.length / 2; i++) {
            char temp = charData[i];
            charData[i] = charData[charData.length - 1 - i];
            charData[charData.length - 1 - i] = temp;
        }

        return new StringBuilder().append(charData).toString();
    }

    /**
     * Merge two arrays
     *
     * @param a
     * @param b
     * @return
     */
    public static ArrayList<String> merge(String[] a, String[] b) {
        ArrayList<String> result = new ArrayList<>();
        for (String w : a) {
            result.add(w);
        }
        for (String w : b) {
            result.add(w);
        }
        return result;

    }

    public static void removeElement(int[] data, int val) {

        int i = 0;
        int j = 0;

        while (j < data.length) {
            if (data[j] != val) {
                data[i] = data[j];
                i++;
            }

            j++;
        }
    }

}
