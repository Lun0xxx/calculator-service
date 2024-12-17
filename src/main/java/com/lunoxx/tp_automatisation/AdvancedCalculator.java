package com.lunoxx.tp_automatisation;

public class AdvancedCalculator {
    public AdvancedCalculator() {};

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("sqrt() : Le nombre ne peut pas être inférieur à 0");
        }

        return Math.sqrt(number);
    }

    public double modulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("modulo() : b ne peut pas être égal à 0");
        }

        return a%b;
    }

    public double absolute(double a) {
        return Math.abs(a);
    }
}
