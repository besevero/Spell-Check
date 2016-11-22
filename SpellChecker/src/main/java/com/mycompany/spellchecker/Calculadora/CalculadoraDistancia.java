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
   
   private @Getter Distancia tipoEscolhido;
   //verifica se é uma opção valida;
   private boolean validador;
//Função que chamará o modo de calculo escolhido
   public CalculadoraDistancia(int selecao)
   {
       insereSelecao(selecao) ;
   }
   public boolean insereSelecao(int selecao){
       switch(selecao){
           case(000): 
               tipoEscolhido = new DistanciaLevenshtein(); 
               return validador = true;
           case(001): 
               tipoEscolhido = new DistanciaDamerau(); 
               return validador = true;
           default: 
               System.out.println("Valor Inválido"); 
               return validador = false;
       }
   }
}
