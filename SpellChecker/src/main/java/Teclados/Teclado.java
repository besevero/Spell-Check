/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclados;

import java.util.ArrayList;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Bernardo
 */
public @Data class Teclado {
    
    private @Getter @Setter String modelo;
    private @Getter @Setter ArrayList<Linha> linhas = new ArrayList<>();
    private double[][] matrizAlfabeto = new double[26][26];
    private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     *Construtor
     */
    public Teclado() {}
    /**
     * faz a leitura das linhas e insere em uma matriz.
     * @return 
     */
    public char[][] preparaMatrizAlfabetoTeclado()
    {
        char[][] matrizAlfabetoTeclado = new char[3][10];
        
        for(int i = 0; i < linhas.size() ; i++)
        {
            for(int j = 0; j < linhas.get(i).getLinhaLetras().length() ; j++)
            {
                matrizAlfabetoTeclado[i][j] = linhas.get(i).getLinhaLetras().charAt(j);
            }
        }
     return matrizAlfabetoTeclado;
    }
    
    /**
     * cria uma matriz com as distâncias entre as letras com base em cada layout de teclado
     * @return 
     */
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
                    if(indiceIx == 0) offsetX = linhas.get(0).getOffset();
                    if(indiceIx == 1) offsetX = linhas.get(1).getOffset();
                    if(indiceIx == 2) offsetX = linhas.get(2).getOffset();

                    if(indiceJx == 0) offsetY = linhas.get(0).getOffset();
                    if(indiceJx == 1) offsetY = linhas.get(1).getOffset();
                    if(indiceJx == 2) offsetY = linhas.get(2).getOffset();
                }
                //Faz a triangulação das posições conforme os indices e define na posição do alfabeto
                matrizAlfabeto[i][j] = Math.sqrt(Math.pow((indiceIx - indiceJx), 2)
                        + Math.pow((indiceIy + offsetX - indiceJy + offsetY), 2));
            }
        }   
        	            
        return matrizAlfabeto;
    }
    /**
     * Pega a posição das letras no alfabeto
     * e retorna o valor na posção da matriz
     * @param a
     * @param b
     * @return 
     */
   public double obtemDistanciaNominal(char a, char b)
   {
       preparaDistancias();
       if(a == b) return 0;
       else return matrizAlfabeto[a - 'A'][b - 'A'];
   }
  
}
