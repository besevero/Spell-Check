package Corretor;

import com.mycompany.spellchecker.Arvore.ArvoreBK;
import com.mycompany.spellchecker.Arvore.No;
import com.mycompany.spellchecker.Calculadora.CalculadoraDistancia;
import com.mycompany.spellchecker.Dicionario.Dicionario;
import com.mycompany.spellchecker.Dicionario.InterfaceDicionario;
import lombok.Data;


/**
 *
 * @author Bernardo
 */
@Data public class Corretor {
    
    private Dicionario dicionarioBase;
    private int codigo;
    
    //Inicializa o corretor
    public Corretor(int codigo, InterfaceDicionario interfaceDicionario)
    {
        this.codigo = codigo;
        this.dicionarioBase = interfaceDicionario.getDicionarioInterface();
        
    }
    
    
    public String corretorPalavras(String palavraInserida, No noAuxiliar, int precisao)
    {
      
    }
      

    
}
