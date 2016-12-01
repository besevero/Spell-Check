/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclados;

import Teclados.LeitorTeclados;
import Teclados.Teclado;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class TecladoTest {
    
    public TecladoTest() {
    }
    /**
     * Test of preparaMatrizAlfabetoTeclado method, of class Teclado.
     */
    @Test
    public void testPreparaMatrizAlfabetoTeclado() {
     
        LeitorTeclados instance = new LeitorTeclados();
        ArrayList<Teclado> teclados = instance.leitorTeclados();
        char[][] result = teclados.get(0).preparaMatrizAlfabetoTeclado();
        assertEquals('Q', result[0][0]);
        assertEquals('W', result[0][1]);
        assertEquals('A', result[1][0]);
        assertEquals('L', result[1][8]);
        assertEquals('Z', result[2][0]);
        assertEquals('M', result[2][6]);
        char[][] result2 = teclados.get(1).preparaMatrizAlfabetoTeclado();
        assertEquals('Q', result2[0][0]);
        assertEquals('W', result2[0][1]);
        assertEquals('E', result2[0][2]);
        assertEquals('R', result2[0][3]);
        assertEquals('T', result2[0][4]);
        assertEquals('Z', result2[0][5]);
        char[][] result3 = teclados.get(3).preparaMatrizAlfabetoTeclado();
        assertEquals('Q', result3[2][0]);
        assertEquals('J', result3[2][1]);
        assertEquals('K', result3[2][2]);
        assertEquals('X', result3[2][3]);
        assertEquals('B', result3[2][4]);
        assertEquals('M', result3[2][5]);
        
    }

    /**
     * Test of obtemDistanciaNominal method, of class Teclado.
     */
    @Test
    public void testObtemDistanciaNominal() {
        //teste Qwerty
        LeitorTeclados instance2 = new LeitorTeclados();
        ArrayList<Teclado> teclados = instance2.leitorTeclados();
       //letras na primeira linha
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('Q', 'W'), 0.1);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('W', 'Q'), 0.1);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('Q', 'E'), 0.1);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('E', 'Q'), 0.1);
        assertEquals(9, teclados.get(0).obtemDistanciaNominal('Q', 'P'), 0.1);
        assertEquals(9, teclados.get(0).obtemDistanciaNominal('P', 'Q'), 0.1);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('Q', 'W'), 0.1);
       //letras na segunda linha 
        assertEquals(4, teclados.get(0).obtemDistanciaNominal('A', 'G'), 0.1);
        assertEquals(4, teclados.get(0).obtemDistanciaNominal('G', 'A'), 0.1);
        //letras na terceira linha
        assertEquals(6, teclados.get(0).obtemDistanciaNominal('Z', 'M'), 0.1);
        assertEquals(6, teclados.get(0).obtemDistanciaNominal('M', 'Z'), 0.1);
        //letras na iguais
        assertEquals(0, teclados.get(0).obtemDistanciaNominal('Q', 'Q'), 0.1);
        assertEquals(0, teclados.get(0).obtemDistanciaNominal('F', 'F'), 0.1);
        //letras na mesma coluna
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('Q', 'A'), 0.1);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('A', 'Q'), 0.1);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('Q', 'Z'), 0.01);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('Z', 'Q'), 0.01);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('E', 'D'), 0.01);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('D', 'E'), 0.01);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('T', 'G'), 0.01);
        assertEquals(1, teclados.get(0).obtemDistanciaNominal('G', 'T'), 0.01);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('T', 'B'), 0.01);
        assertEquals(2, teclados.get(0).obtemDistanciaNominal('B', 'T'), 0.01);
        //letras "aletórias"
        assertEquals(dist(1, 1), teclados.get(0).obtemDistanciaNominal('P', 'L'), 0.1);
        assertEquals(dist(1, 1), teclados.get(0).obtemDistanciaNominal('L', 'P'), 0.1);
        assertEquals(dist(1, 1), teclados.get(0).obtemDistanciaNominal('Q', 'S'), 0.1);
        assertEquals(dist(1, 1), teclados.get(0).obtemDistanciaNominal('S', 'Q'), 0.1);
        assertEquals(dist(1, 1), teclados.get(0).obtemDistanciaNominal('Q', 'S'), 0.1);
        assertEquals(dist(2, 2), teclados.get(0).obtemDistanciaNominal('R', 'N'), 0.1);
        assertEquals(dist(2, 3), teclados.get(0).obtemDistanciaNominal('E', 'N'), 0.1);
        assertEquals(dist(1, 3), teclados.get(0).obtemDistanciaNominal('Y', 'D'), 0.1);
        
        //Teste DVORAK
      
        //letras na primeira linha
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('P', 'Y'), 0.1);
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('Y', 'P'), 0.1);
        assertEquals(2, teclados.get(3).obtemDistanciaNominal('P', 'F'), 0.1);
        assertEquals(2, teclados.get(3).obtemDistanciaNominal('F', 'P'), 0.1);
        assertEquals(6, teclados.get(3).obtemDistanciaNominal('P', 'L'), 0.1);
        assertEquals(6, teclados.get(3).obtemDistanciaNominal('L', 'P'), 0.1);
        
       //letras na segunda linha 
        assertEquals(9, teclados.get(3).obtemDistanciaNominal('A', 'S'), 0.1);
        assertEquals(9, teclados.get(3).obtemDistanciaNominal('S', 'A'), 0.1);
        //letras na terceira linha
        assertEquals(3, teclados.get(3).obtemDistanciaNominal('K', 'M'), 0.1);
        assertEquals(3, teclados.get(3).obtemDistanciaNominal('M', 'K'), 0.1);
        //letras na iguais
        assertEquals(0, teclados.get(3).obtemDistanciaNominal('Q', 'Q'), 0.1);
        assertEquals(0, teclados.get(3).obtemDistanciaNominal('F', 'F'), 0.1);
        
       //letras na mesma coluna
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('Q', 'A'), 0.1);
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('A', 'Q'), 0.1);
        assertEquals(2, teclados.get(3).obtemDistanciaNominal('P', 'Q'), 0.01);
        assertEquals(2, teclados.get(3).obtemDistanciaNominal('Q', 'P'), 0.01);
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('L', 'H'), 0.01);
        assertEquals(1, teclados.get(3).obtemDistanciaNominal('H', 'L'), 0.01);
        
        //letras "aletórias"
        assertEquals(dist(1, 1), teclados.get(3).obtemDistanciaNominal('P', 'O'), 0.1);
        assertEquals(dist(1, 1), teclados.get(3).obtemDistanciaNominal('O', 'P'), 0.1);
        assertEquals(dist(8, 1), teclados.get(3).obtemDistanciaNominal('Z', 'A'), 0.1);
        assertEquals(dist(8, 1), teclados.get(3).obtemDistanciaNominal('A', 'Z'), 0.1);
                
         /*  <line>PYFGCRL</line>
<line offset="-3">AOEUIDHTNS</line>
<line offset="1">QJKXBMWVZ</line>*/
    }
    private double dist(double width, double height)
    {
		return Math.sqrt(width * width + height * height);
    }
}
