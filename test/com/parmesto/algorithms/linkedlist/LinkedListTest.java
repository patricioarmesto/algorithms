/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.linkedlist;

import com.parmesto.algorithms.linkedlist.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testGetItem() {
    }

    @Test
    public void testGetNext() {
    }

    @Test
    public void testReverse() {

        LinkedList list1 = new LinkedList("One", null);
        LinkedList list2 = new LinkedList("Two", null);
        LinkedList list3 = new LinkedList("Three", null);

        list1.next = list2;
        list2.next = list3;

        LinkedList<String> reverseList = LinkedList.reverse(list1);

        for (String s : reverseList) {
            System.out.println(s + " ");
        }

    }

}
