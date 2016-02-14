/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patricio
 */
public class Knapsack01Test {

    public Knapsack01Test() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDynamic() {
        int[] profit = {10, 20, 7};
        int[] weight = {3, 5, 1};
        int W = 10;
        Knapsack01.dynamic(profit, weight, W);
    }

}
