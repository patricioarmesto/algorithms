/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
