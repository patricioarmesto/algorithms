/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.linkedlist;

import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Patricio
 * @param <Item>
 */
public class LinkedList<Item> implements Iterable<Item> {

    Item item;
    LinkedList<Item> next;

    public LinkedList(Item item, LinkedList<Item> next) {
        this.item = item;
        this.next = next;
    }

    public Item getItem() {
        return item;
    }

    public LinkedList<Item> getNext() {
        return next;
    }

    public static <Item> LinkedList<Item> reverse(final LinkedList<Item> original) {

        if (original == null) {
            throw new NullPointerException("Cannot reverse a null list");
        }
        if (original.getNext() == null) {
            return original;
        }

        final LinkedList<Item> next = original.next;
        original.next = null;

        final LinkedList<Item> othersReversed = reverse(next);
        next.next = original;
        return othersReversed;

    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Item current = item;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public void remove() {
        }

        @Override
        public Item next() {
            Item item = current;
            current = next.item;
            return item;
        }
    }
}
