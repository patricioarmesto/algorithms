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
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFibonacciRecusion() {
        
        Assert.assertEquals(0, Fibonacci.fibonacciRecusion(0));
        Assert.assertEquals(1, Fibonacci.fibonacciRecusion(1));
        Assert.assertEquals(1, Fibonacci.fibonacciRecusion(2));
        Assert.assertEquals(2, Fibonacci.fibonacciRecusion(3));
        Assert.assertEquals(3, Fibonacci.fibonacciRecusion(4));
    }

    @Test
    public void testFibonacciIterative() {
        
        Assert.assertEquals(0, Fibonacci.fibonacciIterative(0));
        Assert.assertEquals(1, Fibonacci.fibonacciIterative(1));
        Assert.assertEquals(1, Fibonacci.fibonacciIterative(2));
        Assert.assertEquals(2, Fibonacci.fibonacciIterative(3));
        Assert.assertEquals(3, Fibonacci.fibonacciIterative(4));
    }
    
}
