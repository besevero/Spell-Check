/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclados;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe feita para inserir as linhas lidas do teclado
 * @author Bernardo
 */
class Linha {

    private @Getter @Setter String linhaLetras;
    private @Getter @Setter double offset;

    /**
     * Construtor
     */
    public Linha(){
    }    
}
