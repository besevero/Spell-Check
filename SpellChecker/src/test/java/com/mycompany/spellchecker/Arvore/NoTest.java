/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Arvore;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import java.util.List;
import java.util.Map;
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
     * Test of buscaFilho method, of class No.
     */
    /*@Test
    public void testBuscaFilho() {
        System.out.println("buscaFilho");
        int posicao = 0;
        No instance = null;
        No expResult = null;
        No result = instance.buscaFilho(posicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of incluirFilho method, of class No.
     */
    @Test
    public void testIncluirFilho() {
        System.out.println("incluirFilho");
        int posicao = 0;
        No filho = new No("casa");
        
        No instance = null;
        
        instance.incluirFilho(posicao, filho);
        
        assertEquals("casa", instance.getFilhos().get(filho).getPalavra());
    }

    /**
     * Test of busca method, of class No.
     
    @Test
    public void testBusca() {
        System.out.println("busca");
        String palavraDesejada = "";
        int distanciaMaxima = 0;
        CalculadoraDistancia calculadora = null;
        No instance = null;
        List<String> expResult = null;
        List<String> result = instance.busca(palavraDesejada, distanciaMaxima, calculadora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
