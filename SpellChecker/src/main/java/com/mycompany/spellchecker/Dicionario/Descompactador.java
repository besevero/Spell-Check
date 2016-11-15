/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Dicionario;

import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class Descompactador {

    ArrayList<String> caminhos;
    
    public Descompactador(String arquivoZipado, String pastaSaida)
    {
        Unzip descompactar = new Unzip();
        this.caminhos = descompactar.unZip(arquivoZipado, pastaSaida);
    }
}
