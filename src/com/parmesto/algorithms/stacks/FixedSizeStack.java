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
