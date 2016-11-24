package com.mycompany.spellchecker.Calculadora;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bernardo
 */
public class DistanciaLevenshtein extends Distancia{

    //faz o cálculo da distancia
   public double calcular(String palavraInserida, String palavraDicionario)
   {
       int tamanhoPalavraInserida = palavraInserida.length(),
           tamanhoPalavraDicionario = palavraDicionario.length(),
           custoDistanciaOperação = 0;
       
       double distancia[][] = new double[tamanhoPalavraInserida+1][tamanhoPalavraDicionario+1];
       
       //veriica se uma das palavras é nula
       if(tamanhoPalavraInserida == 0)
       {
           return tamanhoPalavraDicionario;
       }
       if(tamanhoPalavraDicionario == 0)
       {
           return tamanhoPalavraInserida;
       }
       //popula a matriz
       for(int i = 0 ; i<= tamanhoPalavraInserida ; i++)
       {
           distancia[i][0] = i;
       }
       for(int j = 0 ; j <= tamanhoPalavraDicionario ; j++)
       {
           distancia[0][j] = j;
       }
       for(int k = 1 ; k <= tamanhoPalavraInserida ; k++)
       {
           for(int l = 1 ; l<=tamanhoPalavraDicionario ; l++)
           {
               if(palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-1))
               {
                   custoDistanciaOperação = 0;
               }
               else
               {
                   custoDistanciaOperação = 1;
               }
               distancia[k][l] = Math.min(distancia[k-1][l] + 1,
                                          Math.min(distancia[k][l-1] + 1,
                                          distancia[k-1][l-1] + custoDistanciaOperação));
           }
           
       }
       return distancia[tamanhoPalavraInserida][tamanhoPalavraDicionario];
       
       
   }
        
}
