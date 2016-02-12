/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.linkedlist;

import java.util.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Patricio
 */
public class LinkedListTest {

    public LinkedListTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testFindMiddleElement() {

        LinkedList<Integer> list = new LinkedList<>(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next().toString() + " -> ");
        }

        Assert.assertEquals(new Integer(3), list.findMiddle());
    }
}
