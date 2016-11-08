/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker;

/**
 *
 * @author Bernardo
 */
public class Distancia {

   private final int DISTANCIA_LEVENSHTEIN = 0;
   private final int DISTANCIA_DEMERAU_LEVENSHTEIN = 1;
   
   
   
   public int calculaLevenshtein(String palavraInserida, String palavraDicionario)
   {
       
       int distancia;
       int tamanhoPalavraInserida = palavraInserida.length();
       int tamanhoPalavraDicionario = palavraDicionario.length();
       
       //Caso as strings estejam vazias
       
       if(tamanhoPalavraInserida == 0)
       {
           return 0;
       }
       if(tamanhoPalavraDicionario == 0)
       {
           return 0;
       }
       
        //Verifica se o último caracter das palavras são iguais
       
       if(palavraInserida.charAt(tamanhoPalavraInserida-1) == palavraDicionario.charAt(tamanhoPalavraDicionario-1))
       {
           distancia = 0;
       }
       else
       {
           distancia = 1;
       }
       
       String palavraInseridaReduzida = palavraInserida.substring(0, tamanhoPalavraInserida-1);
       String palavraDicionarioReduzida = palavraDicionario.substring(0, tamanhoPalavraDicionario-1);
       //Loop recursivo para encontrar a distancia
       
              
       return Math.min(Math.min(calculaLevenshtein(palavraInseridaReduzida, palavraDicionario)+1,
                        calculaLevenshtein(palavraInserida, palavraDicionarioReduzida)+1),
                        calculaLevenshtein(palavraInseridaReduzida, palavraDicionarioReduzida) + distancia);
   }
   
   
   public int calculaDemerauLevenshtein(String palavraInserida, String palavraDicionario)
   {
       int tamanhoPalavraInserida = palavraInserida.length(),
           tamanhoPalavraDicionario = palavraDicionario.length();
       int[][] distancia = new int[tamanhoPalavraInserida+1][tamanhoPalavraDicionario+1];
       int custo =0;
       
       //cria a tabela de distancia
        
       for(int i = 0; i <= tamanhoPalavraInserida; i++)
       {
           distancia[i][0] = i;
       }
       for(int j = 0; j <= tamanhoPalavraInserida; j++)
       {
           distancia[0][j] = j;
       }
       
       //popula a tabela verificando a distancia de cada letra
       
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
                  && palavraInserida.charAt(l-1) == palavraDicionario.charAt(k-2))
                   distancia[k][l] = Math.min(distancia[k][l], distancia[k][l]+custo);
           }
           
       }
       
       return distancia[tamanhoPalavraInserida][tamanhoPalavraDicionario];
   }        
          
}
