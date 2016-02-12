package com.parmesto.algorithms.linkedlist;

import com.parmesto.algorithms.Queue;
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node tail;

    private class Node {

        protected E item;
        protected Node next;

        public Node(E item) {
            this.item = item;
        }

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return item.toString();
        }
    }

    public LinkedList(E element) {

        this.head = new Node(element);
        tail = head;
    }

    public void add(E element) {
        Node newNode = new Node(element);

        tail.next = newNode;
        tail = newNode;
    }

    public E findMiddle() {

        Node current = head;
        int length = 0;

        Node middle = head;

        while (current != null) {
            length++;

            if (length % 2 == 0) {
                middle = middle.next;
            }

            current = current.next;
        }

        return middle.getItem();
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {

        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {
        }

        @Override
        public E next() {
            E item = current.item;
            current = current.next;
            return item;
        }
    }

}
