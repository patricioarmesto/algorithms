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
public class Dijkstra {

    public static Double calc(String expr) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {

            String s = String.valueOf(expr.charAt(i));

            if (s.equals("("))               ; else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else if (s.equals(" ")) {
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        return (vals.pop());
    }
}
