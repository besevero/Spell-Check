/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corretor;

import Arvore.ArvoreBK;
import Arvore.No;
import Teclados.Teclado;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Bernardo
 */
public class Corretor {
    
    private @Getter @Setter ArvoreBK dicionario;
    private @Getter @Setter Teclado tecladoEscolhido;
    /**
     * Construtor da classe
     * @param dicionario
     * @param tecladoEscolhido 
     */
    public Corretor(ArvoreBK dicionario, Teclado tecladoEscolhido)
    {
        this.dicionario = dicionario;
        this.tecladoEscolhido = tecladoEscolhido;
    }
    
    /**
     * Função que faz a correção
     * @param palavraErrada
     * @param noReferencial
     * @param taxaDeErro
     * @return 
     */
    public String corrigir(String palavraErrada, No noReferencial, int taxaDeErro) {

        int distancia = (int) (dicionario.getCalculadora().getTipoEscolhido()
                .calcular(palavraErrada, noReferencial.getPalavra())*100);
        No proximoNo = noReferencial.filhosDistancia(distancia);
       
        if (distancia <= taxaDeErro) return noReferencial.getPalavra();
        else
        {
            if (proximoNo != null) return corrigir(palavraErrada, proximoNo, taxaDeErro);
            else return "Correção não encontrada";
        }
    }
}