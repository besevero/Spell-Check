package com.mycompany.spellchecker.Arvore;

import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Bernardo
 */
@Data public class ArvoreBK {
    
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
	public List<String> buscaPalavra(String palavraDesejada, double distanciaMaxima) 
        {
            return raiz.busca(palavraDesejada, (int) distanciaMaxima, calculadoraDistancia);
	}
	
	/**
	 * Inclui um novo no como filho
	 */
	private void adicionaNoInterno(No noOriginal, No novoNo) 
        {
            /**
             * Verifica se o nó a ser inserido é igual ao anterior.
             * Se for, interrompe o algoritimo
             */
            if (noOriginal.equals(novoNo))
            {
                return;
            }
        //calcula a distância entre as palavras em cada nó
            double distancia = calculadoraDistancia.getTipoEscolhido().calcular(noOriginal.getPalavra(), novoNo.getPalavra());
        //Define uma variável auxiliar para fazer a busca
            No noAuxiliar = noOriginal.buscaFilho((int)distancia);
	//se o auxiliar for nulo insere o nó na árvore.
            if (noAuxiliar == null) 
            {
                noOriginal.incluirFilho((int)distancia, novoNo);
            }
        //Se não for nulo repete a operação de modo recursivo
            else
            {
               adicionaNoInterno(noAuxiliar, novoNo);
            }
	}    
    
        /**
	 * Inclui uma nova palavra na Árvore.
	 */
	public void adicionaNo(String palavraDesejada) 
        {
            //Se a raiz for nula, insere a palavra na raiz.
            No novoNo = new No(palavraDesejada);
            if (raiz == null) 
            {
		raiz = novoNo;
            }
            adicionaNoInterno(raiz, novoNo);
	}
}
