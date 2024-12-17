package com.lunoxx.tp_automatisation;

public class TrigonometricCalculator {
    public TrigonometricCalculator() {};

    public double sine(double a) {
        return Math.sin(a);
    }

    public double cosine(double a) {
        return Math.cos(a);
    }

    public double tangent(double angle) {
        if (angle == Math.PI / 2 || angle == -Math.PI / 2 || angle == 3 * Math.PI / 2) {
            throw new ArithmeticException("La tangente de " + angle + " radians est indéfinie");
        }
        return Math.tan(angle);
    }
    

    public double toRadiant(double degrees) {
        return degrees * (3.14 / 180);
    }
}
