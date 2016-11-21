package com.mycompany.spellchecker.Dicionario;

import lombok.Data;
/**
 *
 * @author Bernardo
 */
@Data public class InterfaceDicionario {
    
    private static final String ARQUIVO_ZIPADO = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario\\dictionary_pt-br.zip";
    private static final String PASTA_SAIDA = "src\\main\\java\\com\\mycompany\\spellchecker\\Dicionario"; 
    private Dicionario dicionarioInterface; 
    
    public InterfaceDicionario(int codigo){
        
        Descompactador descompactador = new Descompactador(ARQUIVO_ZIPADO, PASTA_SAIDA);
        dicionarioInterface = new Dicionario(descompactador, codigo);
        
    }
    
}
