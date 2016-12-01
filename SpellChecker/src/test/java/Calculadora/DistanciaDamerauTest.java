/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.DistanciaDamerau;
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
public class DistanciaDamerauTest {
    
    public DistanciaDamerauTest() {}
    
    /**
     * Test of calcular method, of class DistanciaDamerau.
     */
    @Test
    public void testCalcular() {
        DistanciaDamerau instance = new DistanciaDamerau();

          assertEquals(0, instance.calcular("casa", "casa"), 0.1);  //igual
          assertEquals(1, instance.calcular("casa", "casal"), 0.1); //Quase igual com uma letra a mais
          assertEquals(1, instance.calcular("casa", "cas"), 0.1);   //Quase igual com uma letra a menos
          assertEquals(4, instance.calcular("casa", "die"), 0.1);   //Completamente diferente com uma letra a menos
          assertEquals(4, instance.calcular("casa", "hoje"), 0.1);  //Completamente diferente com tamanho igual
          assertEquals(5, instance.calcular("casa", "ontem"), 0.1); //Completamente diferente com uma letra a mais
          assertEquals(4, instance.calcular("casa", ""), 0.1);      //Segunda palavra vazia; 
          assertEquals(4, instance.calcular("", "casa"), 0.1);      //Primeira palavra vazia;
    }
    
}
