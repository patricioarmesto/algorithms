/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

import java.lang.reflect.Array;

/**
 *
 * @author Patricio
 * @param <E>
 */
public class FixedSizeStack<E> implements StackInterface<E> {

    public boolean isFull() {
        return (capacity == size);
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public E pop() {
        E element = stack[--size];
        stack[size] = null;
        return element;
    }

    @Override
    public void push(E element) {
        if (isFull()) return;
        stack[size++] = element;      
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return stack[size - 1];
    }

    private final E[] stack;

    protected int capacity;
    protected int size = 0;

    public FixedSizeStack(int capacity) {
        stack = (E[]) Array.newInstance(Object.class, capacity);
    }

}
