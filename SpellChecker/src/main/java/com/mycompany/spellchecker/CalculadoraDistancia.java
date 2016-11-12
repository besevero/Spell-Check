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
public class CalculadoraDistancia {
   
   private final int DISTANCIA_LEVENSHTEIN = 000;
   private final int DISTANCIA_DEMERAU_LEVENSHTEIN = 001;
   
   private InterfaceDistancia tipoEscolhido; 
   
   //Função que chamará o modo de calculo escolhido
   public CalculadoraDistancia(int selecao){
       if(selecao == DISTANCIA_LEVENSHTEIN){
           tipoEscolhido = new DistanciaLevenshtein();
       }
       if(selecao == DISTANCIA_DEMERAU_LEVENSHTEIN){
           tipoEscolhido = new DistanciaDamerau();
       }
   }

    /**
     * @return the tipoEscolhido
     */
    public InterfaceDistancia getTipoEscolhido() {
        return tipoEscolhido;
    }
   
   
   
   
}
