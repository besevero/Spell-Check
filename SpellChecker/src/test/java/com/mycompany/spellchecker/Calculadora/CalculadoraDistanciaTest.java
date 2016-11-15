/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class CalculadoraDistanciaTest {
    
    public CalculadoraDistanciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insereSelecao method, of class CalculadoraDistancia.
     */
    @Test
    public void testInsereSelecao() {
        int selecaoLevenshtein = 000;
        int selecaoDamerau = 001;
        int selecaoErro = 002;
        CalculadoraDistancia instance = new CalculadoraDistancia();
        assertEquals(0, instance.insereSelecao(selecaoLevenshtein));
        assertEquals(1, instance.insereSelecao(selecaoDamerau));
        assertEquals(-1, instance.insereSelecao(selecaoErro));
    }

    
    
}
