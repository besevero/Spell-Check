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
    private Map<Double, No> filhos = new HashMap<>();

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
    public void incluirFilho(double posicao, No filho)
    {
        filhos.put(posicao, filho);
    }
	
    //faz a busca entre os nós    
    public List<String> busca(String palavraDesejada, int distanciaMaxima, CalculadoraDistancia calculadora) 
    {
	double distancia = calculadora.getTipoEscolhido().calcular(palavra, palavraDesejada);
	List<String> palavrasCorrespondentes = new LinkedList<>();
    //se encontrar insere a palavra na lista de palavras correspondentes
        if (distancia <= distanciaMaxima)
        {
            palavrasCorrespondentes.add(palavra);
        }
    //se não houver mais filhos encerra o programa    
        if (filhos.isEmpty())
        {
            return palavrasCorrespondentes;
        }
        
    //Define o espaço inicial da busca
        int i = (int) max(1, distancia - distanciaMaxima);
    //faz a busca
        for (; i <= distancia + distanciaMaxima; i++) 
        {
            No filho = filhos.get(i);
            if (filho == null)
            {
                continue;
            }
            //Se encontrar, adiciona na lista de palavras correspondentes.
		palavrasCorrespondentes.addAll(filho.busca(palavraDesejada, distanciaMaxima, calculadora));
        }
	
         return palavrasCorrespondentes;
    }
}
