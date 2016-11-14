package com.mycompany.spellchecker.Dicionario;

import com.mycompany.spellchecker.Arvore.ArvoreBK;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class Dicionario {
   
  private ArvoreBK dicionario; 

  public Dicionario(){}
  
  public void insercao(String caminho, int codigo)
  {
        BufferedReader fileread;
        dicionario = new ArvoreBK(codigo);
        try 
        {
            fileread = new BufferedReader(new InputStreamReader(new FileInputStream(caminho)));
            String linha;
            while((linha = fileread.readLine()) != null)
            { 
                dicionario.adicionaNo(linha.toLowerCase());
            }
            fileread.close();
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
