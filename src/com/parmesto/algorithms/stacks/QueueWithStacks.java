/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

/**
 *
 * @author Patricio
 */
public class QueueWithStacks<E> {

    Stack<E> stackNewest, stackOldest;

    public QueueWithStacks() {
        this.stackNewest = new Stack<>();
        this.stackOldest = new Stack<>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void add(E value) {
        /* Push onto stackNewest., which always has the newest
        * elements on top */
        stackNewest.push(value);
    }

    /* Move elements from stackNewest into stackOldest. This is
    * usually done so that we can do operations on stackOldest. */
    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public E peek() {
        shiftStacks(); // Ensure stackOldest has the current elements
        return stackOldest.peek(); // retrieve the oldest item
    }

    public E remove() {
        shiftStacks(); // Ensure stackOldest has the current elements
        return stackOldest.pop(); // pop the oldest item.
    }

}
