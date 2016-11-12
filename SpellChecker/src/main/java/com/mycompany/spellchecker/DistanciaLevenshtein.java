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
public class DistanciaLevenshtein extends InterfaceDistancia{

   public int calcular(String palavraInserida, String palavraDicionario)
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
       
              
       return Math.min(Math.min(calcular(palavraInseridaReduzida, palavraDicionario)+1,
                        calcular(palavraInserida, palavraDicionarioReduzida)+1),
                        calcular(palavraInseridaReduzida, palavraDicionarioReduzida) + distancia);
   }
        
}
