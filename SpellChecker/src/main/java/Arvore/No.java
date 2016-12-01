package Arvore;
import Calculadora.CalculadoraDistancia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Bernardo
 */
public class No {
    
        private @Getter @Setter String palavra;
	private final HashMap<Integer, No> filhos;

        /**
         * Construtor
         * @param palavra 
         */
	public No(String palavra) 
        {
            this.filhos = new HashMap<>();
            this.palavra = palavra;
	}
	/**
         * Obtem o filho na posição da distancia no hashMap
         * @param distancia
         * @return 
         */
	public No filhosDistancia(int distancia) 
        {
            return filhos.get(distancia);
	}
	/**
         * Adicionar o nó na posição do hash
         * @param posicao
         * @param noFilho
         */ 
	public void adicionaFilho(int posicao, No noFilho) 
        {
            filhos.put(posicao, noFilho);
	}
        /**
         * faz busca
         * @param no
         * @param distanciaMaxima
         * @param calculadora
         * @return 
         */ 
	public ArrayList<String> busca(String no, int distanciaMaxima, CalculadoraDistancia calculadora) 
        {
            ArrayList<String> palavrasPossiveis = new ArrayList<>();
            int distancia = (int) calculadora.getTipoEscolhido().calcular(getPalavra(), no);
            
            if(distancia <= distanciaMaxima)    palavrasPossiveis.add(palavra);
            
            if(filhos.isEmpty())    return palavrasPossiveis;
            
            for(int i = Math.max(1, distancia - distanciaMaxima); 
                    i <= distancia + distanciaMaxima; i++) 
            {
                No filho = filhos.get(i);
                if(filho != null) 
                    palavrasPossiveis.addAll(filho.busca(no, distanciaMaxima, calculadora));
            
            }
            return palavrasPossiveis;
	}
        /**
         * faz a comparação de duas strings
         * @param no
         * @return 
         */
        public boolean comparaPalavras(No no)
        {
            return palavra.equals(no.getPalavra());
	}
}

