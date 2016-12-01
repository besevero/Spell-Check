/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dicionario;

import Dicionario.Dicionario;
import Dicionario.Descompactador;
import Arvore.ArvoreBK;
import Calculadora.CalculadoraDistancia;
import Teclados.LeitorTeclados;
import Teclados.Teclado;
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
    
    /**
     * Test of insercaoPorArquivo method, of class Dicionario.
     */
    @Test
    public void testInsercaoPorArquivo() throws IOException {
        String arquivoZipado = new File("src\\main\\java\\dictionary_pt-br.zip").getAbsolutePath();
        String pastaSaida = new File("src\\main\\java").getAbsolutePath();            
       LeitorTeclados leitor = new LeitorTeclados();
        ArrayList<Teclado> teclados = leitor.leitorTeclados();
                
        Descompactador unZipper = new Descompactador(arquivoZipado, pastaSaida);
        
        /*CalculadoraDistancia levenshtein = new CalculadoraDistancia(000, teclados.get(0));
        Dicionario instance = new Dicionario(unZipper, levenshtein);
        boolean expResult = true;
        boolean result = instance.insercaoPorArquivo();
        assertEquals(expResult, result);*/
        
        CalculadoraDistancia damerau = new CalculadoraDistancia(001, teclados.get(0));
        Dicionario instance2 = new Dicionario(unZipper, damerau);
        boolean expResult2 = true;
        boolean result2 = instance2.insercaoPorArquivo();
        assertEquals(expResult2, result2);
        
        CalculadoraDistancia erro = new CalculadoraDistancia(385, teclados.get(0));
        Dicionario instance3 = new Dicionario(unZipper, erro);
        boolean expResult3 = false;
        boolean result3 = instance3.insercaoPorArquivo();
        assertEquals(expResult3, result3);
    }
}
