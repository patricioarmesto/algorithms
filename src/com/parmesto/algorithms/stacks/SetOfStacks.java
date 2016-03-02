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
package com.parmesto.algorithms.stacks;

import java.util.ArrayList;

/**
 *
 * @author Patricio
 */
public class SetOfStacks<E> {

    ArrayList<FixedSizeStack<E>> stacks = new ArrayList<>();

    public void push(E element) {

        FixedSizeStack<E> last = getLastStack();

        if (last != null && !last.isFull()) {
            last.push(element);
        } else {
            FixedSizeStack<E> stack = new FixedSizeStack<>(10);
            stacks.add(stack);
            last = stack;
            last.push(element);
        }
    }

    public FixedSizeStack<E> getlastStack() {
        if (stacks.isEmpty()) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    public E pop() {

        FixedSizeStack<E> last = getLastStack();

        E element = last.pop();

        if (last.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }

        return element;
        
    }

    private FixedSizeStack<E> getLastStack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
