package com.mycompany.spellchecker.Arvore;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class ArvoreBK {
    
    private No raiz;
    //Seleciona o tipo de distancia a ser utilizada
    private CalculadoraDistancia calculadoraDistancia;

    /**
     * Construtor cria uma arvore com base na distancia de Levenshtein (codigo = 000)
     * ou com base em Damerau-Levenshtein (codigo = 001)
     */
    
    public ArvoreBK(int codigo) 
    {
        this.calculadoraDistancia = new CalculadoraDistancia(codigo) ;
    }
    
    /**
    * executa busca
    */
	public List<String> pesquisa(String palavraDesejada, int distanciaMaxima) 
        {
            return raiz.busca(palavraDesejada, distanciaMaxima, calculadoraDistancia);
	}
	
	/**
	 * Inclui uma nova palavra na Árvore.
	 */
	public void adicionaNo(String palavraDesejada) 
        {
            No novoNo = new No(palavraDesejada);
            if (raiz == null) 
            {
		raiz = novoNo;
            }
            adicionaNoInterno(raiz, novoNo);
	}

	/**
	 * Inclui um novo no como filho
	 */
	private void adicionaNoInterno(No noOriginal, No novoNo) 
        {
            if (noOriginal.equals(novoNo))
            {
                return;
            }
         
            int distancia = calculadoraDistancia.getTipoEscolhido().calcular(noOriginal.getPalavra(), novoNo.getPalavra());
            No noAuxiliar = noOriginal.buscaFilho(distancia);
	
            if (noAuxiliar == null) 
            {
                noOriginal.incluirFilho(distancia, novoNo);
            }
            else
            {
               adicionaNoInterno(noAuxiliar, novoNo);
            }
	}    
    
    
}
