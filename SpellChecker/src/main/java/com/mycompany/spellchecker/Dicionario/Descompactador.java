package com.mycompany.spellchecker.Dicionario;

import lombok.Data;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
@Data public class Descompactador {

    private ArrayList<String> caminhos;
    
    public Descompactador(String arquivoZipado, String pastaSaida)
    {
        Unzip descompactar = new Unzip();
        this.caminhos = descompactar.unZip(arquivoZipado, pastaSaida);
    }
}
