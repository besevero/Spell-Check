/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.CalculadoraDistancia;
import Teclados.LeitorTeclados;
import Teclados.Teclado;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class CalculadoraDistanciaTest {
    
    public CalculadoraDistanciaTest() {
    }
    
       /**
     * Test of insereSelecao method, of class CalculadoraDistancia.
     */
    @Test
    public void testInsereSelecao() {
        LeitorTeclados leitor = new LeitorTeclados();
        ArrayList<Teclado> teclados = leitor.leitorTeclados();
        int selecaoLevenshtein = 000;
        int selecaoDamerau = 001;
        int selecaoErro = 002;
        CalculadoraDistancia instance = new CalculadoraDistancia(selecaoLevenshtein, teclados.get(0));
        CalculadoraDistancia instance2 = new CalculadoraDistancia(selecaoDamerau, teclados.get(0));
        CalculadoraDistancia instance3 = new CalculadoraDistancia(selecaoErro, teclados.get(0));
        assertEquals(true, instance.isValidador());
        assertEquals(true, instance2.isValidador());
        assertEquals(false, instance3.isValidador());
    }

    
    
}
