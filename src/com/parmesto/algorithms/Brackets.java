/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

import com.parmesto.algorithms.stacks.Stack;

/**
 *
 * @author Patricio
 */
public class Brackets {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        if (str == null || "".equals(str)) {
            return true;
        }

        char[] char_arr = str.toCharArray();

        for (char c : char_arr) {

            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                Character val = stack.pop();

                if (val == ']' && c != '[') {
                    return false;
                }
                if (val == '}' && c != '{') {
                    return false;
                }
                if (val == ')' && c != '(') {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

}
