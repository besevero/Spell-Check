/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

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
public class DicionarioTest {
    
    public DicionarioTest() {
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
     * Test of insercao method, of class Dicionario.
     */
    @Test
    public void testInsercao() {
        String caminho = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary pt-br.dic";
        int codigo = 000;
        Dicionario instance = new Dicionario();
        instance.insercao(caminho, codigo);
    }
    
}
