/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parmesto.algorithms.stacks;

/**
 *
 * @author Patricio
 */
public interface StackInterface<T> {

    public boolean isEmpty();

    public T pop();

    public void push(T element);
    
    public int size();
    
    
}
