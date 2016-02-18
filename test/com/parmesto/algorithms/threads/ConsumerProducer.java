/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.threads;

/**
 *
 * @author Patricio
 */
public class ConsumerProducer {

    private int count;

    public synchronized void consume() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {
                //keep trying
            }
        }
        count--; //consumed
    }

    private synchronized void produce() {
        count++;
        notify(); // notify the consumer that count has been incremented.
    }
}
