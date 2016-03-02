/* 
 * The MIT License
 *
 * Copyright 2016 Patricio Armesto <patricio.armesto at gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.parmesto.algorithms;

/**
 *
 * @author Patricio
 * @param <E>
 */
public class SimpleTree<E extends Comparable> {

    private E value;
    private SimpleTree<E> left;
    private SimpleTree<E> right;

    public SimpleTree(E value) {
        this.value = value;
    }

    public SimpleTree(E value, SimpleTree<E> left, SimpleTree<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public SimpleTree<E> getLeft() {
        return left;
    }

    public void setLeft(SimpleTree<E> left) {
        this.left = left;
    }

    public SimpleTree<E> getRight() {
        return right;
    }

    public void setRight(SimpleTree<E> right) {
        this.right = right;
    }

    public boolean search(final E toFind) {
        if (toFind.equals(value)) {
            return true;
        }

        if (toFind.compareTo(value) < 0 && left != null) {
            return left.search(toFind);
        } else {
            return right != null && right.search(toFind);
        }

    }

    public void insert(final E toInsert) {
        if (toInsert.compareTo(value) < 0) {
            if (left == null) {
                left = new SimpleTree<>(toInsert, null, null);
            } else {
                left.insert(toInsert);
            }
        } else if (right == null) {
            right = new SimpleTree<>(toInsert, null, null);
        } else {
            right.insert(toInsert);
        }
    }

    public E findMinimun() {
        E min;
        if (value == null) {
            return null;
        }
        min = value;
        SimpleTree<E> current = left;
        while (current != null) {
            min = left.value;
            current = left.left;
        }

        return min;
    }

    public void traverseInOrder(SimpleTree<E> node) {
        if (node.left != null) {
            traverseInOrder(node.left);
        }
        System.out.println(node.value.toString());
        
        if (node.right != null) {
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(SimpleTree<E> node) {
        
        System.out.println(node.value.toString());
        
        if (node.left != null) {
            traverseInOrder(node.left);
        }
        
        if (node.right != null) {
            traverseInOrder(node.right);
        }

    }

    public void traversePostOrder(SimpleTree<E> node) {

        if (node.left != null) {
            traverseInOrder(node.left);
        }
        
        if (node.right != null) {
            traverseInOrder(node.right);
        }
        
        System.out.println(node.value.toString());
        
    }

    public void breadthfirst() {

    }

    public void depthfirst() {

    }
}
