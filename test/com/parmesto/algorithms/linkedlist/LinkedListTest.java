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

        Assert.assertEquals(new Integer(3), list.findMiddle());
    }

    @Test
    public void testReverseList() {
        System.out.println("testReverseList");
        LinkedList<Integer> list = new LinkedList<>(5);

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.reverseList();

        System.out.println(list.toString());
    }
}
