/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.trees;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patricio
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> {

    public static class TreeNode<E> {

        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }

    }

    protected TreeNode<E> root;
    protected int size = 0;

    public BinarySearchTree() {
    }

    public BinarySearchTree(E[] objects) {
        for (E object : objects) {
            insert(object);
        }
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;

        while (current != null) {
            if (current.element.compareTo(e) < 0) {
                current = current.left;
            } else if (current.element.compareTo(e) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null) {
                if (current.element.compareTo(e) < 0) {
                    parent = current;
                    current = current.left;
                } else if (current.element.compareTo(e) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;

    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");

    }

    @Override
    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);

    }

    @Override
    public int getSize() {
        return size;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public ArrayList<TreeNode<E>> path(E e) {
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        TreeNode<E> current = root;

        while (current != null) {
            list.add(current);
            if (current.element.compareTo(e) < 0) {
                current = current.left;
            } else if (current.element.compareTo(e) > 0) {
                current = current.right;
            } else {
                break;
            }
        }

        return list;
    }

    @Override
    public boolean delete(E e) {
        // Locate the node to be deleted and also locate its parent node 
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
            // Element is in the tree pointed at by current 
        }

        if (current == null) {
            return false; // Element is not in the tree
        }
        // Case 1: current has no left child 
        if (current.left == null) {
            // Connect the parent with the right child of the current node 
            if (parent == null) {
                root = current.right;
            } else if (e.compareTo(parent.element) < 0) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            // Case 2: The current node has a left child. 
            // Locate the rightmost node in the left subtree of 
            // the current node and also its parent. 
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
            }
            rightMost = rightMost.right;
            // Keep going to the right 
        
        // Replace the element in current by the element in rightMost 
        current.element = rightMost.element;
        // Eliminate rightmost node 
        if (parentOfRightMost.right == rightMost) {
            parentOfRightMost.right = rightMost.left;
        } else // Special case: parentOfRightMost == current 
        {
            parentOfRightMost.left = rightMost.left;
        }
        }
         size--; 

        return true; 
        // Element deleted successfully 
    } 
    
     @Override 
     /** Obtain an iterator. Use inorder. */ 
     public java.util.Iterator<E> iterator() { 
         return new InorderIterator(); 
     } 

    private class InorderIterator implements Iterator<E> {

        private ArrayList<E> list = new ArrayList<>();
        private int current = 0;
        
        public InorderIterator() {
            inorder(); 
        }

        @Override
        public boolean hasNext() {
          return current < list.size(); 
        }

        @Override
        public E next() {
            return list.get(current++); 
        }
         private void inorder() {       
             inorder(root);          }
         
        private void inorder(TreeNode<E> root) { 
            if (root == null) return; 
            inorder(root.left); 
            list.add(root.element); 
            inorder(root.right); 
        } 

        @Override
        public void remove() {
            delete(list.get(current)); // Delete the current element 
            list.clear(); // Clear the list 
            inorder(); // Rebuild the list 
        }
        
        
    }
     
    public void clear() {     
        root = null;     
    size = 0;    
    } 
}
