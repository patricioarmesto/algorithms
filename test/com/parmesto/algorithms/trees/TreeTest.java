/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.trees;

import com.parmesto.algorithms.trees.BinarySearchTree.TreeNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Patricio
 */
public class TreeTest {

    public TreeTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void createTree() {
        // Create the root node 
        TreeNode<Integer> root = new TreeNode<>(60);
        // Create the left child node 
        root.left = new TreeNode<>(55);
        // Create the right child node 
        root.right = new TreeNode<>(100);

    }
}
