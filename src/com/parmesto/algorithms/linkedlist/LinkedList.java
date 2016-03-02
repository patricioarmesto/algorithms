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
package com.parmesto.algorithms.linkedlist;

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

    /**
     * Reverse List Order
     */
    public void reverseList() {

        if (head == null || head.next == null) {
            return;
        }
        Node reversedPart = null;
        Node current = head;
        tail = head;
        while (current != null) {
            Node next = current.next;
            current.next = reversedPart;
            reversedPart = current;
            current = next;
        }
        head = reversedPart;

    }

    /**
     * Determine if list has cycle
     *
     * @return
     */
    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
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

    @Override
    public String toString() {
        Node n = head;
        StringBuilder sb = new StringBuilder();
        while (n != null) {
            sb.append(n.item);
            if (n.next != null) {
                sb.append(" -> ");
            }
            n = n.next;
        }
        return sb.toString();
    }

    public void deleteDuplicates() {
        if (head == null || head.next == null) {
            return;
        }

        Node p = head;

        while (p != null && p.next != null) {
            if (p.item.equals(p.next.item)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

    }

    public boolean removeElement(E searchValue) {

        Node currNode = head;
        Node prevNode = null;
        boolean deletedANode = false;

        while (currNode != null) {
            if (currNode.item.equals(searchValue)) {
                if (currNode == head) {
                    head = head.next;
                } else {
                    prevNode.next = currNode.next;
                }

                deletedANode = true;
            } else {
                // only advance the prevNode when there's no match.
                prevNode = currNode;
            }
            currNode = currNode.next;
        }

        return deletedANode;

    }
}
