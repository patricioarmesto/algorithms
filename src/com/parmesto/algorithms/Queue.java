/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Patricio
 * @param <Item>
 */
public class Queue<Item> implements QueueInterface<Item>, Iterable<Item> {

    private Node first;
    private Node last;
    private int N;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public void enqueue(Item element) {
        Node oldLast = last;
        last = new Node();
        last.item = element;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;

    }

    @Override
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return item;

    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public int size() {
        return N;
    }

    class Node {

        Item item;
        Node next;
    }

    public static void main(String[] args) {
        // Create a queue and enqueue/dequeue strings.   
        Queue<String> q = new Queue<>();

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String item = input.next();
            if (!item.equals("-")) {
                q.enqueue(item);
            } else if (!q.isEmpty()) {
                System.out.println(q.dequeue() + " ");
            }
        }
        System.out.println("(" + q.size() + " left on queue)");
    }

}
