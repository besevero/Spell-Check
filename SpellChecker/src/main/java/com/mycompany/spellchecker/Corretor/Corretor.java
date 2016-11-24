package com.mycompany.spellchecker.Corretor;

import com.mycompany.spellchecker.Arvore.No;
import com.mycompany.spellchecker.Dicionario.Dicionario;
import lombok.Data;

/**
 *
 * @author Bernardo
 */
@Data public class Corretor {
    
    private Dicionario dicionarioBase;
    
    //Inicializa o corretor com o código 
    public Corretor(Dicionario dicionarioUsado)
    {
        this.dicionarioBase = dicionarioUsado;
        
    }
        
    public String corretorPalavras(String palavraInserida, No noAuxiliar, int precisao)
    {
      if(noAuxiliar != null)
      {
            //faz a busca da distancia em relação a palavra inserida e compara com a precisão 
            if (dicionarioBase.getArvoreDicionarioBK().getCalculadoraDistancia()
                   .getTipoEscolhido().calcular(palavraInserida, noAuxiliar.getPalavra())
                    <= precisao) 
            {
                String palavraCorrigida = noAuxiliar.getPalavra();
                return palavraCorrigida;
            }
          
          else
          {
              double distancia = dicionarioBase.getArvoreDicionarioBK().getCalculadoraDistancia()
                    .getTipoEscolhido().calcular(palavraInserida, noAuxiliar.getPalavra());
                
              No novoNoAuxiliar = noAuxiliar.buscaFilho((int) distancia);
            
              return corretorPalavras(palavraInserida, novoNoAuxiliar, precisao);
           }
        }
        else
        {
            return "Palavra não encontrada.";
        }
    }
    

}
    
       