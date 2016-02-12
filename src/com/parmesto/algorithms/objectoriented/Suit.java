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
public enum Suit {
    
    Club(0), Diamond(1), Heart(2), Spade(3);
    
    private int value;

    private Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static Suit getSuiteFromValue(int value) {
        return null;
    }
}
