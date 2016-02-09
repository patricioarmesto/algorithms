/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.trees;

import com.parmesto.algorithms.SimpleTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patricio
 */
public class SimpleTreeTest {
    
    public SimpleTreeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void createTree() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        assertTrue(root.search(10));
        assertEquals(Integer.valueOf(10), root.getRight().getRight().getValue());
    }
    
    @Test
    public void findMinimun() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        
        assertEquals(new Integer(3), root.findMinimun());
        
    }
    
    @Test
    public void preOrder() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        
        root.traversePreOrder(root);
        
    }
    
    @Test
    public void inOrder() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        
        root.traverseInOrder(root);
        
    }
    
    @Test
    public void postOrder() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        
        root.traversePostOrder(root);
        
    }
    
}
