package Calculadora;

import lombok.Data;
/**
 *
 * @author san
 */
 public @Data class DistanciaDamerau extends Distancia{
    
    /**
     * Funçao que calcula a distancia de Damerau-Levenshtein
     * @param palavraInserida
     * @param palavraDicionario
     * @return 
     */ 
    @Override
    public int calcular(String palavraInserida, String palavraDicionario)
   {
       //Variaveis que definem o tamanho da matriz
       int tamanhoPalavraInserida = palavraInserida.length(),
           tamanhoPalavraDicionario = palavraDicionario.length();
       // Variável da Matriz
        int[][] distancia = new int[tamanhoPalavraInserida+1][tamanhoPalavraDicionario+1];
      //Define o valor que irá popular a tabela da matriz
       int custoDistancia;
       
       //cria a matriz com a tabela de distancia
        for(int i = 0; i <= tamanhoPalavraInserida; i++)
       {
           distancia[i][0] = i;
       }
       for(int j = 0; j <= tamanhoPalavraDicionario; j++)
       {
           distancia[0][j] = j;
       }
       
       //popula a tabela e faz a verificação da distancia de cada letra
       
       for(int k = 1; k <= tamanhoPalavraInserida;  k++)
       {
           for(int l = 1; l <= tamanhoPalavraDicionario; l++)
           {
               if(palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-1))
                   custoDistancia = 0;

               else custoDistancia = 1;
               
               distancia[k][l] = Math.min(distancia[k-1][l]+1,
                       Math.min(distancia[k][l-1]+1,
                               distancia[k-1][l-1]+custoDistancia));
               
               if(k > 1 && l > 1
                  && palavraInserida.charAt(k-1) == palavraDicionario.charAt(l-2)
                  && palavraInserida.charAt(k-2) == palavraDicionario.charAt(l-1))
               {
                  distancia[k][l] = Math.min(distancia[k][l], distancia[k-2][l-2]+custoDistancia);
               }
           }
           
       }
       
       return distancia[tamanhoPalavraInserida][tamanhoPalavraDicionario];
   }        
}
