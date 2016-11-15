package com.mycompany.spellchecker.Dicionario;

import com.mycompany.spellchecker.Arvore.ArvoreBK;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author Bernardo
 */
public class Dicionario {
   
  private ArvoreBK dicionario; 

  public Dicionario(){}
 
  public void insercaoPorArquivo(ArrayList<String> caminhosDosArquivos, int codigo)
  {
        BufferedReader fileread;
        dicionario = new ArvoreBK(codigo);
        
        try 
        {
            for(int j = 0; j < caminhosDosArquivos.size(); j++)
            {
                fileread = new BufferedReader(new InputStreamReader(new FileInputStream(caminhosDosArquivos.get(j))));
                String linha;
                
                while( ((linha = fileread.readLine()) != null ))
                { 
                    dicionario.adicionaNo(linha.toLowerCase());
                                    }
                fileread.close();
            }
        }
        catch (FileNotFoundException ex) 
        {
            System.out.println("Erro: " + ex.getMessage());
        }
        catch (IOException ex) 
        {
            System.out.println("Erro: " + ex.getMessage());
        }
}
}
