/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker;

/**
 *
 * @author san
 */
public class DistanciaDamerau extends InterfaceDistancia{
    
    //Funçao que calcula a distancia de Damerau-Levenshtein
    public int calcular(String palavraInserida, String palavraDicionario)
   {
       //Variaveis que definem o tamanho da matriz
       int tamanhoPalavraInserida = palavraInserida.length(),
           tamanhoPalavraDicionario = palavraDicionario.length();
       /**
        * Variável da Matriz
        * Exemplo:
        * 0 1 2 3 4
        * 1 - - - -
        * 2 - - - -
        */
       int[][] distancia = new int[tamanhoPalavraInserida+1][tamanhoPalavraDicionario+1];
       
       //Define o valor que irá popular a tabela
       int custo =0;
       
       //cria a matriz com a tabela de distancia
        
       for(int i = 0; i <= tamanhoPalavraInserida; i++)
       {
           distancia[i][0] = i;
       }
       for(int j = 0; j <= tamanhoPalavraInserida; j++)
       {
           distancia[0][j] = j;
       }
       
       //popula a tabela e faz a verificação da distancia de cada letra
       
       for(int k = 1; k <= tamanhoPalavraInserida;  k++)
       {
           for(int l = 1; l <= tamanhoPalavraDicionario; l++)
           {
               if(palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-1))
               {
                   custo = 0;
               }
               else
               {
                   custo = 1;
               }
               distancia[k][l] = Math.min(distancia[k-1][l]+1,
                       Math.min(distancia[k][l-1]+1, distancia[k-1][l-1]+custo));
               if(k > 1 && l > 1
                  && palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-2)
                  && palavraInserida.charAt(l-2) == palavraDicionario.charAt(k-1))
               {
                  distancia[k][l] = Math.min(distancia[k][l], distancia[k-2][l-2]+custo);
               }
           }
           
       }
       
       return distancia[tamanhoPalavraInserida][tamanhoPalavraDicionario];
   }        
}
