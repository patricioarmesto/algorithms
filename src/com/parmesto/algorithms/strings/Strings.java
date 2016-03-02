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
package com.parmesto.algorithms.strings;

/**
 *
 * @author Patricio
 */
public class Strings {

    public static boolean isUniqueChars2(String str) {
        if (str.length() > 256) {
            return false;
        }

        boolean[] char_set = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }

        return true;

    }

    public static String removeDuplicates(String str) {
        return null;
    }

    /**
     * Check if a given String is a palindrome
     *
     * @param s input String
     * @return true if it is a palindrome
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Check if two strings are anagrams
     * @param word
     * @param anagram
     * @return 
     */
    public boolean isAnagram(String word, String anagram) {
        if (word == null || word.length() == 0) {
            return false;
        }

        char[] chars = word.toCharArray();
        for (char c : chars) {

            if (anagram.indexOf(c) != -1) {
                // Remove letter from workd
                anagram = anagram.substring(0, anagram.indexOf(c)) + anagram.substring(anagram.indexOf(c) + 1, anagram.length());
            } else {
                return false;
            }

        }

        return anagram.isEmpty();

    }

    /**
     * Check if two strings are anagrams
     * @param word
     * @param anagram
     * @return 
     */
    public boolean isAnagram2(String word, String anagram) {
        
        char[] characters = word.toCharArray();
        StringBuilder sbSecond = new StringBuilder(anagram);

        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }

        return sbSecond.length() == 0;
    }
}
