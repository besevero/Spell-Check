/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corretor;

import Arvore.No;
import Calculadora.CalculadoraDistancia;
import Dicionario.Descompactador;
import Dicionario.Dicionario;
import Teclados.LeitorTeclados;
import Teclados.Teclado;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class CorretorTest {
    
    public CorretorTest() {
    }
    /**
     * Test of corrigir method, of class Corretor.
     */
    @Test
    public void testCorrigir() {
        LeitorTeclados leitorTeclado = new LeitorTeclados();
        ArrayList<Teclado> teclados = leitorTeclado.leitorTeclados();
        String arquivoZipado = new File("src\\main\\java\\dictionary_pt-br.zip").getAbsolutePath();
        String pastaSaida = new File("src\\main\\java").getAbsolutePath(); 
        Descompactador descompactador = new Descompactador(arquivoZipado, pastaSaida);
        CalculadoraDistancia calculadora = new CalculadoraDistancia(000, teclados.get(0));
        Dicionario dicionario = new Dicionario(descompactador, calculadora);
        Corretor corretor = new Corretor(dicionario.getArvoreDicionarioBK(), teclados.get(0));
        
       /* No noReferencial = corretor.getDicionario().getRaiz();
        ArrayList<String> result = corretor.getDicionario().getRaiz().busca("CASA", 1, calculadora);
        
        System.out.println(result.get(0));
        assertEquals(result.get(0), corretor.corrigir("kasa", noReferencial, 1));
        assertEquals(result.get(1), corretor.corrigir("asi", noReferencial, 1));
        assertEquals(result.get(2), corretor.corrigir("cas", noReferencial, 1));
        */
    }
    
}
