/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Arvore;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import java.util.List;
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
public class NoTest {
    
    public NoTest() {
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
     * Test of filhosDistancia method, of class No.
     */
    @Test
    public void testFilhosDistancia() {
        System.out.println("filhosDistancia");
        int distancia = 0;
        No instance = null;
        No expResult = null;
        No result = instance.filhosDistancia(distancia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaFilho method, of class No.
     */
    @Test
    public void testAdicionaFilho() {
        System.out.println("adicionaFilho");
        double posicao = 0.0;
        No noFilho = null;
        No instance = null;
        instance.adicionaFilho(posicao, noFilho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class No.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        String no = "";
        int distanciaMaxima = 0;
        CalculadoraDistancia calculadora = null;
        No instance = null;
        List<String> expResult = null;
        List<String> result = instance.busca(no, distanciaMaxima, calculadora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaPalavras method, of class No.
     */
    @Test
    public void testComparaPalavras() {
        System.out.println("comparaPalavras");
        No no = null;
        No instance = null;
        boolean expResult = false;
        boolean result = instance.comparaPalavras(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPalavra method, of class No.
     */
    @Test
    public void testGetPalavra() {
        System.out.println("getPalavra");
        No instance = null;
        String expResult = "";
        String result = instance.getPalavra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPalavra method, of class No.
     */
    @Test
    public void testSetPalavra() {
        System.out.println("setPalavra");
        String palavra = "";
        No instance = null;
        instance.setPalavra(palavra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
