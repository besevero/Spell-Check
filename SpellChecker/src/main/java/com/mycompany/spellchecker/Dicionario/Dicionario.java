package com.mycompany.spellchecker.Dicionario;

import com.mycompany.spellchecker.Arvore.ArvoreBK;
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
   
  private ArvoreBK dicionarioBK; 
  private ArrayList<String> caminhosDosArquivos;

  public Dicionario(Descompactador arquivoDescompactado, int codigo){
      this.caminhosDosArquivos = arquivoDescompactado.getCaminhos();
      this.dicionarioBK = new ArvoreBK(codigo);
  }
 
  public boolean insercaoPorArquivo()
  {
        BufferedReader fileread;
        if(!dicionarioBK.getCalculadoraDistancia().isValidador())
        {
            return false;
        }
        else
        {
            try 
            {
                for(int j = 0; j < caminhosDosArquivos.size(); j++)
                {
                    fileread = new BufferedReader(new InputStreamReader(new FileInputStream(caminhosDosArquivos.get(j))));
                    String linha;

                    while((linha = fileread.readLine()) != null )
                    { 
                        dicionarioBK.adicionaNo(linha.toLowerCase());
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
