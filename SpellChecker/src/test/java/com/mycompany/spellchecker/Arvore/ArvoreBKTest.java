/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Arvore;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import java.util.ArrayList;
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
     * Test of adicionaNo method, of class ArvoreBK.
     */
    @Test
    public void testAdicionaNo() {
        System.out.println("adicionaNo");
        String no = "";
        ArvoreBK instance = null;
        instance.adicionaNo(no);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaNoLista method, of class ArvoreBK.
     */
    @Test
    public void testAdicionaNoLista() {
        List<String> nos = new ArrayList<>();
        nos.add("casa"); nos.add("omelete");
        CalculadoraDistancia levenshtein = new CalculadoraDistancia(000);
        ArvoreBK instance = new ArvoreBK(levenshtein);
        instance.adicionaNoLista(nos);
        System.out.println(instance.getRaiz().filhosDistancia(0));
        assertEquals("casa", instance.getRaiz().getPalavra());        
    }
    
}
