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

/**
 *
 * @author Patricio
 * @param <E>
 */
public class StackWithMin1<E extends Comparable<E>> implements StackInterface<E> {

    private int N;
    private Node<E> first;
    private E minElement;

    @Override
    public E peek() {
        if (first == null) {
            return null;
        }

        return first.element;

    }

    class Node<E> {

        protected E element;
        protected Node next;
        protected E minElement;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public E pop() {
        if (first == null) {
            return null;
        }
        E element = first.element;
        first = first.next;
        N--;
        return element;

    }

    @Override
    public void push(E element) {
        if (first == null) {
            minElement = element;
        }

        Node oldFirst = first;

        first = new Node();
        first.element = element;

        if (element.compareTo(minElement) < 0) {
            minElement = element;
        }
        first.minElement = element;

        first.next = oldFirst;

    }

    @Override
    public int size() {
        return N;
    }

    public E getMin() {
        if (first == null) {
            return null;
        }
        return first.minElement;
    }

}
