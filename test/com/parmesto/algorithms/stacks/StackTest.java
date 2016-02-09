/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patricio
 */
public class StackTest {

    public StackTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsEmpty() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testPop() {
    }

    @Test
    public void testPush() {
    }

    @Test
    public void testIterator() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testReverseStringWithStack() {

        Stack<String> stack = new Stack<>();

        String word = "hello";

        for (int i = 0; i < word.length(); i++) {
            char[] c = {word.charAt(i)};
            stack.push(new String(c));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());

    }

    @Test
    public void testCheckParenthesis() {
        
    }
}
