/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Teclados;

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
public class TecladoTest {
    
    public TecladoTest() {
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
     * Test of preparaDistanciasNeutro method, of class Teclado.
     */
    
    @Test
    public void testPreparaDistanciasNeutro() {
        Teclado instance = new Teclado();
        double[][] result = instance.preparaDistanciasNeutro();
        assertEquals(0, result[0][0], 0.1);
        assertEquals(0, result[1][1], 0.1);
        assertEquals(0, result[25][25], 0.1);
        assertEquals(1, result[0][1], 0.1);
        assertEquals(1, result[1][0], 0.1);
        assertEquals(1, result[20][25], 0.1);
      
    }

    /**
     * Test of preparaMatrizAlfabetoTeclado method, of class Teclado.
     */
    @Test
    public void testPreparaMatrizAlfabetoTeclado() {
        Teclado instance = new Teclado("QWERTY", "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM", 0.5, 0.5);
        char[][] result = instance.preparaMatrizAlfabetoTeclado();
        assertEquals('Q', result[0][0]);
        assertEquals('W', result[0][1]);
        assertEquals('A', result[1][0]);
        assertEquals('L', result[1][8]);
        assertEquals('Z', result[2][0]);
        assertEquals('M', result[2][6]);
    }

    /**
     * Test of preparaDistancias method, of class Teclado.
     */
    Teclado instance2 = new Teclado("QUERTY", "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM", 0.5, 0.5);
    double[][] result = instance2.preparaDistancias();
    @Test
    public void testPreparaDistancias() {
    
        for(int i = 0; i<26; i++){
            for(int j = 0; j<26 ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
        assertEquals(0, result[0][0], 0.1);
        assertEquals(0, result[1][1], 0.1);
        assertEquals(0, result[25][25], 0.1);
        assertEquals(dist(2, 2.5), result[0][1], 0.1);
        assertEquals(dist(1, 1), result[0][2], 0.1);
        

    }

    /**
     * Test of obtemDistanciaNominal method, of class Teclado.
     */
    @Test
    public void testObtemDistanciaNominal() {
        assertEquals(1, instance2.obtemDistanciaNominal('Q', 'W'), 0.1);
        assertEquals(1, instance2.obtemDistanciaNominal('W', 'Q'), 0.001);
        assertEquals(2, instance2.obtemDistanciaNominal('Q', 'E'), 0.001);
        assertEquals(2, instance2.obtemDistanciaNominal('E', 'Q'), 0.001);
        assertEquals(9, instance2.obtemDistanciaNominal('Q', 'P'), 0.001);
        assertEquals(9, instance2.obtemDistanciaNominal('P', 'Q'), 0.001);
        assertEquals(1, instance2.obtemDistanciaNominal('Q', 'W'), 0.001);
        
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('Q', 'A'), 0.1);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('A', 'Q'), 0.1);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('Q', 'S'), 0.1);
        assertEquals(dist(1.5, 1), instance2.obtemDistanciaNominal('S', 'Q'), 0.1);
        assertEquals(dist(7.5, 0.5), instance2.obtemDistanciaNominal('Q', 'L'), 0.1);
        /*assertEquals(dist(7.5, 1), instance2.obtemDistanciaNominal('L', 'Q'), 0.01);
        assertEquals(dist(1.0, 2), instance2.obtemDistanciaNominal('q', 'z'), 0.01);
        assertEquals(dist(1.0, 2), instance2.obtemDistanciaNominal('z', 'q'), 0.01);
        assertEquals(dist(2.0, 2), instance2.obtemDistanciaNominal('q', 'x'), 0.01);
        assertEquals(dist(2.0, 2), instance2.obtemDistanciaNominal('x', 'q'), 0.01);
        assertEquals(dist(7.0, 2), instance2.obtemDistanciaNominal('q', 'm'), 0.01);
        assertEquals(dist(7.0, 2), instance2.obtemDistanciaNominal('m', 'q'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('w', 'a'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('a', 'w'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('w', 's'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('s', 'w'), 0.01);
        assertEquals(dist(0.0, 2), instance2.obtemDistanciaNominal('w', 'z'), 0.01);
        assertEquals(dist(0.0, 2), instance2.obtemDistanciaNominal('z', 'w'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('a', 'z'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('z', 'a'), 0.01);
        assertEquals(dist(8.0, 2), instance2.obtemDistanciaNominal('p', 'z'), 0.01);
        assertEquals(dist(8.0, 2), instance2.obtemDistanciaNominal('z', 'p'), 0.01);
        assertEquals(dist(0.5, 1), instance2.obtemDistanciaNominal('g', 't'), 0.01);
        assertEquals(dist(1.5, 1), instance2.obtemDistanciaNominal('a', 'e'), 0.01);*/
        //assertEquals(dist(1.0, 0), instance2.obtemDistanciaNominal('b', 'v'), 0.01);    
    }
    private double dist(double width, double height)
    {
		return Math.sqrt(width * width + height * height);
    }
}
