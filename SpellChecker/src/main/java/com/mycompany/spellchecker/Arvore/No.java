package com.mycompany.spellchecker.Arvore;
import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import static java.lang.Math.max;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Bernardo
 */
@Data public class No {
    
    private @Getter @Setter String palavra;
    private Map<Integer, No> filhos = new HashMap<Integer, No>();
    private @Getter @Setter int codigoBusca;

    public No(String palavraInserida)
    {
        this.palavra = palavraInserida.toLowerCase();
    }

 
    //Faz a busca pelo nó filho na posição determinada
    public No buscaFilho(int posicao) 
    {
        return filhos.get(posicao);
    }
    
    //inclui um nó filho
    public void incluirFilho(int posicao, No filho)
    {
        filhos.put(posicao, filho);
    }
	
    
    public List<String> busca(String palavraDesejada, int distanciaMaxima) 
    {
	CalculadoraDistancia calculadora = new CalculadoraDistancia(codigoBusca);
        int distancia = calculadora.getTipoEscolhido().calcular(palavra, palavraDesejada);
	List<String> correspondencias = new LinkedList<String>();
    
        if (distancia <= distanciaMaxima)
        {
            correspondencias.add(palavra);
        }
        if (filhos.isEmpty())
        {
            return correspondencias;
        }
        int i = max(1, distancia - distanciaMaxima);
        
        for (; i <= distancia + distanciaMaxima; i++) 
        {
            No filho = filhos.get(i);
            if (filho == null)
            {
                continue;
            }
		correspondencias.addAll(filho.busca(palavraDesejada, distanciaMaxima));
        }
	
         return correspondencias;
    }
}
