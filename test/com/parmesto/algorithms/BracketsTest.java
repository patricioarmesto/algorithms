/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patricio
 */
public class BracketsTest {
    
    public BracketsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsBalanced() {
        
        String str = "{([])}";
        Assert.assertTrue(Brackets.isBalanced(str));

        String str2 = "{([)}";
        Assert.assertFalse(Brackets.isBalanced(str2));


    }
    
}
