/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dicionario;

import Dicionario.Unzip;
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
        String arquivoZipado = new File("src\\main\\java\\dictionary_pt-br.zip").getAbsolutePath();
        String pastaSaida = new File ("src\\main\\java").getAbsolutePath();
        Unzip instance = new Unzip();
        ArrayList<String> expResult = new ArrayList<String>();
        String arquivo = new File("src\\main\\java\\dictionary pt-br.dic").getAbsolutePath();
        expResult.add(arquivo);
        ArrayList<String> result = instance.unZip(arquivoZipado, pastaSaida);
        assertEquals(expResult, result);
        
    }
    
}
