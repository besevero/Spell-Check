/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Calculadora;

import com.mycompany.spellchecker.Calculadora.DistanciaLevenshtein;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author san
 */
public class DistanciaLevenshteinTest {
    
    public DistanciaLevenshteinTest() {
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
     * Test of calcular method, of class DistanciaLevenshtein.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        DistanciaLevenshtein instance = new DistanciaLevenshtein();
        
          assertEquals(0, instance.calcular("casa", "casa"));  //igual
          assertEquals(1, instance.calcular("casa", "casal")); //Quase igual com uma letra a mais
          assertEquals(1, instance.calcular("casa", "cas"));   //Quase igual com uma letra a menos
          assertEquals(4, instance.calcular("casa", "Rio"));   //Completamente diferente com uma letra a menos
          assertEquals(4, instance.calcular("casa", "hoje"));  //Completamente diferente com tamanho igual
          assertEquals(5, instance.calcular("casa", "ontem")); //Completamente diferente com uma letra a mais
          assertEquals(4, instance.calcular("casa", ""));      //Palavra dicionario vazia; 
          assertEquals(4, instance.calcular("", "casa"));      //Palavra inserida vazia;
          assertEquals(4, instance.calcular("1", "casa"));     
          assertEquals(12, instance.calcular("Hoje", "Rio de Janeiro")); //com espaço e letras repetidas
          assertEquals(12, instance.calcular("Rio de Janeiro", "Hoje")); //com espaço e letras repetidas
    }
    
}
