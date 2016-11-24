/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Corretor;

import com.mycompany.spellchecker.Arvore.No;
import com.mycompany.spellchecker.Dicionario.Descompactador;
import com.mycompany.spellchecker.Dicionario.Dicionario;
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
public class CorretorTest {
    
    public CorretorTest() {
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
     * Test of corretorPalavras method, of class Corretor.
     */
    @Test
    public void testCorretorPalavras() {
        String arquivoZipado = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
        String pastaSaida = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario";            
                       
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
        
        String palavraInserida = "caza";
        Dicionario dicionario = new Dicionario(unZipper, 000);
        dicionario.insercaoPorArquivo(palavraInserida);
        
        
        No noAuxiliar = dicionario.getArvoreDicionarioBK().getRaiz();
        int precisao = 5000;
                
        Corretor instance = new Corretor(dicionario);

        String expResult = "casa";
        String result = instance.corretorPalavras(palavraInserida, noAuxiliar, precisao);
        
        assertEquals(expResult, result);
    }
    
}
