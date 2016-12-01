package Arvore;

import Calculadora.CalculadoraDistancia;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Bernardo
 */
@Data public class ArvoreBK {
    private No raiz;
    private CalculadoraDistancia calculadora;

        /**
         * Construtor da classe
         * @param calculadora 
         */
	public ArvoreBK(CalculadoraDistancia calculadora)
        {
		this.calculadora = calculadora;
	}

	/**
         * Adiciona no na árvore
         * @param no
         */
	public void adicionaNo(String no)
        {
            if (no == null || no.isEmpty()) {}
            else
            {
                No novoNo = new No(no);
                if(raiz == null) raiz = novoNo;
                else adicionaNoInterno(raiz, novoNo);
            }
	}

	/**
         * Adiciona lista de palavras na árvore
         * @param nos
         */
	 public void adicionaNoLista(List<String> nos)
         {
             for(String no : nos)
             {
                 adicionaNo(no);
             }
	}

	/**
         * Adiciona nó interno na árvore
         */
	private void adicionaNoInterno(No noOriginal, No noNovo) 
        {
            if (noOriginal.equals(noNovo)) return;
            
            int distancia = (int) calculadora.getTipoEscolhido()
                    .calcular(noOriginal.getPalavra(), noNovo.getPalavra());
            
            No noBK = noOriginal.filhosDistancia(distancia);
            
            if (noBK == null) noOriginal.adicionaFilho(distancia, noNovo);
            
            else    adicionaNoInterno(noBK, noNovo);
        }
}
