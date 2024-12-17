package com.lunoxx.tp_automatisation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"15.0, 20.0", "10.0, 5.0"})
    public void AddTest(Double a, Double b) {
        Double addResult = c.add(a, b);
        assertEquals(a + b, addResult, "Le résultat de l'addition doit être égal à a + b");
    }

    @ParameterizedTest
    @CsvSource({"18.0, 2.0", "20.0, 10.0"})
    public void SubtractTest(Double a, Double b) {
        Double subtractResult = c.subtract(a, b);
        assertEquals(a - b, subtractResult, "Le résultat de la soustraction doit être égal à a - b");
    }

    @ParameterizedTest
    @CsvSource({"16.0, 4.0", "20.0, 5.0"})
    public void DivideTest(Double a, Double b) {
        Double divideResult = c.divide(a, b);
        assertEquals(a / b, divideResult, "Le résultat de la division doit être égal à a / b");
    }

    @ParameterizedTest
    @CsvSource({"7.0, 3.0", "10.0, 5.0"})
    public void MultiplyTest(Double a, Double b) {
        Double multiplyResult = c.multiply(a, b);
        assertEquals(a * b, multiplyResult, "Le résultat de la multiplication doit être égal à a * b");
    }

    @ParameterizedTest
    @CsvSource({"1.0, 0.0"})
    public void DivideByZero(Double a, Double b) {
        assertThrows(ArithmeticException.class, () -> c.divide(a, b), 
                    "La division par zéro n'est pas possible");
    }
}
