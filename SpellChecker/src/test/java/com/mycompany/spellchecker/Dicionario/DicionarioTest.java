/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

import java.io.File;
import java.io.IOException;
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
     * Test of insercaoPorArquivo method, of class Dicionario.
     */
    @Test
    public void testInsercaoPorArquivo() throws IOException {
        String arquivoZipado = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
        String pastaSaida = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario";            
       
                
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
                
        int codigo = 000;
        Dicionario instance = new Dicionario(unZipper, codigo);
        boolean expResult = true;
        boolean result = instance.insercaoPorArquivo("casa");
        assertEquals(expResult, result);
        
        int codigo2 = 001;
        Dicionario instance2 = new Dicionario(unZipper, codigo2);
        boolean expResult2 = true;
        boolean result2 = instance2.insercaoPorArquivo("cada");
        assertEquals(expResult2, result2);
        
        int codigo3 = 002;
        Dicionario instance3 = new Dicionario(unZipper, codigo3);
        boolean expResult3 = false;
        boolean result3 = instance3.insercaoPorArquivo("caixa");
        assertEquals(expResult3, result3);
       
    }
    
}
