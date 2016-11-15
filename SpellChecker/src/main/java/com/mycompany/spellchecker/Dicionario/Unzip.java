package com.mycompany.spellchecker.Dicionario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/**
 *
 * @author Bernardo
 */
public class Unzip {
     
    
    
    /**
     * Função que retira o arquivo do zip
     */
    public ArrayList<String> unZip(String arquivoZipado, String pastaSaida)
    {

     byte[] buffer = new byte[1024];

     ArrayList<String> caminhoArquivos = new ArrayList<String>();
     
     try{

    	//Cria um diretório de saida, caso ele não exista
    	File pasta = new File(pastaSaida);
    	if(!pasta.exists())
        {
            pasta.mkdir();
    	}

    	//obtem o conteúdo do zip
    	ZipInputStream zip =
    		new ZipInputStream(new FileInputStream(arquivoZipado));
    	//obtem alista de entrada do aquivo zipado
    	ZipEntry entradaZip = zip.getNextEntry();

    	while(entradaZip!=null)
        {
    	   String nomeArquivo = entradaZip.getName();
           File novoArquivo = new File(pastaSaida + File.separator + nomeArquivo);
           caminhoArquivos.add(pastaSaida + File.separator + nomeArquivo);
           //cria pastas não existentes
            new File(novoArquivo.getParent()).mkdirs();
            FileOutputStream streamSaida = new FileOutputStream(novoArquivo);

            int tamanho;
           
            while ((tamanho = zip.read(buffer)) > 0) 
            {
       		streamSaida.write(buffer, 0, tamanho);
            }

            streamSaida.close();
            entradaZip = zip.getNextEntry();
    	}

        zip.closeEntry();
    	zip.close();

    }catch(IOException ex)
    {
       ex.printStackTrace();
    }
    return caminhoArquivos;
   }
    
}
