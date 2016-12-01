package Calculadora;

import Teclados.Teclado;

/**
 *
 * @author Bernardo
 */
public class DistanciaLevenshtein extends Distancia{

    private Teclado teclado;
    /**
     * Construtor
     * @param teclado 
     */
    public DistanciaLevenshtein(Teclado teclado){
		this.teclado = teclado;
    }
    /**
     * faz o cálculo da distancia
     * @param palavraInserida
     * @param palavraDicionario
     * @return 
     */ 
   @Override
   public int calcular(String palavraInserida, String palavraDicionario)
   {
      palavraInserida = palavraInserida.toUpperCase();
      palavraDicionario = palavraDicionario.toUpperCase();
      
      int  tamanhoPalavraInserida = palavraInserida.length(),
           tamanhoPalavraDicionario = palavraDicionario.length();
      double custoOperacao, custoDistanciaOperacao;
       double distancia[][] = new double[tamanhoPalavraInserida+1][tamanhoPalavraDicionario+1];
       
       //veriica se uma das palavras é nula
       if(tamanhoPalavraInserida == 0)  return tamanhoPalavraDicionario;
       
       if(tamanhoPalavraDicionario == 0)    return tamanhoPalavraInserida;

       //popula a matriz
       for(int i = 0 ; i <= tamanhoPalavraInserida ; i++)
       {
           distancia[i][0] = i;
       }
       for(int j = 0 ; j <= tamanhoPalavraDicionario ; j++)
       {
           distancia[0][j] = j;
       }
       for(int k = 1 ; k <= tamanhoPalavraInserida ; k++)
       {
           for(int l = 1 ; l<=tamanhoPalavraDicionario ; l++)
           {
               if(palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-1))
               {
                   custoOperacao = 0;
               }
               else custoOperacao = 1;
               
               custoDistanciaOperacao = teclado
                       .obtemDistanciaNominal(palavraInserida.charAt(k-1), palavraDicionario.charAt(l-1));
               
                distancia[k][l] = Math.min(distancia[k-1][l] + custoOperacao,
                                          Math.min(distancia[k][l-1] + custoOperacao,
                                          distancia[k-1][l-1] + custoDistanciaOperacao));
           }
           
       }
       return (int) distancia[tamanhoPalavraInserida][tamanhoPalavraDicionario];
       
       
   }
        
}
