package com.lunoxx.tp_automatisation;

public class Calculator {
    public Calculator() {};
    
    public double add(Double a, Double b) {
        return a + b;
    }

    public double subtract(Double a, Double b) {
        return a - b;
    }

    public double multiply(Double a, Double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("La division par zéro n'est pas possible");
        }
        return a / b;
    } 
}
