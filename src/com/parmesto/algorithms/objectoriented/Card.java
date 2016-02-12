/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.objectoriented;

/**
 *
 * @author Patricio
 */
public abstract class Card {

    private boolean available = true;
    protected int faceValue;
    protected Suit suit;

    public Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public abstract int value();

    public Suit suit() {
        return suit;
    }

    /* Checks if the card is available to be given out to someone */
    public boolean isAvailable() {
        return available;
    }

    public void markUnavailable() {
        available = false;
    }

    public void markAvailable() {
        available = true;
    }

}
