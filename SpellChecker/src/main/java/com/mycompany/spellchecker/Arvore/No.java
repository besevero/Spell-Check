package com.mycompany.spellchecker.Arvore;
/**
 *
 * @author Bernardo
 */
public class No {
    
    private String palavra;
    private int distanciaAnterior;
    
    public No(){};
    
    //Construtor do no
    public No(String palavra, int distancia){
        //Passa a palavra para minuscula para evitar a diferença de maiusculas/minusculas
        this.palavra = palavra.toLowerCase();
        this.distanciaAnterior = distancia;
    }
    
    
 
    
}
