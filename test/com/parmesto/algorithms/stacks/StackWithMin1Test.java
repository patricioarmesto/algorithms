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
public class StackWithMin1Test {
    
    public StackWithMin1Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testStackWithMin1() {
        
        StackWithMin1<Integer> stack = new StackWithMin1<>();
        
        stack.push(10);
        System.out.println(stack.getMin());
        
        stack.push(9);
        System.out.println(stack.getMin());
        
        stack.pop();
        System.out.println(stack.getMin());
        
        
        
    }

}
