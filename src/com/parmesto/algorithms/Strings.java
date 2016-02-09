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
public class Strings {
    
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 256 ) return false;
        
        boolean[] char_set = new boolean[256];
        
        for (int i = 0 ; i < str.length() ; i++) {
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
}
