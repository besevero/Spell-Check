/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author labccet
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

    @Test
    public void testSomeMethod() {
        
        CalculadoraDistancia instanceDamerau = new CalculadoraDistancia(001);
        int dist = instanceDamerau.getTipoEscolhido().calcular("casa", "casal");
        
        CalculadoraDistancia instanceLevenshtein = new CalculadoraDistancia(000);
        int dist2 = instanceLevenshtein.getTipoEscolhido().calcular("casa", "casal");
                
        assertEquals(1, dist); //testa se está chamando a classe da Damerau
        assertEquals(1, dist2); // testa se está chamando a classe de Levenshtein
    }
    
}
