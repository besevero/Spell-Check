package Teclados;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import lombok.Getter;

/**
 *
 * @author Bernardo
 */
public class LeitorTeclados {
    
    private @Getter final ArrayList<Teclado> listagemTeclados = new ArrayList<>();
    
    public LeitorTeclados(){}
    /**
     * Faz a leitura do XML
     * @return 
     */ 
    public ArrayList<Teclado> leitorTeclados() 
    {
        try 
        {
            File arquivoXML = new File("src\\main\\java\\Teclados\\Teclados.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = dBuilder.parse(arquivoXML);
            documento.getDocumentElement().normalize();

            NodeList nList = documento.getElementsByTagName("layout");

            for (int i = 0; i < nList.getLength(); i++)
            {
                Node nNode = nList.item(i);
               if (nNode.getNodeType() == Node.ELEMENT_NODE)
               {
                    Teclado teclado = new Teclado();
                    Element eElement = (Element) nNode;
               
                    teclado.setModelo(eElement.getAttribute("model"));
                                
                    for (int j = 0; j < 3; j++)
                    {
			Linha letras = new Linha();
			String caracteres = eElement.getElementsByTagName("line")
                                .item(j).getTextContent();
			
                        letras.setLinhaLetras(caracteres);
			
                        teclado.getLinhas().add(letras);
        		
                        String offset = "" + eElement.getElementsByTagName("line")
                                .item(j).getAttributes().getNamedItem("offset");
                        
			if (!offset.equals("null")){
                            letras.setOffset(0);
                        }
                    }
                    listagemTeclados.add(teclado);
		}
            }
	}catch (Exception e) 
    {
	e.printStackTrace();
    }
         return listagemTeclados;
    }
    
}

