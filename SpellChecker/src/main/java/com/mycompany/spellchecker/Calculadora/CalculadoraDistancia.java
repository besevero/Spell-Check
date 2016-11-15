/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Calculadora;

import lombok.Data;
import lombok.Getter;

/**
 *
 * @author san
 */
@Data public class CalculadoraDistancia {
   
   private final int DISTANCIA_LEVENSHTEIN = 000;
   private final int DISTANCIA_DEMERAU_LEVENSHTEIN = 001;
   
   private @Getter InterfaceDistancia tipoEscolhido;
   private @Getter InterfaceDistancia levenshtein = new DistanciaLevenshtein(); 
   private @Getter InterfaceDistancia damerau = new DistanciaDamerau(); 
   
//Função que chamará o modo de calculo escolhido
   
   public CalculadoraDistancia(){
      
   }

   public CalculadoraDistancia(int selecao)
   {
       insereSelecao(selecao);
   }
   public int insereSelecao(int selecao){
       switch(selecao){
           case(000): 
               tipoEscolhido = new DistanciaLevenshtein(); 
               return 0;
           case(001): 
               tipoEscolhido = new DistanciaDamerau(); 
               return 1;
           default: 
               System.out.println("Valor Inválido"); 
               return -1;
       }
   }
}
