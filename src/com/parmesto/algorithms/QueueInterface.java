/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms;

/**
 *
 * @author Patricio
 */
interface QueueInterface<T> {

    public void enqueue(T element);

    public T dequeue();

    public boolean isEmpty();

    public int size();

}
