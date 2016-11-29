/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Corretor;

import com.mycompany.spellchecker.Arvore.No;
import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import com.mycompany.spellchecker.Dicionario.Descompactador;
import com.mycompany.spellchecker.Dicionario.Dicionario;
import java.io.File;
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
        String arquivoZipado = new File("src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip").getAbsolutePath();
        String pastaSaida = new File("src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario").getAbsolutePath();            
                       
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
        CalculadoraDistancia levenshtein = new CalculadoraDistancia(000);
        
        Dicionario dicionario = new Dicionario(unZipper, levenshtein);
        dicionario.insercaoPorArquivo();
        No noAuxiliar = dicionario.getArvoreDicionarioBK().getRaiz();
        
        System.out.println(dicionario.getArvoreDicionarioBK().getRaiz());
        Corretor instance = new Corretor(dicionario);

        String result = instance.corretorPalavras("kasa", noAuxiliar, 1);
        
        assertEquals("casa", result);
    }

   
}
