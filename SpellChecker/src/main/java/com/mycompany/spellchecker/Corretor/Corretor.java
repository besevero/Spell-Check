package com.mycompany.spellchecker.Corretor;

import com.mycompany.spellchecker.Arvore.ArvoreBK;
import com.mycompany.spellchecker.Arvore.No;
import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import com.mycompany.spellchecker.Dicionario.Dicionario;
import lombok.Data;


/**
 *
 * @author Bernardo
 */
@Data public class Corretor {
    
    private Dicionario dicionarioBase;
    private int codigoTipoBusca;
    
    //Inicializa o corretor com o código 
    public Corretor(int codigo, Dicionario dicionarioUsado)
    {
        this.codigoTipoBusca = codigo;
        this.dicionarioBase = dicionarioUsado;
        
    }
    
    
    public String corretorPalavras(String palavraInserida, No noAuxiliar, int precisao)
    {
      if(raiz != null){
          //faz a busca da distancia em relação a palavra inserida e compara com a precisão 
          //se achar retorna a string
          //se não achar passa para o próximo nó
      }
      
    }
      
}
