/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Arvore;

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
    @Test
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

    /**
     * Test of incluirFilho method, of class No.
     */
    @Test
    public void testIncluirFilho() {
        System.out.println("incluirFilho");
        int posicao = 0;
        No filho = null;
        No instance = null;
        instance.incluirFilho(posicao, filho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busca method, of class No.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        String palavraDesejada = "";
        int distanciaMaxima = 0;
        No instance = null;
        List<String> expResult = null;
        List<String> result = instance.busca(palavraDesejada, distanciaMaxima);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilhos method, of class No.
     */
    @Test
    public void testGetFilhos() {
        System.out.println("getFilhos");
        No instance = null;
        Map<Integer, No> expResult = null;
        Map<Integer, No> result = instance.getFilhos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilhos method, of class No.
     */
    @Test
    public void testSetFilhos() {
        System.out.println("setFilhos");
        Map<Integer, No> filhos = null;
        No instance = null;
        instance.setFilhos(filhos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class No.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        No instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class No.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        No instance = null;
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class No.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        No instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class No.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        No instance = null;
        String expResult = "";
        String result = instance.toString();
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

    /**
     * Test of getCodigoBusca method, of class No.
     */
    @Test
    public void testGetCodigoBusca() {
        System.out.println("getCodigoBusca");
        No instance = null;
        int expResult = 0;
        int result = instance.getCodigoBusca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoBusca method, of class No.
     */
    @Test
    public void testSetCodigoBusca() {
        System.out.println("setCodigoBusca");
        int codigoBusca = 0;
        No instance = null;
        instance.setCodigoBusca(codigoBusca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
