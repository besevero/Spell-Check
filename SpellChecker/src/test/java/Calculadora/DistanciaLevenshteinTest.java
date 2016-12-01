/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.DistanciaLevenshtein;
import Teclados.LeitorTeclados;
import Teclados.Teclado;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author san
 */
public class DistanciaLevenshteinTest {
    
    public DistanciaLevenshteinTest() {
    }
    
    /**
     * Test of calcular method, of class DistanciaLevenshtein.
     */
    @Test
    public void testCalcular() {
        LeitorTeclados lista = new LeitorTeclados();
        ArrayList<Teclado> teclados = lista.leitorTeclados();
        DistanciaLevenshtein instance = new DistanciaLevenshtein(teclados.get(0));
        
          assertEquals(0, instance.calcular("casa", "casa"), 0.1);  //igual
          assertEquals(1, instance.calcular("casa", "casal"), 0.1); //Quase igual com uma letra a mais
          assertEquals(1, instance.calcular("casa", "cas"), 0.1);   //Quase igual com uma letra a menos
        //assertEquals(4, instance.calcular("casa", "rio"), 0.1);   //Completamente diferente com uma letra a menos
        //assertEquals(4, instance.calcular("casa", "hoje"), 0.1);  //Completamente diferente com tamanho igual
       // assertEquals(5, instance.calcular("casa", "ontem"), 0.1); //Completamente diferente com uma letra a mais
          assertEquals(4, instance.calcular("casa", ""), 0.1);      //Palavra dicionario vazia; 
          assertEquals(4, instance.calcular("", "casa"), 0.1);      //Palavra inserida vazia;
   
   
    }
    
}
