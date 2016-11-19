/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Arvore;

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
public class ArvoreBKTest {
    
    public ArvoreBKTest() {
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
     * Test of buscaPalavra method, of class ArvoreBK.
     */
    @Test
    public void testBuscaPalavra() {
        System.out.println("buscaPalavra");
        String palavraDesejada = "";
        int distanciaMaxima = 0;
        ArvoreBK instance = null;
        List<String> expResult = null;
        List<String> result = instance.buscaPalavra(palavraDesejada, distanciaMaxima);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaNo method, of class ArvoreBK.
     */
    @Test
    public void testAdicionaNo() {
        System.out.println("adicionaNo");
        String palavraDesejada = "";
        ArvoreBK instance = null;
        instance.adicionaNo(palavraDesejada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
