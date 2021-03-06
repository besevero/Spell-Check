package Dicionario;

import Arvore.ArvoreBK;
import Calculadora.CalculadoraDistancia;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import lombok.Data;
/**
 *
 * @author Bernardo
 */
@Data public class Dicionario {
   
  private ArvoreBK arvoreDicionarioBK; 
  private ArrayList<String> caminhosDosArquivos;

    /**
     * Construtor da classe
     * @param arquivoDescompactado
     * @param calculadora
     */ 
  public Dicionario(Descompactador arquivoDescompactado, CalculadoraDistancia calculadora)
  {
      this.caminhosDosArquivos = arquivoDescompactado.getCaminhos();
      this.arvoreDicionarioBK = new ArvoreBK(calculadora);
  }
 
  /**
   * Descompacta o arquivo, 
   * faz a leitura do arquivo descompactado  e
   * insere os valores na arvoreBK
   * @return 
   */
  public boolean insercaoPorArquivo()
  {     
        BufferedReader fileread;
        //Verifica se o códgo da calculadora é correto.
        if(!arvoreDicionarioBK.getCalculadora().isValidador())
        {
            //se o código não for correto, a função retorna falso e se encerra
            return false;
        }
        else
        {
            //se for válido, executa o resto da função.
            try 
            {
                for(int j = 0; j < caminhosDosArquivos.size(); j++)
                {
                    fileread = new BufferedReader(new InputStreamReader(new FileInputStream(caminhosDosArquivos.get(j))));
                    String linha;
                                        
                    while((linha = fileread.readLine()) != null )
                    {
                        linha = linha.replace("'", "");
                        linha = linha.replace("-", "");
                        linha = linha.replace(".","");
                        linha = linha.replace(",", "");
                        linha = linha.replace(" ", "");
                        linha = linha.replace("ç", "c");
                        arvoreDicionarioBK.adicionaNo(linha);
                        
                    }
                    fileread.close();
                }
            }
            catch (FileNotFoundException ex) 
            {
                System.out.println("Erro: " + ex.getMessage());
                return false;
            }
            catch (IOException ex) 
            {
                System.out.println("Erro: " + ex.getMessage());
                return false;
            }
            
            return true;
        }
    }
}
