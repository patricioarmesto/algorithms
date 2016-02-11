/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

import java.util.ArrayList;

/**
 *
 * @author Patricio
 */
public class SetOfStacks<E> {

    ArrayList<FixedSizeStack<E>> stacks = new ArrayList<>();

    public void push(E element) {

        FixedSizeStack<E> last = getLastStack();

        if (last != null && !last.isFull()) {
            last.push(element);
        } else {
            FixedSizeStack<E> stack = new FixedSizeStack<>(10);
            stacks.add(stack);
            last = stack;
            last.push(element);
        }
    }

    public FixedSizeStack<E> getlastStack() {
        if (stacks.isEmpty()) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    public E pop() {

        FixedSizeStack<E> last = getLastStack();

        E element = last.pop();

        if (last.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }

        return element;
        
    }

    private FixedSizeStack<E> getLastStack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
