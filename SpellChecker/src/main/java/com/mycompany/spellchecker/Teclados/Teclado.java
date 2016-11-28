/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spellchecker.Teclados;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Bernardo
 */
public @Data class Teclado {
    
    private @Getter @Setter String modelo;
    private @Getter @Setter String linha;
    private @Getter @Setter String linha2;
    private @Getter @Setter String linha3;
    private @Getter @Setter double offset = 0;
    private @Getter @Setter double offset2;
    private @Getter @Setter double offset3;
    private double[][] matrizAlfabeto = new double[26][26];
    private final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";

    public Teclado() {}
    
    public Teclado(String modelo, String linha, String linha2, String linha3, double offset2, double offset3) {
        this.modelo = modelo;
        this.linha = linha;
        this.linha2 = linha2;
        this.linha3 = linha3;
        this.offset2 = offset2;
        this.offset3 = offset3;
    }
    
    public double[][] preparaDistanciasNeutro()
    {
        for(int i = 0; i < ALFABETO.length() ; i++)
        {
            for(int j = 0 ; j < ALFABETO.length() ; j++)
            {
                if(i == j) matrizAlfabeto[i][j] = 0;
                else matrizAlfabeto[i][j] = 1;
            }
        }
        return matrizAlfabeto;
    }
    //faz a leitura das linhas e insere em uma matriz.
    public char[][] preparaMatrizAlfabetoTeclado()
    {
        char[][] matrizAlfabetoTeclado = new char[3][10];
        
        for(int i = 0 ; i < linha.length() ; i++)
        {
            matrizAlfabetoTeclado[0][i] = linha.charAt(i);
        }
        for(int i = 0 ; i < linha2.length() ; i++)
        {
            matrizAlfabetoTeclado[1][i] = linha2.charAt(i);
        }
        for(int i = 0 ; i < linha3.length() ; i++)
        {
            matrizAlfabetoTeclado[2][i] = linha3.charAt(i);
        }
        return matrizAlfabetoTeclado;
    }
    
    //cria uma matriz com as distâncias entre as letras com base em cada layout de teclado
    public double[][] preparaDistancias()
    {
       char[][] matrizAlfabetoTeclado = preparaMatrizAlfabetoTeclado();
        
        //Popula a matriz com as distancias
        for (int i = 0; i < ALFABETO.length(); i++) 
        {
            for (int j = 0; j < ALFABETO.length(); j++) 
            {
                int indiceIx = 0, indiceIy = 0, indiceJx = 0, indiceJy = 0;
                double offsetX = 0, offsetY = 0;
                if(i==j) matrizAlfabeto[i][j] = 0;
                if (i != j)
                {
                    //percorre o teclado e obtem o indice das letras
                    for (int k = 0; k < 3; k++) 
                    {
                        for (int l = 0; l < 10; l++) 
                        {
                            if (matrizAlfabetoTeclado[k][l] == ALFABETO.charAt(i)) 
                            {
                                indiceIx = k;
                                indiceIy = l;
                            }
                            if (matrizAlfabetoTeclado[k][l] == ALFABETO.charAt(j)) 
                            {
                                indiceJx = k;
                                indiceJy = l;
                            }
                        }
                    }
                    //define o offset conforme a linha onde o caracter está localizado
                    if(indiceIx == 0) offsetX = getOffset();
                    if(indiceIx == 1) offsetX = getOffset2();
                    if(indiceIx == 2) offsetX = getOffset3();

                    if(indiceJx == 0) offsetY = getOffset();
                    if(indiceJx == 1) offsetY = getOffset2();
                    if(indiceJx == 2) offsetY = getOffset3();
                }
                //Faz a triangulação das posições conforme os indices e define na posição do alfabeto
                matrizAlfabeto[i][j] = Math.sqrt(Math.pow((indiceIx - indiceJx), 2)
                        + Math.pow((indiceIy + offsetX - indiceJy + offsetY), 2));
            }
        }   
            
        return matrizAlfabeto;
    }
   public double obtemDistanciaNominal(char a, char b)
   {
       a = Character.toLowerCase(a);
       b = Character.toLowerCase(b);
       int posicaoA = 0, posicaoB = 0;
       
       for (int i = 0; i < ALFABETO.length(); i++)
       {
           if(a == ALFABETO.charAt(i)) posicaoA = i;
       }
       for (int j = 0; j < ALFABETO.length(); j++)
       {
           if(b == ALFABETO.charAt(j)) posicaoB = j;
       }
       return matrizAlfabeto[posicaoA][posicaoB];
   }
}
