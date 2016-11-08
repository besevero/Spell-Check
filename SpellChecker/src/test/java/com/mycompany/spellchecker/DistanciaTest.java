/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker;

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
public class DistanciaTest {
    
    public DistanciaTest() {
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
     * Test of calculaLevenshtein method, of class Distancia.
     */
    @Test
    public void testCalculaLevenshtein() {
        System.out.println("calculaLevenshtein");
        String palavraInserida = "casa";
        String palavraDicionario = "casaco";
        Distancia instance = new Distancia();
        int expResult = 2;
        int result = instance.calculaLevenshtein(palavraInserida, palavraDicionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculaDemerauLevenshtein method, of class Distancia.
     */
    @Test
    public void testCalculaDemerauLevenshtein() {
        System.out.println("calculaDemerauLevenshtein");
        Distancia instance = new Distancia();
        String palavraInserida = "casal";
        String palavraDicionario = "casaco";
        int expResult = 2;
        int result = instance.calculaDemerauLevenshtein(palavraInserida, palavraDicionario);
        assertEquals(expResult, result);
        
    }
    
}
