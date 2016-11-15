/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

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
    public void testInsercaoPorArquivo() {
        
        /*String arquivoZipado = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
        String pastaSaida = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario";            
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
        
        ArrayList<String> caminhosDosArquivos = unZipper.caminhos;
        int codigo = 000;
        Dicionario instance = new Dicionario();
        instance.insercaoPorArquivo(caminhosDosArquivos, codigo);*/
        
        String arquivoZipado2 = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
        String pastaSaida2 = "C:\\Users\\Bernardo\\Documents\\GitHub\\Spell-Check\\SpellChecker\\src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario";            
        Descompactador unZipper2 = new Descompactador(arquivoZipado2, pastaSaida2);
        ArrayList<String> caminhosDosArquivos = unZipper2.caminhos;
        int codigo2 = 001;
        Dicionario instance2 = new Dicionario();
        instance2.insercaoPorArquivo(caminhosDosArquivos, codigo2);
    }
    
}
