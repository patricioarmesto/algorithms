/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Patricio
 * @param <Item>
 */
public class Stack<Item> implements StackInterface<Item>, Iterable<Item> {

    private Node first;
    private int N;

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public void push(Item element) {
        Node oldFirst = first;
        first = new Node();

        first.item = element;
        first.next = oldFirst;

        N++;

    }

    class Node {

        Item item;
        Node next;
    }

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

    public static void main(String[] args) {
        // Create a stack and push/pop strings as directed on StdIn.   
        Stack<String> s = new Stack<>();

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String item = input.next();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.println(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on stack)");
    }

}