/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.arrays;

import com.parmesto.algorithms.Array;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patricio
 */
public class ArrayTest {

    public ArrayTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testReverseArrayInPlace() {

        int[] data = {1, 2, 3, 4, 5};
        Array.reverseArrayInPlace(data);    
        System.out.println(Arrays.toString(data));
        
    }

        @Test
    public void testReverseStringInPlace() {

        String data = "hola";
        System.out.println(Array.reverseStringInPlace(data));
        
    }

}
