/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Teclados;

/**
 *
 * @author Bernardo
 */
public class InterfaceTeclados {
    
    public InterfaceTeclados(){}
  /**
    *obtem o layout e prepara as distancias conforme o mesmo.
    */ 
    public double[][] prepararDistancias(Teclado layouts)
    {
        double[][] matrizAlfabeto = new double[26][26];
        switch(layouts.getModelo())
        {
            case "Neutro":
                matrizAlfabeto = layouts.preparaDistanciasNeutro();
                break;
                
            case "QWERTY":
                matrizAlfabeto = layouts.preparaDistancias();
                break;
                
            case "QWERTZ":
                matrizAlfabeto = layouts.preparaDistancias();
                break;

            case "AZERTY":
                matrizAlfabeto = layouts.preparaDistancias();
                break;
            
            case "DVORAK":
                matrizAlfabeto = layouts.preparaDistancias();
                break;
            
            case "COLEMAN":
                matrizAlfabeto = layouts.preparaDistancias();
                break;
            
            case "WORKMAN":
                matrizAlfabeto = layouts.preparaDistancias();
                break;
            
            default:
        }
        return matrizAlfabeto;
    }
}
