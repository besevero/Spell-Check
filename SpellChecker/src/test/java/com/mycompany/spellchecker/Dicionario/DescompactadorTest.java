/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

import java.io.File;
import java.util.ArrayList;
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
public class DescompactadorTest {
    
    public DescompactadorTest() {
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
        String arquivoZipado = ("src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip");
        String pastaSaida = ("src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario");        
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
        
        ArrayList<String> expResult = new ArrayList<>();
        String arquivo = ("src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary pt-br.dic");
        expResult.add(arquivo);
        ArrayList<String> result = unZipper.getCaminhos();
        assertEquals(expResult, result);
        
    }
    
}
