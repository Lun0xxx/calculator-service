package com.lunoxx.tp_automatisation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class AppTest {

    @BeforeEach
    public void setUp() {
        System.out.println("--- Début du test ---");
    }

    @AfterEach
    public void setDown() {
        System.out.println("--- Fin du test ---");
    }

    @Test
    public void testApp() {
        assertTrue(true, "L'expression devrait être vraie");
    }
}
