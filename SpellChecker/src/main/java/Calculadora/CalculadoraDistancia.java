/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Teclados.Teclado;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author san
 */
@Data public final class CalculadoraDistancia {
   
   private final int DISTANCIA_LEVENSHTEIN = 000;
   private final int DISTANCIA_DEMERAU_LEVENSHTEIN = 001;
   
   private @Getter Distancia tipoEscolhido;
   private @Getter @Setter Teclado teclado;

    /**
     * verifica se é uma opção valida;
     */ 
   private boolean validador;

    /**
     * Construtor.
     * @param selecao
     * @param teclado
     */ 
   public CalculadoraDistancia(int selecao, Teclado teclado)
   {
       insereSelecao(selecao) ;
       this.teclado = teclado;
       
   }
    /**
     * Função que chamará o modo de calculo escolhido
     * @param selecao
     * @return 
     */ 
   public boolean insereSelecao(int selecao){
       switch(selecao){
           case(000): 
               tipoEscolhido = new DistanciaLevenshtein(teclado); 
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
