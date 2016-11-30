/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

import Calcuadora.CalculadoraDistancia;
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
        System.out.println("adicionaNoLista");
        List<String> nos = null;
        ArvoreBK instance = null;
        instance.adicionaNoLista(nos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class ArvoreBK.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        ArvoreBK instance = null;
        No expResult = null;
        No result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculadora method, of class ArvoreBK.
     */
    @Test
    public void testGetCalculadora() {
        System.out.println("getCalculadora");
        ArvoreBK instance = null;
        CalculadoraDistancia expResult = null;
        CalculadoraDistancia result = instance.getCalculadora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaiz method, of class ArvoreBK.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        No raiz = null;
        ArvoreBK instance = null;
        instance.setRaiz(raiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalculadora method, of class ArvoreBK.
     */
    @Test
    public void testSetCalculadora() {
        System.out.println("setCalculadora");
        CalculadoraDistancia calculadora = null;
        ArvoreBK instance = null;
        instance.setCalculadora(calculadora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ArvoreBK.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        ArvoreBK instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class ArvoreBK.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        ArvoreBK instance = null;
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ArvoreBK.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ArvoreBK instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArvoreBK.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArvoreBK instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
