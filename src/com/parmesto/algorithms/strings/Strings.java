/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
