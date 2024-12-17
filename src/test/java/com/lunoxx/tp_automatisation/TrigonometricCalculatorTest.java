package com.lunoxx.tp_automatisation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TrigonometricCalculatorTest {

    TrigonometricCalculator tc;

    @BeforeEach
    void setUp() {
        tc = new TrigonometricCalculator();
    }

    @ParameterizedTest
    @CsvSource({"0.0, 0.0", "1.570795, 1.0", "3.14159, 2.65358979335273E-6"})
    public void SineTest(double angle, double expectedResult) {
        // Test de la fonction sinus
        double result = tc.sine(angle);
        assertEquals(expectedResult, result, 1e-6, "Le sinus de " + angle + " radians doit être égal à " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"0.0, 1.0", "1.570795, 1.3267948966775328E-6", "3.14159, -1.0"})
    public void CosineTest(double angle, double expectedResult) {
        // Test de la fonction cosinus
        double result = tc.cosine(angle);
        assertEquals(expectedResult, result, 1e-6, "Le cosinus de " + angle + " radians doit être égal à " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"0.0, 0.0", "0.7853975, 0.9999986732059836", "1.570795, 753695.9951408089"})
    public void TangentTest(double angle, double expectedResult) {
        // Test de la fonction tangente
        double result = tc.tangent(angle);
        assertEquals(expectedResult, result, 1e-6, "La tangente de " + angle + " radians doit être égale à " + expectedResult);
    }

    @Test
    public void TangentTestIndefinite() {
        // Test de la tangente indéfinie (π/2)
        assertThrows(ArithmeticException.class, () -> tc.tangent(Math.PI / 2),
                "La tangente de π/2 radians doit lever une exception car elle est indéfinie");
    }

    @ParameterizedTest
    @CsvSource({"180.0, 3.1400000000000006", "90.0, 1.5700000000000003", "0.0, 0.0"})
    public void ToRadiantTest(double degrees, double expectedResult) {
        // Test de la conversion degrés -> radians
        double result = tc.toRadiant(degrees);
        assertEquals(expectedResult, result, 1e-5, degrees + " degrés doivent être égaux à " + expectedResult + " radians");
    }
}
