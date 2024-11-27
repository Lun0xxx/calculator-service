package test.java.com.lunoxx.tp_automatisation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.java.com.lunoxx.tp_automatisation.Calculator;

public class CalculatorTest extends TestCase {

    Calculator c = new Calculator();

    public CalculatorTest( String testName )
    {
        super( testName );
    }

    public void AdditionTest(Double a, Double b) {
        Double additionResultat = c.addition(2, 3);
        assertEquals(5, additionResultat, "Le résultat de l'addition 2+3 doit être égal à 5");

        resultat = c.addition(15, 20);
        assertEquals(35, additionResultat, "Le résultat de l'addition 15 + 20 doit être égal à 35");
    }

    public void SoustractionTest(Double a, Double b) {
        Double soustractionResultat = c.soustraction(10, 5);
        assertEquals(5, soustractionResultat, "Le résultat de la soustraction 10 - 5 doit être égal à 5");

        soustractionResultat = c.soustraction(18, 2);
        assertEquals(16, soustractionResultat, "Le résultat de la soustraction 18 - 2 doit être égal à 16");
    }

    public void DivisionTest(Double a, Double b) {
        Double divisionResultat = c.division(10, 2);
        assertEquals(5, divisionResultat, "Le résultat de la division 10 / 2 doit être égal à 5");

        divisionResultat = c.division(16, 4);
        assertEquals(4, divisionResultat, "Le résultat de la division 16 / 4 doit être égal à 4");
    }

    public void MultiplicationTest(Double a, Double b) {
        Double multiplicationResultat = c.multiplication(10, 2);
        assertEquals(20, multiplicationResultat, "Le résultat de la multiplication 10 * 2 doit être égal à 20");

        multiplicationResultat = c.multiplication(7, 3);
        assertEquals(21, multiplicationResultat, "Le résultat de la multiplication 7 * 3 doit être égal à 21");
    }

    public void DivisionParZero() {
        assertThrows(ArithmeticException.class, () -> c.division(1, 0), "La division par zéro n'est pas possible");
    }
}
