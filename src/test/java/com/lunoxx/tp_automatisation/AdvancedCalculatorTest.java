package com.lunoxx.tp_automatisation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdvancedCalculatorTest {

    AdvancedCalculator ac;

    @BeforeEach
    void setUp() {
        ac = new AdvancedCalculator();
    }

    @ParameterizedTest
    @CsvSource({"2.0, 3.0, 8.0", "5.0, 0.0, 1.0", "3.0, -2.0, 0.1111111111111111"})
    public void PowerTest(double base, double exponent, double expectedResult) {
        // Test de puissance
        double result = ac.power(base, exponent);
        assertEquals(expectedResult, result, "Le résultat de " + base + "^" + exponent + " doit être égal à " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"9.0, 3.0", "0.0, 0.0"})
    public void SqrtTest(double input, double expectedResult) {
        // Test de la racine carrée
        double result = ac.sqrt(input);
        assertEquals(expectedResult, result, "La racine carrée de " + input + " doit être égale à " + expectedResult);
    }

    @Test
    public void SqrtNegativeTest() {
        // Test de nombre négatif pour la racine carrée
        assertThrows(IllegalArgumentException.class, () -> ac.sqrt(-1.0),
                "La racine carrée d'un nombre négatif doit lever une exception");
    }

    @ParameterizedTest
    @CsvSource({"10.0, 3.0, 1.0", "25.0, 5.0, 0.0"})
    public void ModuloTest(double dividend, double divisor, double expectedResult) {
        // Test du modulo
        double result = ac.modulo(dividend, divisor);
        assertEquals(expectedResult, result, "Le résultat de " + dividend + " % " + divisor + " doit être égal à " + expectedResult);
    }

    @Test
    public void ModuloByZeroTest() {
        // Test du modulo par zéro
        assertThrows(IllegalArgumentException.class, () -> ac.modulo(10.0, 0.0),
                "Le modulo par zéro doit lever une exception");
    }

    @ParameterizedTest
    @CsvSource({"5.0, 5.0", "-7.0, 7.0", "0.0, 0.0"})
    public void AbsoluteValueTest(double input, double expectedResult) {
        // Test de la valeur absolue
        double result = ac.absolute(input);
        assertEquals(expectedResult, result, "La valeur absolue de " + input + " doit être égale à " + expectedResult);
    }
}
