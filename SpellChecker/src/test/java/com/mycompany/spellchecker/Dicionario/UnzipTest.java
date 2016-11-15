/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

import java.io.File;
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
public class UnzipTest {
    
    public UnzipTest() {
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
     * Test of unZip method, of class Unzip.
     */
    @Test
    public void testUnZip() {
        System.out.println("unZip");
        String arquivoZipado = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
        String pastaSaida = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario";
        Unzip instance = new Unzip();
        ArrayList<String> expResult = new ArrayList<String>();
        String arquivo = ("C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary pt-br.dic");
        expResult.add(arquivo);
        ArrayList<String> result = instance.unZip(arquivoZipado, pastaSaida);
        assertEquals(expResult, result);
    }
    
}
