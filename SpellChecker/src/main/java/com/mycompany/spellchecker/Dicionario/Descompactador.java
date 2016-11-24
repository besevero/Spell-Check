package com.mycompany.spellchecker.Dicionario;

import lombok.Data;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 * Classe para fazer interface entre o unzip e o dicionario.
 */
@Data public class Descompactador {

    private ArrayList<String> caminhos;
    
    public Descompactador(String arquivoZipado, String pastaSaida)
    {
        Unzip descompactar = new Unzip();
        this.caminhos = descompactar.unZip(arquivoZipado, pastaSaida);
    }
}
